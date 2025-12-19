package CapaLogica;

import java.time.LocalDate;

/**
 * Clase que representa una Venta
 * 
 * @author mauricio
 */
public class clsVenta {

    private String numeroVenta;
    private LocalDate fecha;
    
    private String clienteDniRuc;
    private String clienteNombre;
    
    private String productoCodigo;
    private String productoNombre;
    private double productoPrecio;
    
    private int cantidad;
    private static final double IGV_PORCENTAJE = 0.18;
    private boolean estado;

    public clsVenta() {
        this.numeroVenta = "";
        this.fecha = LocalDate.now();
        this.clienteDniRuc = "";
        this.clienteNombre = "";
        this.productoCodigo = "";
        this.productoNombre = "";
        this.productoPrecio = 0.0;
        this.cantidad = 0;
        this.estado = true;
    }


    public clsVenta(String numeroVenta, LocalDate fecha, String clienteDniRuc, String clienteNombre,
            String productoCodigo, String productoNombre, double productoPrecio, int cantidad, boolean estado) {
        this.numeroVenta = numeroVenta;
        this.fecha = fecha;
        this.clienteDniRuc = clienteDniRuc;
        this.clienteNombre = clienteNombre;
        this.productoCodigo = productoCodigo;
        this.productoNombre = productoNombre;
        this.productoPrecio = productoPrecio;
        this.cantidad = cantidad;
        this.estado = estado;
    }


    public double calcularSubtotal() {
        return productoPrecio * cantidad;
    }

    public double calcularIgv() {
        return calcularSubtotal() * IGV_PORCENTAJE;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIgv();
    }

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

    public String getProductoCodigo() {
        return productoCodigo;
    }

    public void setProductoCodigo(String productoCodigo) {
        this.productoCodigo = productoCodigo;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
        return "Venta N°: " + numeroVenta + "\n" +
                "Fecha: " + fecha + "\n" +
                "Cliente: " + clienteNombre + " (" + clienteDniRuc + ")\n" +
                "Producto: " + productoNombre + " (" + productoCodigo + ")\n" +
                "Cantidad: " + cantidad + "\n" +
                "Subtotal: S/. " + String.format("%.2f", calcularSubtotal()) + "\n" +
                "IGV (18%): S/. " + String.format("%.2f", calcularIgv()) + "\n" +
                "Total: S/. " + String.format("%.2f", calcularTotal()) + "\n" +
                "Estado: " + (estado ? "Activa" : "Anulada");
    }
}
