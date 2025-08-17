package gui;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
import java.util.Iterator;

public class frameImagen {
    public static void main(String[] args) {
        MarcoImagen frame = new MarcoImagen();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MarcoImagen extends JFrame {
    public MarcoImagen() {
        setTitle("Frame imagen vacío");
        setBounds(750, 300, 300, 200);
        
        laminaImagen milamina = new laminaImagen();
        add(milamina);
    }
}

class laminaImagen extends JPanel {
	//es mejor con constructor en este caso por que al crearlo lo cargamos en la imagen y en elecucion hace el for 
	public laminaImagen () {
		try {
			
	    //File miimagen = new File("src/gui/coche.png");
		       
			imagen = ImageIO.read(new File("src/gui/pelota.png"));
		} catch (IOException e) {
			System.out.println("no esta la imagen papi");
		}
	}
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int anchoImagen = imagen.getWidth(this);
        int altoImagen = imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 0, null);
//       si sabes la dimesiones 
//        for (int i = 0; i < 300; i++) {
//			for (int j = 0; j < 200; j++) {
//				g.copyArea(0, 0, 16 , 16, 15*i, 15*j);
//			}
//		}
        
        //si no
        for (int i = 0; i < 300; i++) {
			for (int j = 0; j < 200; j++) {
				if(i+j>0) {//para no repetir la primera impresion q pasa con el constructor
				g.copyArea(0, 0, anchoImagen , altoImagen, anchoImagen*i, altoImagen*j);
			}
			}
		}
        
        
    }
    
    private Image imagen;
    
}
