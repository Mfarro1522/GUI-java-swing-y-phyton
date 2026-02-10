package appGraficos2D_06;

import javax.swing.JFrame;

public class main06 {
	public static void main(String[] args) {
		JFrame marco = new JFrame( "Dibujo de poligonos" );
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		piligonosJpanel poligonosJPanel = new piligonosJpanel();
		marco.add( poligonosJPanel ); // agrega poligonosJPanel al marco
		marco.setSize( 280, 270 ); // establece el tamaño del marco
		marco.setVisible( true );// muestra el marco
	}

}
