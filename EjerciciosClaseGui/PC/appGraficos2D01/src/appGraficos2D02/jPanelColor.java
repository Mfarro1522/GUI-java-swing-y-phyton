package appGraficos2D02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class jPanelColor extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(new Color(255,0,0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("RGB actual" + g.getColor(), 130, 40);


        g.setColor(new Color(0.50f,0.75f,0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("RGB actual" + g.getColor(), 130, 65);
        
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("RGB actual" + g.getColor(), 130, 90);

        Color c1 = Color.MAGENTA;
        g.setColor(c1);
        g.fillRect(15, 100, 100, 20);
        g.drawString("RGB actual" + c1.getRed() + ", " + c1.getGreen() + ", " + c1.getBlue(), 130, 115);

        
    }

}
