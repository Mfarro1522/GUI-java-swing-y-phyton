package app007;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame marco = new JFrame( "Dibujo de figuras en 2D" );
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		figurasPanel figurasJPanel = new figurasPanel();
		marco.add( figurasJPanel ); 
		marco.setSize( 425, 200 ); 
		marco.setVisible( true ); 

}
}
