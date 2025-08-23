package gui;

import javax.swing.JFrame;

import java.awt.event.*;

public class EventosConVentanas {

	public static void main(String[] args) {
	
		FrameEventoVentana miframe = new FrameEventoVentana();
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameEventoVentana miFrame2 = new FrameEventoVentana();
//		miFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ambos se cierran por el metodo setdeafut
		miFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miframe.setTitle("Ventana1");
		miFrame2.setTitle("Ventana2");
		
		miframe.setBounds(1500,500,500,350);
		miFrame2.setBounds(200,700,500,350);
		
		miframe.setVisible(true);
		miFrame2.setVisible(true);
	}

}

class FrameEventoVentana extends JFrame {
	
	public FrameEventoVentana() {
	
		//setTitle("Eventos de ventana");
		//setBounds(300,300,500,350);
		
		
		M_Ventana oyenteVentana = new M_Ventana();
		
		addWindowListener(oyenteVentana);
	
	}
}

class M_Ventana implements WindowListener {


	public void windowOpened(WindowEvent e) {
		System.out.println("Ventan abierta");
	}
	public void windowClosing(WindowEvent e) { //cuando la ventana se cierra
		System.out.println("Cerrando ventana");
	}
	
	
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventan a sido cerrda loquito");
	} 
	
	
	public void windowIconified(WindowEvent e) { //evento de minimizar ventana
		System.out.println("ventana minimizada");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("ventana Restaurada");
	}
	public void windowActivated(WindowEvent e) { //cuando la ventana se vuelve a ver 
		System.out.println("Ventana Activada");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada");
	}
	
}