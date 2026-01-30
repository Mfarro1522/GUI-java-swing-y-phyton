package contenedor;

import CapaLogica.clsVenta;

/**
 *
 * @author mauricio
 */
public class ContenedorVentas {
    
    private static clsVenta [] misVentas = new clsVenta[100];
    private static int cantidad;

    public ContenedorVentas() {
        cantidad = 0;
    }
    
    public static boolean agregar(clsVenta venta) {
        if(cantidad <=100){
            misVentas[cantidad]= venta;
            cantidad++;
            return true;
        }
        return false;
    }

    public static int getCantidad() {
        return cantidad;
    }
    
        // Generar número de venta automático
    public static String generarNumeroVenta() {
        cantidad++;
        return String.format("V%05d", cantidad);
    }

    public static clsVenta[] getMisVentas() {
        return misVentas;
    }
    
    
    
}
