package CapaLogica;


public class clsMarca {
    
    private String codigo;
    private String nombre;
    private boolean estado;

    public clsMarca() {
        this.codigo = "0";
        this.nombre = "";
        this.estado = false;
    }

    public clsMarca(String codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
