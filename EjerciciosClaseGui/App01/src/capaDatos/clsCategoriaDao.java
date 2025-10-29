package capaDatos;

import CapaLogica.clsCategoria;


public class clsCategoriaDao {
    
    private static clsCategoria[] objeto = new clsCategoria[20];
    private static int cantidad;

    public clsCategoriaDao() {
        cantidad = 0;
    }

    public static void agregar(clsCategoria categoria) {
        categoria.setNombre(categoria.getNombre().toUpperCase());
        objeto[cantidad] = categoria;
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

    public static clsCategoria[] obtener() {
        return objeto;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static clsCategoria getElemento(int index) {
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
