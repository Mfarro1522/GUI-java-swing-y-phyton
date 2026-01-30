package capa_datos;

import capa_logica.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Clase UsuarioDAO
 * 
 * @author mauricio
 */
public class UsuarioDAO {
    private static ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();

    public static void agrega(Usuario obj) {
        misUsuarios.add(obj);
    }

    public static ArrayList<Usuario> obtener() {
        return misUsuarios;
    }

    public static void grabar() {
        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/usuarios.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(misUsuarios);
            System.out.println("Se grabaron los usuarios correctamente");

            fos.close();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static void recuperar() {
        try {
            FileInputStream fis = new FileInputStream("src/archivos/usuarios.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            misUsuarios = (ArrayList<Usuario>) ois.readObject();
            fis.close();
            System.out.println("Se leyeron los usuarios del archivo");

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
