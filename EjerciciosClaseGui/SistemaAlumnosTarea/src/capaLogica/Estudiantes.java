package capaLogica;

/**
 *
 * @author mauricio
 */
public class Estudiantes {
    
    private String id;
    private String nombres;
    private String apellidos;
    private String sexo;
    private String telefono;
    private String direccion;

    public Estudiantes() {
        this.id = "0";
        this.nombres = "";
        this.apellidos = "";
        this.sexo = "";
        this.telefono = "";
        this.direccion = "";
    }

    public Estudiantes(String id, String nombres, String apellidos, String sexo, String telefono, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
