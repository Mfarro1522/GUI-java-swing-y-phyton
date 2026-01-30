package CapaDatos;

import java.util.ArrayList;

import CapaLogica.clsPersona;

public class clsPersonaDAO {

    private static ArrayList<clsPersona> datos = new ArrayList<clsPersona>();

    public static void add(clsPersona persona) {
        datos.add(persona);
    }

    public static ArrayList<clsPersona> getAll() {
        return datos;
    }
    
    public static clsPersona get(int index) {
        return datos.get(index);
    }


	
	

}
