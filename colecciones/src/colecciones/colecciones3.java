package colecciones;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class colecciones3 {
	public static void main(String[] args) {
    List<Integer> datos = new ArrayList<>();
    datos.add(3);
    datos.add(4);
    datos.add(5);
    datos.add(20);
    datos.add(30);
    datos.add(45);
    datos.add(51);
    System.out.println("Listado");
    System.out.println(datos);
    
    int indice = Collections.binarySearch(datos, 20);
    System.out.println("ENCONTRADO EN LA POSICION "+indice);
    indice = Collections.binarySearch(datos, 12);
    System.out.println("ENCONTRADO EN LA POSICION "+indice);
    indice = Collections.binarySearch(datos, 30);
    System.out.println("ENCONTRADO EN LA POSICION "+indice);
    
    
    Collections.sort(datos,(o1,o2) -> {return Integer.compare(o2,o1);});
    System.out.println(datos);
    
    indice = Collections.binarySearch(datos, 45,Collections.reverseOrder());
    System.out.println("ENCONTRADO EN LA POSICION "+indice);
	
    
    
    
    
	
	}

	
}
