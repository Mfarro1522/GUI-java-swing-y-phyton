/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capa_presentacion;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import javax.swing.UIManager;

/**
 *
 * @author mauricio
 */
public class AppPersistencia03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatCarbonIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Cargar datos desde archivos
        capa_datos.UsuarioDAO.recuperar();
        capa_datos.GeneroDAO.recuperar();
        capa_datos.ActorDAO.recuperar();
        capa_datos.DirectorDAO.recuperar();
        capa_datos.PeliculaDAO.recuperar();

        frMenu menu = new frMenu();
        menu.setLocationRelativeTo(menu);
        menu.setVisible(true);

    }

}
