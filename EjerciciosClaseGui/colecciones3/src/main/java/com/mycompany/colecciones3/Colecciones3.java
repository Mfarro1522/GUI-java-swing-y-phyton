/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciones3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mauricio
 */
public class Colecciones3 {

    public static void main(String[] args) {
        List<Integer> datos = new ArrayList<>();
        datos.add(3);
        datos.add(4);
        datos.add(5);
        datos.add(20);
        datos.add(30);
        datos.add(45);
        System.out.println("Listado");
        System.out.println(datos);
        
        int indice = Collections.binarySearch(datos, 20);
        System.out.println("ENCONTRADO EN LA POSICION"+indice);
    }
}
