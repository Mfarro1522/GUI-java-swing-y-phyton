package CapaLogica;

public class clsCategoria {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private boolean vigente;

    public clsCategoria() {
        this.codigo = "0";
        this.nombre = "";
        this.descripcion = "";
        this.vigente = false;
    }

    public clsCategoria(String codigo, String nombre, String descripcion, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vigente = estado;
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
        return vigente;
    }

    public void setEstado(boolean estado) {
        this.vigente = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVijente() {
        return vigente;
    }

    public void setVijente(boolean vijente) {
        this.vigente = vijente;
    }

}
