package CapaLogica;

public class ListaEnlazadaProducto {

    private NodoProducto inicio;
    private int cantidad;

    public ListaEnlazadaProducto() {
        this.inicio = null;
        this.cantidad = 0;
    }


    private class NodoProducto {
        clsProducto dato;
        NodoProducto siguiente;

        NodoProducto(clsProducto dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }


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


    public int getCantidad() {
        return cantidad;
    }


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


    public boolean darBaja(String codigo) {
        clsProducto producto = buscarPorCodigo(codigo);
        if (producto != null) {
            producto.setEstado(false);
            return true;
        }
        return false;
    }


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


    public void limpiar() {
        inicio = null;
        cantidad = 0;
    }
}
