/*Ejercicio 4
Vamos a crear la típica ventana de Login.
Crearemos un JTextField y un JPasswordField para el usuario y contraseña, respectivamente.
También tendremos un botón que será el que nos loguee.
El usuario y password para acceder será test.
Si el acceso es correcto, abrirá una nueva ventana con un mensaje de que nos hemos logueado. 
En esta ventana tendremos un botón que nos deslogueara, haciendo que volvamos hacia atrás.
*/

package com.mycompany.ejercicio5;

import igu.Ventana1;

/**
 *
 * @author mauricio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Ventana1 ventana = new Ventana1();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
