package CapaLogica;

public class ListaEnlazadaProducto {

    private NodoProducto inicio;
    private int cantidad;

    public ListaEnlazadaProducto() {
        this.inicio = null;
        this.cantidad = 0;
    }

    // Clase interna para el nodo
    private class NodoProducto {
        clsProducto dato;
        NodoProducto siguiente;

        NodoProducto(clsProducto dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Agregar producto al final de la lista
    public void agregar(clsProducto producto) {
        NodoProducto nuevoNodo = new NodoProducto(producto);
        
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoProducto actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        cantidad++;
    }

    // Eliminar producto por índice
    public boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }

        if (indice == 0) {
            inicio = inicio.siguiente;
        } else {
            NodoProducto actual = inicio;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
        }
        cantidad--;
        return true;
    }

    // Obtener un producto por índice
    public clsProducto getElemento(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return null;
        }

        NodoProducto actual = inicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    // Obtener la cantidad de productos
    public int getCantidad() {
        return cantidad;
    }

    // Buscar producto por código
    public clsProducto buscarPorCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }

        NodoProducto actual = inicio;
        while (actual != null) {
            if (codigo.equals(actual.dato.getCodigo())) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Buscar el índice de un producto por código
    public int buscarIndicePorCodigo(String codigo) {
        if (codigo == null) {
            return -1;
        }

        NodoProducto actual = inicio;
        int indice = 0;
        while (actual != null) {
            if (codigo.equals(actual.dato.getCodigo())) {
                return indice;
            }
            actual = actual.siguiente;
            indice++;
        }
        return -1;
    }

    // Actualizar un producto
    public boolean actualizar(String codigoOriginal, clsProducto productoActualizado) {
        int indice = buscarIndicePorCodigo(codigoOriginal);
        if (indice != -1) {
            NodoProducto actual = inicio;
            for (int i = 0; i < indice; i++) {
                actual = actual.siguiente;
            }
            actual.dato = productoActualizado;
            return true;
        }
        return false;
    }

    // Dar de baja un producto (cambiar estado a false)
    public boolean darBaja(String codigo) {
        clsProducto producto = buscarPorCodigo(codigo);
        if (producto != null) {
            producto.setEstado(false);
            return true;
        }
        return false;
    }

    // Validar antes de agregar
    public boolean validarAgregar(String codigo, String nombre, double precio) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        if (precio < 0) {
            return false;
        }
        if (buscarPorCodigo(codigo) != null) {
            return false;
        }
        return true;
    }

    // Obtener todos los productos como array
    public clsProducto[] obtenerTodos() {
        if (cantidad == 0) {
            return new clsProducto[0];
        }

        clsProducto[] productos = new clsProducto[cantidad];
        NodoProducto actual = inicio;
        int indice = 0;

        while (actual != null) {
            productos[indice] = actual.dato;
            actual = actual.siguiente;
            indice++;
        }
        return productos;
    }

    // Limpiar la lista
    public void limpiar() {
        inicio = null;
        cantidad = 0;
    }
}
