package appArchivo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ecribirarchivo {

	public static void main(String[] args) {
		String nombreArchivo = "mi_archivo.txt";

		try {
			PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo,false));
			int i = 1;
			for (i = 100; i <= 110; i++) {
				salida.println("linea" + i);
			}
			salida.close();
			System.out.println("El archivo se ha guardado correctamente con 20 líneas");
		} catch (IOException e) {
			System.out.println("No se pudo escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
