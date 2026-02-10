package capaLogica;

import java.util.Date;

public class clsEvento {
    
    private Date fecha;
    private int hora;
    private String nombre;
    private String tipo;

    public clsEvento() {
    }
    
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
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

    @Override
    public String toString() {
        return  "fecha " + fecha + ", hora " + hora + ", nombre " + nombre + ", tipo " + tipo;
    }

    
    
    
    
    
}
