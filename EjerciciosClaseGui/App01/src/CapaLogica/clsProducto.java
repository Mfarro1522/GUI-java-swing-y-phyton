package CapaLogica;

public class clsProducto {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    private String marca;
    private boolean estado;

    public clsProducto() {
        this.codigo = "0";
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0.0;
        this.stock = 0;
        this.categoria = "";
        this.marca = "";
        this.estado = false;
    }

    public clsProducto(String codigo, String nombre, String descripcion, double precio, int stock, String categoria, String marca, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.marca = marca;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
