/* enunciado
 * 
Vamos a crear un imitación, como si fuera un espejo. Tendremos dos pares conjugado:

Vamos a crear un imitación, como si fuera un espejo. Tendremos dos pares conjugado:

elementos separados (puedes usar un separador) y cuando nosotros pinchamos en un elemento o escribimos en un campo, se debe cambiar el otro lado.

Por ejemplo, si yo tengo un campo de texto y escribo en él, el campo de texto que es su reflejo también ese texto.

Podes usar los elementos que querés, os recomendamos:

JTextField, JRadioButton, JCheckBox, JTextArea, JSpinner, etc.
Mirad los eventos, os serán útiles.

Solo podéis modificar de un lado, el otro conjunto no lo podéis modificar, es decir, que no es bidireccional.
 */

package com.mycompany.ejercicio3;

import igu.Ventana;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
}
