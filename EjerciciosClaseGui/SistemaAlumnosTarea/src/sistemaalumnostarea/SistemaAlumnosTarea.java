package sistemaalumnostarea;

import CapaVisualzacion.jdManteniEstudiantes;

/**** @author mauricio*/
public class SistemaAlumnosTarea {

    public static void main(String[] args) {
       //se selecciona un elemento con doble clik sobre el 
        jdManteniEstudiantes dialog = new jdManteniEstudiantes(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(dialog);
        dialog.setVisible(true);
    }
    
}
