package capaDatos;

import capaLogica.Estudiantes;

/**
 *
 * @author mauricio
 */
public class EstudiantesDao {
    
    private static Estudiantes[] objeto = new Estudiantes[0];
    private static int cantidad;

    public EstudiantesDao() {
        cantidad = 0;
    }

    public static void agregar(Estudiantes estudiante) {
        estudiante.setNombres(estudiante.getNombres().toUpperCase());
        Estudiantes[] nuevoArray = new Estudiantes[objeto.length + 1];
        for (int i = 0; i < objeto.length; i++) {
            nuevoArray[i] = objeto[i];
        }
        nuevoArray[objeto.length] = estudiante;
        objeto = nuevoArray;
        cantidad++;
    }

    public static boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }
        
        Estudiantes[] nuevoArray = new Estudiantes[objeto.length - 1];
        
        for (int i = 0; i < indice; i++) {
            nuevoArray[i] = objeto[i];
        }
        
        for (int i = indice; i < cantidad - 1; i++) {
            nuevoArray[i] = objeto[i + 1];
        }

        objeto = nuevoArray;
        cantidad--;
        return true;
    }

    public static Estudiantes[] obtener() {
        return objeto;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static Estudiantes getElemento(int index) {
        int pos = -1;

        for (int i = 0; i < cantidad; i++) {
            if (i == index) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            return objeto[index];
        } else {
            return null;
        }
    }

    public static Estudiantes buscarPorId(String id) {
        if (id == null) {
            return null;
        }
        for (int i = 0; i < cantidad; i++) {
            if (objeto[i] != null && id.equals(objeto[i].getId())) {
                return objeto[i];
            }
        }
        return null;
    }
    
    public static int buscarIndicePorId(String id) {
        if (id == null) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (objeto[i] != null && id.equals(objeto[i].getId())) {
                return i;
            }
        }
        return -1;
    }

    public static boolean validarAgregar(String id, String nombres) {
        if (id == null || id.trim().isEmpty()) {
            return false;
        }
        if (nombres == null || nombres.trim().isEmpty()) {
            return false;
        }
        if (buscarPorId(id) != null) {
            return false;
        }
        return true;
    }

    public static boolean actualizar(String idOriginal, Estudiantes estudianteActualizado) {
        int index = buscarIndicePorId(idOriginal);
        if (index != -1) {
            objeto[index] = estudianteActualizado;
            return true;
        }
        return false;
    }

}
