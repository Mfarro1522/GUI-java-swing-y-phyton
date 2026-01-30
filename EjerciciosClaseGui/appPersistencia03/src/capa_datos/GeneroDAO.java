package capa_datos;

import capa_logica.Genero;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Clase GeneroDAO
 * 
 * @author mauricio
 */
public class GeneroDAO {
    private static ArrayList<Genero> misGeneros = new ArrayList<Genero>();
    
    public static void agrega(Genero obj)
    {
        misGeneros.add(obj);
    }
    
    public static ArrayList<Genero> obtener()
    {
        return misGeneros;
    }
    
    public static void grabar()
    {
        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/generos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(misGeneros);
            System.out.println("Se grabaron los generos correctamente");
            
            fos.close();            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void recuperar()
    {
        try {
            FileInputStream fis = new FileInputStream("src/archivos/generos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            misGeneros = (ArrayList<Genero>) ois.readObject();
            fis.close();
            System.out.println("Se leyeron los generos del archivo");
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
