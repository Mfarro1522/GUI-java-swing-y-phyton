package capaDatos;

/**
 * @author mauricio
 */
public class Nota {
    private String titulo;
    private String contenido;
    private String nombreArchivo;
    private String fecha;

    public Nota(String titulo, String contenido, String nombreArchivo, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
    }
    
    public Nota(String titulo, String contenido, String nombreArchivo) {
        this(titulo, contenido, nombreArchivo, "");
    }

    public Nota() {
        this.titulo = "";
        this.contenido = "";
        this.nombreArchivo = "";
        this.fecha = "";
    }
    
    // Getters y Setters
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        if (fecha != null && !fecha.isEmpty()) {
            return titulo + " - " + fecha;
        }
        return titulo;
    }
}
