//aqui refactorizamos el programa para mantener el modelo de fuente evento oyente

package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventosRefactorizacion {
    
    public static void main(String[] args) {
            MarcoBotones1 frame = new MarcoBotones1();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}

class MarcoBotones1 extends JFrame {
    public MarcoBotones1() {
        setTitle("Prueba Eventos");
        setBounds(700,300,500,300);
        
        LaminaBoton1 lamina = new LaminaBoton1();
        add(lamina);
    }
}

class LaminaBoton1 extends JPanel {
   
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBoton1() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		colorFondo Amarillo = new colorFondo(Color.yellow);
		colorFondo Azul = new colorFondo(Color.blue);
		colorFondo Rojo = new colorFondo(Color.red);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
		
	}
	
	private class colorFondo implements ActionListener {
		public colorFondo(Color c) {
			colordeFondo = c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colordeFondo);
		}
		
		private Color colordeFondo;
	}
	
}


