package appgraficos05;

import javax.swing.JFrame;

public class main05 {
	public static void main (String[] args)
	{
	JFrame marco = new JFrame("Dibujo de arcos" );
	marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	APP005 arcosJPanel = new APP005();  
	marco.add( arcosJPanel ); 
	marco.setSize( 300, 210 ); 
	marco.setVisible( true );
	}

}
