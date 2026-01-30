/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capa_datos;

import capa_logica.Pelicula;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mauricio
 */
public class PeliculaDAO {
    private static ArrayList<Pelicula> mispeliculas = new ArrayList<Pelicula>();

    public static void agrega(Pelicula objpeli) {
        mispeliculas.add(objpeli);
    }

    public static ArrayList<Pelicula> obtener() {
        return mispeliculas;
    }

    public static void grabar() {
        try {
            FileOutputStream fos = new FileOutputStream("src/archivos/peliculas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(mispeliculas);
            System.out.println("Se grabaron las peliculas correctamente");

            fos.close();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static void recuperar() {
        try {

            FileInputStream fis = new FileInputStream("src/archivos/peliculas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            mispeliculas = (ArrayList<Pelicula>) ois.readObject();
            fis.close();
            System.out.println("Se leyeron las peliculas del archivo");

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
