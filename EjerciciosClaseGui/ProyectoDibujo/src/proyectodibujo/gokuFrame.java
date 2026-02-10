package proyectodibujo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author mauricio
 */
public class gokuFrame extends javax.swing.JFrame {

    public gokuFrame() {
        setTitle("🐉 Goku - Transformaciones [ ESPACIO ]");
        setSize(1050, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        
        // Agregar el panel de dibujo
        gokuPanel panel = new gokuPanel();
        add(panel);
        
        // Asegurar que el panel tenga el foco para capturar teclas
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        
        // Dar foco al panel cuando la ventana sea visible
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                panel.requestFocusInWindow();
            }
        });
    }
    
}
