package appgGraficos2d04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class fontPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Texto con fuente Serif, negrita y tamaño 12", 20, 50);

        g.setFont(new Font("Monospaced", Font.ITALIC, 14));
        g.drawString("Texto con fuente Monospaced, cursiva y tamaño 14", 20, 70);

        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("Texto con fuente SansSerif, normal y tamaño 14", 20, 90);

        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        g.drawString(g.getFont() + "" + g.getFont().getSize()+" Puntos Negrita Cursiva", 20, 110);


    }

}
