package sistemaalumnostarea;

import CapaVisualzacion.jdManteniEstudiantes;
import javax.swing.JDialog;

/**** @author mauricio*/
public class SistemaAlumnosTarea {

    public static void main(String[] args) {
       
        jdManteniEstudiantes dialog = new jdManteniEstudiantes(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(dialog);
        dialog.setVisible(true);
    }
    
}
