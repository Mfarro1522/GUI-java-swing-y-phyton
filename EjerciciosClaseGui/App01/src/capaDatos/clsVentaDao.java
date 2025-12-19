package capaDatos;

import CapaLogica.clsVenta;
import java.time.LocalDate;

/**
 * Clase DAO para gestionar los datos de Venta
 * 
 * @author mauricio
 */
public class clsVentaDao {

    private static clsVenta[] ventas = new clsVenta[0];
    private static int cantidad;
    private static int contadorVentas = 0; // Para generar números de venta automáticos

    public clsVentaDao() {
        cantidad = 0;
    }

    // Generar número de venta automático
    public static String generarNumeroVenta() {
        contadorVentas++;
        return String.format("V%05d", contadorVentas);
    }

    // Agregar una venta
    public static void agregar(clsVenta venta) {
        clsVenta[] nuevoArray = new clsVenta[ventas.length + 1];
        for (int i = 0; i < ventas.length; i++) {
            nuevoArray[i] = ventas[i];
        }
        nuevoArray[ventas.length] = venta;
        ventas = nuevoArray;
        cantidad++;
    }

    // Eliminar una venta por índice
    public static boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }

        clsVenta[] nuevoArray = new clsVenta[ventas.length - 1];

        for (int i = 0; i < indice; i++) {
            nuevoArray[i] = ventas[i];
        }

        for (int i = indice; i < cantidad - 1; i++) {
            nuevoArray[i] = ventas[i + 1];
        }

        ventas = nuevoArray;
        cantidad--;
        return true;
    }

    // Obtener todas las ventas
    public static clsVenta[] obtener() {
        return ventas;
    }

    // Obtener la cantidad de ventas
    public static int getCantidad() {
        return cantidad;
    }

    // Obtener una venta por índice
    public static clsVenta getElemento(int index) {
        if (index >= 0 && index < cantidad) {
            return ventas[index];
        }
        return null;
    }

    // Buscar venta por número de venta
    public static clsVenta buscarPorNumero(String numeroVenta) {
        if (numeroVenta == null) {
            return null;
        }
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && numeroVenta.equals(ventas[i].getNumeroVenta())) {
                return ventas[i];
            }
        }
        return null;
    }

    // Buscar índice por número de venta
    public static int buscarIndicePorNumero(String numeroVenta) {
        if (numeroVenta == null) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && numeroVenta.equals(ventas[i].getNumeroVenta())) {
                return i;
            }
        }
        return -1;
    }

    // Validar antes de agregar
    public static boolean validarAgregar(String clienteDniRuc, String productoCodigo, int cantidad) {
        if (clienteDniRuc == null || clienteDniRuc.trim().isEmpty()) {
            return false;
        }
        if (productoCodigo == null || productoCodigo.trim().isEmpty()) {
            return false;
        }
        if (cantidad <= 0) {
            return false;
        }
        return true;
    }

    // Anular una venta (dar de baja)
    public static boolean anularVenta(String numeroVenta) {
        clsVenta venta = buscarPorNumero(numeroVenta);
        if (venta != null) {
            venta.setEstado(false);
            return true;
        }
        return false;
    }

    // Obtener ventas por cliente
    public static clsVenta[] obtenerPorCliente(String clienteDniRuc) {
        int contadorPorCliente = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && clienteDniRuc.equals(ventas[i].getClienteDniRuc())) {
                contadorPorCliente++;
            }
        }

        clsVenta[] ventasPorCliente = new clsVenta[contadorPorCliente];
        int indice = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && clienteDniRuc.equals(ventas[i].getClienteDniRuc())) {
                ventasPorCliente[indice] = ventas[i];
                indice++;
            }
        }
        return ventasPorCliente;
    }

    // Obtener ventas por fecha
    public static clsVenta[] obtenerPorFecha(LocalDate fecha) {
        int contadorPorFecha = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && fecha.equals(ventas[i].getFecha())) {
                contadorPorFecha++;
            }
        }

        clsVenta[] ventasPorFecha = new clsVenta[contadorPorFecha];
        int indice = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && fecha.equals(ventas[i].getFecha())) {
                ventasPorFecha[indice] = ventas[i];
                indice++;
            }
        }
        return ventasPorFecha;
    }

    // Calcular total de ventas del día
    public static double calcularTotalVentasDelDia(LocalDate fecha) {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && fecha.equals(ventas[i].getFecha()) && ventas[i].isEstado()) {
                total += ventas[i].calcularTotal();
            }
        }
        return total;
    }

    // Calcular total general de todas las ventas activas
    public static double calcularTotalGeneral() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            if (ventas[i] != null && ventas[i].isEstado()) {
                total += ventas[i].calcularTotal();
            }
        }
        return total;
    }
}
