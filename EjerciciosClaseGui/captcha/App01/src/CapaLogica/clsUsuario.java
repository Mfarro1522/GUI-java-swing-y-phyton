package CapaLogica;
/**** @author mauricio farro*/
public class clsUsuario {
    private String usuario;
    private String clave;


    public clsUsuario() {
        this.usuario = "";
        this.clave = "";
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

    public boolean iniciarSession () {
         if(usuario.equals("Admin") && clave.equals("12345")){
             return true;
         }else {
              return false;
         }
    }
    
    
}
