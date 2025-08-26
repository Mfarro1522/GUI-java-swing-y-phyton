package Clases;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    
    private List<Profesor> profesores;

    public Academia() {
        profesores = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    
    
    
    public void aniadirProfesor (Profesor p){
        profesores.add(p);
    }
    
    public void listarProfes () {
        for (Profesor p : profesores) {
            System.out.println(p.toString());
        }
        System.out.println("");
    }
    
    public boolean buscaContacto(String dni) {
        boolean esta  =false;
        for (Profesor c : profesores) {
            if (c.getDNI().equals(dni)) {
                System.out.println(c.toString());
                esta = true;
            }
        }
        return esta;
    }
    
}
