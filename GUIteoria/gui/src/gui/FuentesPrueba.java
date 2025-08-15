package gui;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class FuentesPrueba {
	
	public static void main(String[] args) {
		
		 String fuente = JOptionPane.showInputDialog("indtroduce fuente");
		 
		 boolean estalafuente = false ; 
		
		 //para ver como practica 
		String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for ( String e : nombresFuentes ) {
			System.out.println(e);
			if(e.equals(fuente)) {
				estalafuente = true ;
			}
		}
		
		if ( estalafuente ) {
			System.out.println("fuente instalada");
		} else {
			 System.out.println("no esta");
		}
		
		
	}
	
	

}
