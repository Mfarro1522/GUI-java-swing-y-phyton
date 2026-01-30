package CapaLogica;


/**
 * 
 * @author mauricio farro
 */

public class clsUsuario {
    private String usuario;
    private String clave;
    private String nombre;
    private String tipo;
    private boolean estado;



    public clsUsuario() {
        this.usuario = "";
        this.clave = "";
        this.nombre = "";
        this.tipo = "";
        this.estado = false;
    }

    public clsUsuario(String usuario, String clave, String nombre, String tipo, boolean estado) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        return "Usuario: " + usuario + "\n" +
               "Nombre: " + nombre + "\n" +
               "Tipo: " + tipo + "\n" +
               "Estado: " + (estado ? "Habilitado" : "Deshabilitado");
    }
    

    public boolean iniciarSession (){
         if(usuario.equals("test") && clave.equals("test")){
             return true;
         }else {
              return false;
         }
    }
    
    
}
