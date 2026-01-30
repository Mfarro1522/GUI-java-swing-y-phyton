package capa_logica;

import java.io.Serializable;

/**
 * Clase Usuario
 * 
 * @author mauricio
 */
public class Usuario implements Serializable {
    private int id;
    private String clave;
    private String nombre;
    private String tipo;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(int id, String clave, String nombre, String tipo, boolean estado) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
}
