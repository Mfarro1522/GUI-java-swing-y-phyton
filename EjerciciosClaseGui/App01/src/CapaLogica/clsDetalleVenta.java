package CapaLogica;

/**
 * @author mauricio
 */
public class clsDetalleVenta {

    private String codigoProd;
    private String nombreProd;
    private double precioProd;
    private int cant;
    private double descuento;

    public clsDetalleVenta() {
        this.codigoProd = "";
        this.nombreProd = "";
        this.precioProd = 0.0;
        this.cant = 0;
        this.descuento = 0.0;
    }

    public clsDetalleVenta(String codigoProd, String nombreProd, double precioProd, 
                           int cant, double descuento) {
        this.codigoProd = codigoProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.cant = cant;
        this.descuento = descuento;
    }

    /**
     * Calcula el precio con descuento aplicado
     */
    public double getPrecioConDescuento() {
        return precioProd - (precioProd * descuento / 100);
    }

    /**
     * Calcula el subtotal (precio con descuento * cantidad)
     */
    public double calcularSubtotal() {
        return getPrecioConDescuento() * cant;
    }

    // Getters y Setters
    public String getProductoCodigo() {
        return codigoProd;
    }

    public void setProductoCodigo(String productoCodigo) {
        this.codigoProd = productoCodigo;
    }

    public String getProductoNombre() {
        return nombreProd;
    }

    public void setProductoNombre(String productoNombre) {
        this.nombreProd = productoNombre;
    }

    public double getProductoPrecio() {
        return precioProd;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.precioProd = productoPrecio;
    }

    public int getCantidad() {
        return cant;
    }

    public void setCantidad(int cantidad) {
        this.cant = cantidad;
    }

    public double getDescuentoPorcentaje() {
        return descuento;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuento = descuentoPorcentaje;
    }

    @Override
    public String toString() {
        return codigoProd + " - " + nombreProd + " x" + cant + 
               " = S/." + String.format("%.2f", calcularSubtotal());
    }
}
