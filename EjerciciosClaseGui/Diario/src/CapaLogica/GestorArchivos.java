package CapaLogica;

import capaDatos.Nota;
import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author mauricio
 */
public class GestorArchivos {

    private String rutaCarpeta;
    private List<Nota> notasCache;

    public GestorArchivos(String rutaCarpeta) {
        this.rutaCarpeta = rutaCarpeta;
        this.notasCache = new ArrayList<>();
        crearCarpetaSiNoExiste();
    }

    private void crearCarpetaSiNoExiste() {
        Path carpeta = Paths.get(rutaCarpeta);
        try {
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Nota> listar() {
        notasCache.clear();
        try {
            File carpeta = new File(rutaCarpeta);
            File[] archivos = carpeta.listFiles((dir, name) -> name.endsWith(".txt"));

            if (archivos != null) {
                // Ordenar los archivos por nombre (orden cronológico automático)
                // Orden descendente: archivos más recientes primero
                Arrays.sort(archivos, Comparator.comparing(File::getName).reversed());

                for (File archivo : archivos) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                        String titulo = reader.readLine();
                        String fecha = reader.readLine();
                        if (titulo == null) {
                            titulo = "Sin título";
                        }
                        if (fecha == null) {
                            fecha = "";
                        }
                        Nota nota = new Nota(titulo, "", archivo.getName(), fecha);
                        notasCache.add(nota);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notasCache;
    }

    public boolean guardar(String titulo, String contenido) {
        try {
            // Validaciones
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new IllegalArgumentException("El título no puede estar vacío");
            }

            // Generar nombre del archivo con fecha y hora actual
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String nombreArchivo = sdf.format(new Date()) + ".txt";

            Path rutaArchivo = Paths.get(rutaCarpeta, nombreArchivo);

            // Esperar un milisegundo si el archivo ya existe para evitar duplicados
            File archivo = rutaArchivo.toFile();
            int contador = 0;
            while (archivo.exists() && contador < 10) {
                Thread.sleep(10);
                nombreArchivo = sdf.format(new Date()) + "_" + contador + ".txt";
                rutaArchivo = Paths.get(rutaCarpeta, nombreArchivo);
                archivo = rutaArchivo.toFile();
                contador++;
            }

            // Escribir el contenido en el archivo
            SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String fechaActual = sdfFecha.format(new Date());

            StringBuilder contenidoCompleto = new StringBuilder();
            contenidoCompleto.append(titulo).append("\n")
                    .append(fechaActual).append("\n")
                    .append(contenido);

            Files.write(rutaArchivo, contenidoCompleto.toString().getBytes());

            return true;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Nota leer(String nombreArchivo) {
        try {
            Path rutaArchivo = Paths.get(rutaCarpeta, nombreArchivo);
            String contenido = new String(Files.readAllBytes(rutaArchivo));

            String[] lineas = contenido.split("\n", 3);
            String titulo = lineas.length > 0 ? lineas[0] : "Sin título";
            String fecha = lineas.length > 1 ? lineas[1] : "";
            String cuerpo = lineas.length > 2 ? lineas[2] : "";

            return new Nota(titulo, cuerpo, nombreArchivo, fecha);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Búsqueda BINARIA optimizada de notas por título.
     * 
     */
    public List<Nota> buscarBinaria(String termino) {
        List<Nota> resultados = new ArrayList<>();

        if (notasCache.isEmpty()) {
            listar();
        }

        // Ordena las notas por título para la búsqueda binaria
        List<Nota> notasOrdenadas = new ArrayList<>(notasCache);
        notasOrdenadas.sort(Comparator.comparing(Nota::getTitulo));

        // Búsqueda binaria para encontrar la posición inicial
        int inicio = buscarPosicion(notasOrdenadas, termino);

        // Recopilar todos los resultados que coincidan con el término (búsqueda
        // parcial)
        if (inicio >= 0) {
            for (int i = inicio; i < notasOrdenadas.size(); i++) {
                String titulo = notasOrdenadas.get(i).getTitulo().toLowerCase();
                if (titulo.startsWith(termino.toLowerCase())) {
                    resultados.add(notasOrdenadas.get(i));
                } else if (titulo.compareTo(termino.toLowerCase()) > 0) {
                    break; // Salir si ya pasamos el rango
                }
            }
        }

        return resultados;
    }

    /**
    
     */
    private int buscarPosicion(List<Nota> notas, String termino) {
        int izquierda = 0;
        int derecha = notas.size() - 1;
        int resultado = -1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            String titulo = notas.get(medio).getTitulo().toLowerCase();

            if (titulo.startsWith(termino.toLowerCase())) {
                resultado = medio;
                derecha = medio - 1; // Buscar más a la izquierda para encontrar el primer resultado
            } else if (titulo.compareTo(termino.toLowerCase()) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return resultado;
    }

    /**
    
     */
    public boolean eliminar(String nombreArchivo) {
        try {
            Path rutaArchivo = Paths.get(rutaCarpeta, nombreArchivo);
            Files.delete(rutaArchivo);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
