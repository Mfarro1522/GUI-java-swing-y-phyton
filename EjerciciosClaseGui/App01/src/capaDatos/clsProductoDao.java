package capaDatos;

import CapaLogica.clsProducto;
import CapaLogica.ListaEnlazadaProducto;

/**
 *
 * @author mauricio
 */
public class clsProductoDao {

    private static ListaEnlazadaProducto listaProductos = new ListaEnlazadaProducto();

    public clsProductoDao() {
    }

    public static void agregar(clsProducto producto) {
        producto.setNombre(producto.getNombre().toUpperCase());
        listaProductos.agregar(producto);
    }

    public static boolean eliminar(int indice) {
        return listaProductos.eliminar(indice);
    }

    public static clsProducto[] obtener() {
        return listaProductos.obtenerTodos();
    }

    public static int getCantidad() {
        return listaProductos.getCantidad();
    }

    public static clsProducto getElemento(int index) {
        return listaProductos.getElemento(index);
    }

    public static clsProducto buscarPorCodigo(String codigo) {
        return listaProductos.buscarPorCodigo(codigo);
    }

    public static int buscarIndicePorCodigo(String codigo) {
        return listaProductos.buscarIndicePorCodigo(codigo);
    }

    public static boolean validarAgregar(String codigo, String nombre, double precio) {
        return listaProductos.validarAgregar(codigo, nombre, precio);
    }

    public static boolean actualizar(String codigoOriginal, clsProducto productoActualizado) {
        return listaProductos.actualizar(codigoOriginal, productoActualizado);
    }

    public static boolean darBaja(String codigo) {
        return listaProductos.darBaja(codigo);
    }

}
