package appArchivo01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class archivoEjemplo {
	

	public static void main(String[] args) {
		File archivo = new File("mi_archivo.txt");
		
		if(archivo.exists()) {
			
			System.out.println("Nombre "+archivo.getName());
			System.out.println("ruta "+archivo.getPath());
			System.out.println("Ruta absoluta "+archivo.getAbsolutePath());
			System.out.println("se puede leer "+archivo.canRead());
			System.out.println("se puede escribir "+archivo.canWrite());
			System.out.println("se puede Ejecutar "+archivo.canExecute());
			System.out.println("tamaño  "+archivo.length());
			
		} else {
			System.out.println("no existe el archivo");
		}
		
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = entrada.readLine(); 
			
			while (linea != null) {
			    System.out.println(linea);     
			    linea = entrada.readLine();   
			}
			
			System.out.println(linea);
		} catch (Exception e) {
			System.out.println("no se puede leer");
		}

	}

}
