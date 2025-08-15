package gui;

import javax.swing.*;
import java.awt.*;

public class escribirFrame {
	
	public static void main(String[] args) {
		
		frameConTexto miframe = new frameConTexto();
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class frameConTexto extends JFrame{
	public frameConTexto() {
		
		setSize(600,450);
		
		setLocation(200, 200);
		
		setTitle("primer Texto");
		
		lamina milamina = new lamina();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("apendiendo swing", 100, 100);
		
	}
	
}