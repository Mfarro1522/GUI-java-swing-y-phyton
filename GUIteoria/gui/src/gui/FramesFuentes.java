package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FramesFuentes {
	
	public static void main(String[] args) {
		
		frameFuentes frame = new frameFuentes();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
	
	class frameFuentes extends JFrame {
		
		public frameFuentes() {
			
			setTitle("frame con fuentes personalizadas");
			setSize(400,400);
			laminaFuentes lamina = new laminaFuentes();
			//si quiero que toda la lamina tenga colo por defecto 
			add(lamina);
			lamina.setForeground(Color.BLUE);
		
		}
	
	}
	
	class laminaFuentes extends JPanel{
		
		public void paintComponent ( Graphics g ) {
			
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			Font mifuente0 = new Font("DejaVu Sans",Font.BOLD , 26);
			g2.setFont(mifuente0);
			g2.drawString("Mauricio", 100, 300);
			
			Font mifuente = new Font("Open Sans",Font.BOLD , 26);
			g2.setFont(mifuente);
			g2.setColor(Color.RED.brighter());
			g2.drawString("Mauricio", 100, 100);
			
			//OTRA FORMA 
			g2.setFont(new Font("Courier",Font.ITALIC, 26));
			g2.setColor(new Color(120,0,80,100));
			g2.drawString("Mauricio", 200, 200);
		}
		
	}

