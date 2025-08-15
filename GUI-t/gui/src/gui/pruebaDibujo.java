package gui;

import java.awt.*;
import java.awt.geom.*;

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
		//g.drawArc(200, 200, 120, 120, 90, 160);
		
		//bibloteca java2d
		Graphics2D g2 = (Graphics2D)g; 
		Rectangle2D rectangulo = new Rectangle2D.Double(100 , 100 , 200, 150);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		//instanciar dentro 
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double centroenx = rectangulo.getCenterX();
		double centroeny = rectangulo.getCenterY();
		double radio = 125;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenx, centroeny, centroenx+radio, centroeny+radio);
		g2.draw(circulo);
	}
}