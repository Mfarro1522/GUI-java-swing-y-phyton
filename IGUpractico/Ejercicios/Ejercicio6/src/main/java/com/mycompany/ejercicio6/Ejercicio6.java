package com.mycompany.ejercicio6;

import Clases.Baraja;
import Enumerados.TipoBaraja;
import igu.Ventana;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        
        Baraja baraja2 = new Baraja(53, TipoBaraja.FRANCESA);
        System.out.println(baraja2.getCartaActual().getRutaImg());
    }
}
