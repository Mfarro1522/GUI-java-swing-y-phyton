package CapaLogica;

/**
 * Clase que representa un Cliente
 * @author mauricio
 */
public class clsCliente {
    
    private String dniRuc;
    private String tipoCliente;
    private String nombre;
    private String direccion;
    private boolean estado;

    public clsCliente() {
        this.dniRuc = "";
        this.tipoCliente = "";
        this.nombre = "";
        this.direccion = "";
        this.estado = true;
    }


    public clsCliente(String dniRuc, String tipoCliente, String nombre, String direccion, boolean estado) {
        this.dniRuc = dniRuc;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getDniRuc() {
        return dniRuc;
    }

    public void setDniRuc(String dniRuc) {
        this.dniRuc = dniRuc;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente: " + dniRuc + "\n" +
               "Nombre: " + nombre + "\n" +
               "Tipo: " + tipoCliente + "\n" +
               "Dirección: " + direccion + "\n" +
               "Estado: " + (estado ? "Activo" : "Inactivo");
    }
}
