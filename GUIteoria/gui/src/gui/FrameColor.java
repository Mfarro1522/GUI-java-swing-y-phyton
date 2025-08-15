package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FrameColor {
	
	public static void main(String[] args) {
		
		frameColor frame = new frameColor();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
	
	class frameColor extends JFrame {
		
		public frameColor() {
			
			setTitle("frame con colores");
			setSize(400,400);
			
			laminaColor lamina = new laminaColor();
			add(lamina);
			
			//lamina.setBackground(SystemColor.window); //opcional
			lamina.setBackground(Color.YELLOW);
			
			
		}
		
	}
	
	class laminaColor extends JPanel{
		
		public void paintComponent ( Graphics g ) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			//rectangulo
			Rectangle2D rectangulo = new Rectangle2D.Double(100 , 100 , 200 , 150);
			
			//dar color
			g2.setPaint(Color.MAGENTA);
			//g2.draw(rectangulo); ya no dibujamos
			g2.fill(rectangulo);
			
			//elipse
			Ellipse2D elipse = new Ellipse2D.Double();
			elipse.setFrame(rectangulo);
			//color al relleno y borde 
			// g2.setPaint(Color.CYAN); forma normal
			//con rgb - y alfa opcional
			g2.setPaint(Color.BLACK);
			g2.draw(elipse);
			g2.setPaint(new Color(225,170,150,100).brighter().darker()); //brigter aclara y puedes aclaras las veces que quieras
																	//darker oscurece
			
			g2.fill(elipse);
			
		}
		
	}

