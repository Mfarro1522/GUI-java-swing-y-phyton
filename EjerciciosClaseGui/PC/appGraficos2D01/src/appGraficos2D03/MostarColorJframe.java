package appGraficos2D03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import appGraficos2D02.jPanelColor;

public class MostarColorJframe extends JFrame{

    private JButton cambiarColorBoton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel coloresJPPanel = new JPanel();

    public MostarColorJframe() {
        
        super("Uso de JcolorChooser");
        coloresJPPanel = new jPanelColor();
        coloresJPPanel.setBackground(color);

        cambiarColorBoton = new JButton("Cambiar color de fondo");
        cambiarColorBoton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    color = JColorChooser.showDialog(MostarColorJframe.this, "Seleccione un color", color);
                    if (color == null)
                        color = Color.LIGHT_GRAY;
                    coloresJPPanel.setBackground(color);
                }
            }
        );
        add(coloresJPPanel , BorderLayout.CENTER);
        add(cambiarColorBoton, BorderLayout.SOUTH);
        setSize(400,130);
        setVisible(true);
    }

}
