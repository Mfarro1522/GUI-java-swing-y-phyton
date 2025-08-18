package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {
    
    public static void main(String[] args) {
            MarcoBotones frame = new MarcoBotones();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}

class MarcoBotones extends JFrame {
    public MarcoBotones() {
        setTitle("Prueba Eventos");
        setBounds(700,300,500,300);
        
        LaminaBoton lamina = new LaminaBoton();
        add(lamina);
    }
}

class LaminaBoton extends JPanel implements ActionListener {
   
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBoton() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
		
	}
	//en este implementacion de la interfaz va las acciones
	//@Override esta parte es cuando era un solo boton azul
//	public void actionPerformed(ActionEvent e) {
//		setBackground(Color.BLUE);
//	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		} else if (botonPulsado == botonRojo) {
			setBackground(Color.RED);
		} else  {
			setBackground(Color.YELLOW);
		}
		
}
	
	

	
	
}
