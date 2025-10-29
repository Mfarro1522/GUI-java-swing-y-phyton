package capaDatos;

import CapaLogica.clsUsuario;
import java.util.List;
import java.util.ArrayList;

public class listaUsuarios {

    private List<clsUsuario> usuarios;

    public listaUsuarios() {
        usuarios =  new ArrayList<>();
    }
    
    
    public boolean aniadirUsuario(clsUsuario u){
        if(!usuarios.contains(u)){
            usuarios.add(u);
            return true;
        } else {
            return false;
        }
    }
    
    
    

    
}
