package app008;

import java.awt.Color;

import javax.swing.JFrame;

public class main008 {
	public static void main(String[] args) {
		JFrame marco = new JFrame( "Dibujo de figuras en 2D" );
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		panelFigura2 figuras2JPanel = new panelFigura2();
		marco.add( figuras2JPanel ); // agrega figuras2JPanel al marco
		marco.setBackground( Color.WHITE ); // establece color de fondo del marco
		marco.setSize( 400, 400 ); // establece el tamaño del marco
		marco.setVisible( true ); // muestra el marco
	}

}
