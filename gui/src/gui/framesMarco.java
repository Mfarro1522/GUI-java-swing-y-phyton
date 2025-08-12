package gui;

import javax.swing.*;

public class framesMarco {

	public static void main(String[] args) {
		
		miFrame frame1 = new miFrame();
		frame1.setVisible(true);
	/*// Establece la operación por defecto al cerrar la ventana.
	// Opciones disponibles:
	// DO_NOTHING_ON_CLOSE: No hace nada al cerrar (requiere manejo manual).
	// HIDE_ON_CLOSE: Oculta la ventana al cerrar.
	// DISPOSE_ON_CLOSE: Oculta y libera los recursos de la ventana.
	// EXIT_ON_CLOSE: Cierra la aplicación (recomendado solo para aplicaciones principales).*/
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
	class miFrame extends JFrame{

		public miFrame () {
			//setSize(500, 300);
			//setLocation(500, 300); //ubicacion de nuestro frame
			setBounds(500, 300, 500, 250);//ambos en uno solo
			//setResizable(false);
			//setExtendedState(MAXIMIZED_BOTH); o setExtendedState(6);que es el valor numerico de la constante
			setTitle("mi ventana");
		}
		
		
		
	}
	
