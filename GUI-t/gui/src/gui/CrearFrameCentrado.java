package gui;

import java.awt.*;
import javax.swing.*;


public class CrearFrameCentrado {
	
	public static void main(String[] args) {
		
		frameCentrado frame1 = new frameCentrado();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
	}

}

class frameCentrado extends JFrame{
	public frameCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamaniopantalla = mipantalla.getScreenSize();
		int altoPantalla = tamaniopantalla.height;
		int anchopantalla = tamaniopantalla.width;
		
		setSize(anchopantalla/2 , altoPantalla/2);
		setLocation(anchopantalla/4,altoPantalla/4);
		setTitle("Marco centrado");
		
		Image miicono = mipantalla.getImage("src/gui/icono.jpeg");
		setIconImage(miicono);
		
	}
}
