package capaDatos;

import CapaLogica.*;

/**
 *
 * @author mauricio
 */
public class clsMarcaDao {

    private static clsMarca[] objeto = new clsMarca[20];
    private static int cantidad = 0;

    public static void agregar(clsMarca usr) {
        usr.setNombre(usr.getNombre().toUpperCase());
        objeto[cantidad] = usr;
        cantidad++;
    }

    public static boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }
        for (int i = indice; i < cantidad - 1; i++) {
            objeto[i] = objeto[i + 1];
        }
        objeto[cantidad - 1] = null;
        cantidad--;
        return true;
    }

    public static clsMarca[] obtener() {
        return objeto;
    }

    public static int getCantidad() {
        return cantidad;
    }

    // Obtiene un elemento por su índice
    public static clsMarca getElemento(int index) {
        if (index >= 0 && index < cantidad) {
            return objeto[index];
        }
        return null;
    }

    public static clsMarca buscarPorCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        for (int i = 0; i < cantidad; i++) {
            if (objeto[i] != null && codigo.equals(objeto[i].getCodigo())) {
                return objeto[i];
            }
        }
        return null;
    }

    public static int buscarIndicePorCodigo(String codigo) {
        if (codigo == null) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (objeto[i] != null && codigo.equals(objeto[i].getCodigo())) {
                return i;
            }
        }
        return -1;
    }

    public static boolean validarAgregar(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        if (buscarPorCodigo(codigo) != null) {
            return false;
        }
        return true;
    }

    public static boolean actualizar(String codigoOriginal, clsMarca marcaActualizada) {
        int index = buscarIndicePorCodigo(codigoOriginal);
        if (index != -1) {
            objeto[index] = marcaActualizada;
            return true;
        }
        return false;
    }

    public static boolean darBaja(String codigo) {
        clsMarca marca = buscarPorCodigo(codigo);
        if (marca != null) {
            marca.setEstado(false);
            return true;
        }
        return false;
    }

}
