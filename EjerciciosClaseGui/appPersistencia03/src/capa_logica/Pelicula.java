package capa_logica;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase Pelicula
 * 
 * @author mauricio
 */
public class Pelicula implements Serializable {
    private int id;
    private String titulo;
    private String genero;
    private String director;
    private String actor;
    private Date fechaEstreno;
    private double presupuesto;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String genero, String director, String actor, Date fechaEstreno,
            double presupuesto) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.actor = actor;
        this.fechaEstreno = fechaEstreno;
        this.presupuesto = presupuesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", director=" + director
                + ", actor=" + actor
                + ", fechaEstreno=" + fechaEstreno + ", presupuesto=" + presupuesto + '}';
    }
}
