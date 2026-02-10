package capaLogica;

import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class clsPersona {
    
    private String nombre;
    private int edad;
    private ArrayList<clsEvento> eventos;

    public clsPersona() {
        this.nombre = "";
        this.nombre = "";
        this.eventos =  new ArrayList<>();
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<clsEvento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<clsEvento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        String CadenaEventos ="";
        for(clsEvento e : eventos){
            CadenaEventos+=e.toString();
        }
        return "nombre " + nombre + " - edad: " + edad ;
    }
    
    
    
    


    
}
