package CapaLogica;

import java.time.LocalDate;

/**
 * 
 * @author mauricio
 */
public class clsVenta {

    private String numeroVenta;
    private LocalDate fecha;
    private String clienteDniRuc;
    private String clienteNombre;
    
    // Array de detalles (productos) de la venta
    private clsDetalleVenta[] detalles;
    private int cantidadDetalles;
    
    private static final double IGV_PORCENTAJE = 0.18;
    private boolean estado;

    public clsVenta() {
        this.numeroVenta = "";
        this.fecha = LocalDate.now();
        this.clienteDniRuc = "";
        this.clienteNombre = "";
        this.detalles = new clsDetalleVenta[0];
        this.cantidadDetalles = 0;
        this.estado = true;
    }

    public clsVenta(String numeroVenta, LocalDate fecha, String clienteDniRuc, String clienteNombre, boolean estado) {
        this.numeroVenta = numeroVenta;
        this.fecha = fecha;
        this.clienteDniRuc = clienteDniRuc;
        this.clienteNombre = clienteNombre;
        this.detalles = new clsDetalleVenta[0];
        this.cantidadDetalles = 0;
        this.estado = estado;
    }

    /**
     * Agregar un producto a la venta
     */
    public void agregarProducto(String codigo, String nombre, double precio, int cantidad, double descuento) {
        clsDetalleVenta detalle = new clsDetalleVenta(codigo, nombre, precio, cantidad, descuento);
        agregarDetalle(detalle);
    }

    /**
     * Agregar un detalle a la venta
     */
    public void agregarDetalle(clsDetalleVenta detalle) {
        clsDetalleVenta[] nuevo = new clsDetalleVenta[cantidadDetalles + 1];
        for (int i = 0; i < cantidadDetalles; i++) {
            nuevo[i] = detalles[i];
        }
        nuevo[cantidadDetalles] = detalle;
        detalles = nuevo;
        cantidadDetalles++;
    }

    /**
     * Eliminar un detalle por índice
     */
    public boolean eliminarDetalle(int indice) {
        if (indice < 0 || indice >= cantidadDetalles) {
            return false;
        }
        clsDetalleVenta[] nuevo = new clsDetalleVenta[cantidadDetalles - 1];
        for (int i = 0; i < indice; i++) {
            nuevo[i] = detalles[i];
        }
        for (int i = indice; i < cantidadDetalles - 1; i++) {
            nuevo[i] = detalles[i + 1];
        }
        detalles = nuevo;
        cantidadDetalles--;
        return true;
    }

    /**
     * Obtener un detalle por índice
     */
    public clsDetalleVenta getDetalle(int indice) {
        if (indice >= 0 && indice < cantidadDetalles) {
            return detalles[indice];
        }
        return null;
    }

    /**
     * Obtener todos los detalles
     */
    public clsDetalleVenta[] getDetalles() {
        return detalles;
    }

    /**
     * Obtener cantidad de productos en la venta
     */
    public int getCantidadDetalles() {
        return cantidadDetalles;
    }

    /**
     * Calcular subtotal de todos los productos
     */
    public double calcularSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < cantidadDetalles; i++) {
            subtotal += detalles[i].calcularSubtotal();
        }
        return subtotal;
    }

    public double calcularIgv() {
        return calcularSubtotal() * IGV_PORCENTAJE;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIgv();
    }

    // Getters y Setters básicos
    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getClienteDniRuc() {
        return clienteDniRuc;
    }

    public void setClienteDniRuc(String clienteDniRuc) {
        this.clienteDniRuc = clienteDniRuc;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static double getIgvPorcentaje() {
        return IGV_PORCENTAJE;
    }

    @Override
    public String toString() {
        return "clsVenta{" + "numeroVenta=" + numeroVenta + ", fecha=" + fecha + ", clienteDniRuc=" + clienteDniRuc + ", clienteNombre=" + clienteNombre + ", detalles=" + detalles + ", cantidadDetalles=" + cantidadDetalles + ", estado=" + estado + '}';
    }
    
    
    
}
