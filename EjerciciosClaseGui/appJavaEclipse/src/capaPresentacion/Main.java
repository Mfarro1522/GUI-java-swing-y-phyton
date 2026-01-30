package capaPresentacion;

import java.util.ArrayList;
import java.util.Date;

import CapaDatos.clsPersonaDAO;
import CapaLogica.clsEvento;
import CapaLogica.clsPersona;

public class Main {
	
	public static void main(String[] args) {
		
		// Crear eventos
		ArrayList<clsEvento> eventosMauricio = new ArrayList<>();
		eventosMauricio.add(new clsEvento("Power bi", 16, new Date(2020, 10, 10), "curso"));
		
		ArrayList<clsEvento> eventosAna = new ArrayList<>();
		eventosAna.add(new clsEvento("Java", 20, new Date(2020, 11, 10), "curso"));
		
		// Crear personas
		clsPersona persona1 = new clsPersona();
		persona1.setNombre("Mauricio");
		persona1.setEdad(25);
		persona1.setEventos(eventosMauricio);
		
		clsPersona persona2 = new clsPersona();
		persona2.setNombre("Ana");
		persona2.setEdad(30);
		persona2.setEventos(eventosAna);
		
		// Guardar en la capa de datos
		clsPersonaDAO.add(persona1);
		clsPersonaDAO.add(persona2);
		
		// Mostrar las personas guardadas
		System.out.println("Personas guardadas:");
		for (clsPersona p : clsPersonaDAO.getAll()) {
			System.out.println(p.toString());
		}
	}
}
