package gui;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;

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
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //File miimagen = new File("src/gui/coche.png");
        
        try {
			imagen = ImageIO.read(new File("src/gui/coche.png"));
		} catch (IOException e) {
			System.out.println("no esta la imagen papi");
		}
        
        
        
        g.drawImage(imagen, 5, 5, null);
        
        
    }
    
    private Image imagen;
    
}
