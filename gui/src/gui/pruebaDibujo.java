package gui;

import java.awt.*;
import javax.swing.*;

public class pruebaDibujo {
	
	public static void main(String[] args) {
		
		frameConDibujos miframe1 = new frameConDibujos();
		miframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miframe1.setVisible(true);
		
	}

}

class frameConDibujos extends JFrame {
	public frameConDibujos() {
		// TODO Auto-generated constructor stub
		setTitle("prueba dibujo");
		setSize(400,400);
		laminafiguras milamina = new laminafiguras();
		add(milamina);
	}

}

class laminafiguras extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200,200);
		//g.drawLine(100, 100, 300, 200);
		g.drawArc(200, 200, 120, 120, 90, 160);
	}
}