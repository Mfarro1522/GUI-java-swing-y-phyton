package capa_datos;

import capa_logica.Director;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Clase DirectorDAO
 * 
 * @author mauricio
 */
public class DirectorDAO {
    private static ArrayList<Director> misDirectores = new ArrayList<Director>();
    
    public static void agrega(Director obj)
    {
        misDirectores.add(obj);
    }
    
    public static ArrayList<Director> obtener()
    {
        return misDirectores;
    }
    
    public static void grabar()
    {
        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/directores.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(misDirectores);
            System.out.println("Se grabaron los directores correctamente");
            
            fos.close();            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void recuperar()
    {
        try {
            FileInputStream fis = new FileInputStream("src/archivos/directores.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            misDirectores = (ArrayList<Director>) ois.readObject();
            fis.close();
            System.out.println("Se leyeron los directores del archivo");
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
