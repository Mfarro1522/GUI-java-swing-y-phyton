package capa_datos;

import capa_logica.Actor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Clase ActorDAO
 * 
 * @author mauricio
 */
public class ActorDAO {
    private static ArrayList<Actor> misActores = new ArrayList<Actor>();
    
    public static void agrega(Actor obj)
    {
        misActores.add(obj);
    }
    
    public static ArrayList<Actor> obtener()
    {
        return misActores;
    }
    
    public static void grabar()
    {
        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/actores.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(misActores);
            System.out.println("Se grabaron los actores correctamente");
            
            fos.close();            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void recuperar() {
        try {
            FileInputStream fis = new FileInputStream("src/archivos/actores.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            misActores = (ArrayList<Actor>) ois.readObject();
            fis.close();
            System.out.println("Se leyeron los actores del archivo");

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
