package capaDatos;

import CapaLogica.clsCategoria;

public class clsCategoriaDao {

    private static clsCategoria[] objeto = new clsCategoria[0];
    private static int cantidad;

    public clsCategoriaDao() {
        cantidad = 0;
    }

    public static void agregar(clsCategoria categoria) {
        categoria.setNombre(categoria.getNombre().toUpperCase());
        clsCategoria[] nuevoArray = new clsCategoria[objeto.length + 1];
        for (int i = 0; i < objeto.length; i++) {
            nuevoArray[i] = objeto[i];
        }
        nuevoArray[objeto.length] = categoria;
        objeto = nuevoArray;
        cantidad++;
    }

    public static boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }

        clsCategoria[] nuevoArray = new clsCategoria[objeto.length - 1];

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

    public static clsCategoria[] obtener() {
        return objeto;
    }

    public static int getCantidad() {
        return cantidad;
    }

    // Obtiene un elemento por su índice
    public static clsCategoria getElemento(int index) {
        if (index >= 0 && index < cantidad) {
            return objeto[index];
        }
        return null;
    }

    public static clsCategoria buscarPorCodigo(String codigo) {
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

    public static boolean actualizar(String codigoOriginal, clsCategoria categoriaActualizada) {
        int index = buscarIndicePorCodigo(codigoOriginal);
        if (index != -1) {
            objeto[index] = categoriaActualizada;
            return true;
        }
        return false;
    }

    public static boolean darBaja(String codigo) {
        clsCategoria categoria = buscarPorCodigo(codigo);
        if (categoria != null) {
            categoria.setEstado(false);
            return true;
        }
        return false;
    }

}
