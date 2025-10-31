package CapaLogica;

import capaDatos.clsCategoriaDao;
import capaDatos.clsMarcaDao;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class metodosSueltos {

    public static int generarNumero(int min, int max) {
        if (min == max) {
            return min; // único valor posible
        }
        // Si están al revés, intercambiamos
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        // Usamos long para evitar overflow al calcular el tamaño del rango
        long rango = (long) max - (long) min + 1L; // tamaño del rango inclusivo
        if (rango <= 0L) {
            // Esto solo pasaría si el cálculo sobrepasa los límites de int (extremadamente improbable aquí)
            throw new IllegalArgumentException("Rango inválido: demasiado grande");
        }
        // Math.random() devuelve [0.0,1.0). Multiplicando por rango obtenemos [0, rango)
        long offset = (long) (Math.random() * rango); // offset dentro del rango
        return (int) (min + offset);
    }
    
    public static int pregunta (String cadena){
        Object [] opciones = {"Si." , "No."};
        int respuesta = JOptionPane.showOptionDialog(
                null,
                cadena,
                "confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        return respuesta;
       
    }
    
    public static void ListarMarcas (JComboBox combo){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            clsMarca [] marcas =  clsMarcaDao.obtener();
            int cantidad = clsMarcaDao.getCantidad();
            for (int i = 0; i < cantidad; i++) {
                modelo.addElement(marcas[i].getNombre());
            }
            combo.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+ "no hay marcas");
        }
    }
    
        public static void ListarCategorias (JComboBox combo){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            clsCategoria [] categorias =  clsCategoriaDao.obtener();
            int cantidad = clsCategoriaDao.getCantidad();
            for (int i = 0; i < cantidad; i++) {
                modelo.addElement(categorias[i].getNombre());
            }
            combo.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+ "no hay categorias");
        }
    }
}
