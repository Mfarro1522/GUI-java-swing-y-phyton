package Clases;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;




public class Agenda {

    private List<Contacto> contactos;
    private int contadorArchivos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public boolean aniadirContacto(Contacto c) {
        if (!contactos.contains(c)) {
            contactos.add(c);
            return true;
        }
        return false;
    }

    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    public String listarContactos() {
        String todosContactos = "";
        for (Contacto c : contactos) {
            todosContactos +=  c.getNombre() +","+ c.getTelefono() +"\n";
        }
        return todosContactos;
    }

    public void buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                System.out.println("Teléfono de " + nombre + ": " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public boolean eliminarContacto(Contacto c) {
        return contactos.remove(c);
    }

    public boolean agendaLlena() {
        return contactos.size() >= 100; // Suponiendo un límite de 100 contactos
    }

    public int huecosLibres() {
        return 100 - contactos.size();
    }
    
    public void exportarContactos (){
        //Generacion del Archivo   
        String nombreArchivo = nombreArchivoSiguiente();
        File archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                //escribir en el archivo
                boolean anexar = archivo.exists();
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
                salida.println(listarContactos());
                salida.close();
                System.out.println("Contactos Exportados");
            }
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    
    }
    
    public String nombreArchivoSiguiente(){
        
        int c = 1;
        String nombreArchivo;
        File archivo;
        
        do {
        nombreArchivo = String.format("contactos%01d.txt", c);
        archivo = new File(nombreArchivo);
        c++;
            
        } while (archivo.exists());
        

        return nombreArchivo;
    }
    
    public int contarArchivos(){
        
        int c = 1;
        String nombreArchivo;
        File archivo;
        
       do {
        nombreArchivo = String.format("contactos%01d.txt", c);
        archivo = new File(nombreArchivo);
        c++;
            
        } while (archivo.exists());
       
        contadorArchivos=c-2;
        return contadorArchivos;
        
    }
    


/* Explicacion del Formato
"contactos%03d.txt":
Es la plantilla o patrón donde:

contactos - texto literal que aparecerá tal como está
%03d - es el especificador de formato para el número
.txt - texto literal que aparecerá tal como está
Desglose de %03d:
% - indica que empieza un especificador de formato
0 - significa "rellenar con ceros a la izquierda"
3 - el número total de dígitos que debe tener
d - indica que es un número entero decimal
, c:
Es el valor que se insertará en lugar de %03d
*/

    public void importarContactos (){
        contarArchivos();
        try {
            List<String> lineas = Files.readAllLines(Paths.get("contactos"+contadorArchivos+".txt"));
            
            for (String linea : lineas) {
                
                String [] PartesDelinea = linea.split(",");

                if (PartesDelinea.length >= 2) {
                    String nombre = PartesDelinea[0];
                    String numero = PartesDelinea[1];
                    aniadirContacto(new Contacto(nombre, numero));
                }
            }
        
        } catch (IOException ex) {
            System.out.println("no encontro el archivo");
        }

    }

}