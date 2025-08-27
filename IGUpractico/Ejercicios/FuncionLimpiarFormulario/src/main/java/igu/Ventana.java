/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauriciof
 */
public class Ventana extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana.class.getName());

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Panel principal izquierdo
        panelIzquierdo = new javax.swing.JPanel();
        panelIzquierdo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        
        lblNombre = new javax.swing.JLabel("Nombre:");
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel("Apellido:");
        txtApellido = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel("Password:");
        passwordField = new javax.swing.JPasswordField();
        lblEdad = new javax.swing.JLabel("Edad:");
        spinnerEdad = new javax.swing.JSpinner();
        lblSalario = new javax.swing.JLabel("Salario:");
        sliderSalario = new javax.swing.JSlider(1000, 10000, 5000);
        sliderSalario.setMajorTickSpacing(2000);
        sliderSalario.setPaintTicks(true);
        sliderSalario.setPaintLabels(true);
        
        // Panel central
        panelCentral = new javax.swing.JPanel();
        panelCentral.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        
        lblGenero = new javax.swing.JLabel("Género:");
        radioMasculino = new javax.swing.JRadioButton("Masculino");
        radioFemenino = new javax.swing.JRadioButton("Femenino");
        radioOtro = new javax.swing.JRadioButton("Otro");
        grupoGenero = new javax.swing.ButtonGroup();
        grupoGenero.add(radioMasculino);
        grupoGenero.add(radioFemenino);
        grupoGenero.add(radioOtro);
        
        lblEstadoCivil = new javax.swing.JLabel("Estado Civil:");
        comboEstadoCivil = new javax.swing.JComboBox<>();
        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado", "Viudo" }));
        
        lblHobbies = new javax.swing.JLabel("Hobbies:");
        chkDeportes = new javax.swing.JCheckBox("Deportes");
        chkLectura = new javax.swing.JCheckBox("Lectura");
        chkMusica = new javax.swing.JCheckBox("Música");
        chkViajes = new javax.swing.JCheckBox("Viajes");
        
        lblComentarios = new javax.swing.JLabel("Comentarios:");
        txtAreaComentarios = new javax.swing.JTextArea(4, 20);
        scrollComentarios = new javax.swing.JScrollPane(txtAreaComentarios);
        
        // Panel derecho
        panelDerecho = new javax.swing.JPanel();
        panelDerecho.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista y Tabla"));
        
        lblLista = new javax.swing.JLabel("Lista de elementos:");
        listElementos = new javax.swing.JList<>();
        listElementos.setModel(new javax.swing.DefaultListModel<>());
        ((javax.swing.DefaultListModel<String>) listElementos.getModel()).addElement("Elemento 1");
        ((javax.swing.DefaultListModel<String>) listElementos.getModel()).addElement("Elemento 2");
        ((javax.swing.DefaultListModel<String>) listElementos.getModel()).addElement("Elemento 3");
        scrollPane = new javax.swing.JScrollPane(listElementos);
        
        lblTabla = new javax.swing.JLabel("Tabla de datos:");
        tableDatos = new javax.swing.JTable();
        modeloTabla = new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"Juan", "Pérez", 25, "Ingeniero"},
                {"María", "García", 30, "Doctora"},
                {"Carlos", "López", 28, "Profesor"},
                {"Ana", "Martín", 22, "Estudiante"}
            },
            new String[] {"Nombre", "Apellido", "Edad", "Profesión"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableDatos.setModel(modeloTabla);
        tableScrollPane = new javax.swing.JScrollPane(tableDatos);
        
        // Panel de botones
        panelBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton("Limpiar Formulario");
        btnMostrar = new javax.swing.JButton("Mostrar Datos");
        btnSalir = new javax.swing.JButton("Salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Completo - Prueba de Función Limpiar");
        setResizable(false);

        btnLimpiar.addActionListener(evt -> {
            limpiarFormulario(this.getContentPane().getComponents());
        });
        btnMostrar.addActionListener(evt -> mostrarDatos());
        btnSalir.addActionListener(evt -> System.exit(0));

        
        // Layout del panel izquierdo
        javax.swing.GroupLayout layoutIzquierdo = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(layoutIzquierdo);
        layoutIzquierdo.setHorizontalGroup(
            layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutIzquierdo.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblPassword)
                    .addComponent(lblEdad)
                    .addComponent(lblSalario))
                .addGap(18, 18, 18)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(passwordField)
                    .addComponent(spinnerEdad)
                    .addComponent(sliderSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layoutIzquierdo.setVerticalGroup(
            layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutIzquierdo.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layoutIzquierdo.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        // Layout del panel central
        javax.swing.GroupLayout layoutCentral = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(layoutCentral);
        layoutCentral.setHorizontalGroup(
            layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutCentral.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero)
                    .addGroup(layoutCentral.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(radioMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(radioFemenino)
                        .addGap(18, 18, 18)
                        .addComponent(radioOtro))
                    .addGroup(layoutCentral.createSequentialGroup()
                        .addComponent(lblEstadoCivil)
                        .addGap(18, 18, 18)
                        .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHobbies)
                    .addGroup(layoutCentral.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkDeportes)
                        .addGap(18, 18, 18)
                        .addComponent(chkLectura))
                    .addGroup(layoutCentral.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkMusica)
                        .addGap(18, 18, 18)
                        .addComponent(chkViajes))
                    .addComponent(lblComentarios)
                    .addComponent(scrollComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layoutCentral.setVerticalGroup(
            layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutCentral.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblGenero)
                .addGap(10, 10, 10)
                .addGroup(layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino)
                    .addComponent(radioFemenino)
                    .addComponent(radioOtro))
                .addGap(18, 18, 18)
                .addGroup(layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblHobbies)
                .addGap(10, 10, 10)
                .addGroup(layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDeportes)
                    .addComponent(chkLectura))
                .addGap(10, 10, 10)
                .addGroup(layoutCentral.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMusica)
                    .addComponent(chkViajes))
                .addGap(18, 18, 18)
                .addComponent(lblComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        // Layout del panel derecho
        javax.swing.GroupLayout layoutDerecho = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(layoutDerecho);
        layoutDerecho.setHorizontalGroup(
            layoutDerecho.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDerecho.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layoutDerecho.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLista)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTabla)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layoutDerecho.setVerticalGroup(
            layoutDerecho.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDerecho.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        // Layout del panel de botones
        javax.swing.GroupLayout layoutBotones = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(layoutBotones);
        layoutBotones.setHorizontalGroup(
            layoutBotones.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutBotones.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(20, 20, 20))
        );
        layoutBotones.setVerticalGroup(
            layoutBotones.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutBotones.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layoutBotones.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnMostrar)
                    .addComponent(btnSalir))
                .addGap(10, 10, 10))
        );

        // Layout principal
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatos() {
        StringBuilder datos = new StringBuilder();
        datos.append("DATOS DEL FORMULARIO:\n\n");
        
        // Datos personales
        datos.append("Nombre: ").append(txtNombre.getText()).append("\n");
        datos.append("Apellido: ").append(txtApellido.getText()).append("\n");
        datos.append("Password: ").append(new String(passwordField.getPassword())).append("\n");
        datos.append("Edad: ").append(spinnerEdad.getValue()).append("\n");
        datos.append("Salario: ").append(sliderSalario.getValue()).append("\n\n");
        
        // Género
        String genero = "No seleccionado";
        if (radioMasculino.isSelected()) genero = "Masculino";
        else if (radioFemenino.isSelected()) genero = "Femenino";
        else if (radioOtro.isSelected()) genero = "Otro";
        datos.append("Género: ").append(genero).append("\n");
        
        // Estado civil
        datos.append("Estado Civil: ").append(comboEstadoCivil.getSelectedItem()).append("\n\n");
        
        // Hobbies
        datos.append("Hobbies: ");
        if (chkDeportes.isSelected()) datos.append("Deportes ");
        if (chkLectura.isSelected()) datos.append("Lectura ");
        if (chkMusica.isSelected()) datos.append("Música ");
        if (chkViajes.isSelected()) datos.append("Viajes ");
        datos.append("\n\n");
        
        // Comentarios
        datos.append("Comentarios: ").append(txtAreaComentarios.getText()).append("\n");
        
        // Llenar la lista con algunos datos de ejemplo
        javax.swing.DefaultListModel<String> modelo = (javax.swing.DefaultListModel<String>) listElementos.getModel();
        modelo.addElement("Nuevo elemento " + (modelo.getSize() + 1));
        
        javax.swing.JOptionPane.showMessageDialog(this, datos.toString(), "Datos del Formulario", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Llamalo inicialemente con this.getContentPane().getComponents()
     *
     * @param componentes
     */
    public void limpiarFormulario(Component[] componentes) {

        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JPanel) {
                limpiarFormulario(((JPanel) componentes[i]).getComponents());
            } else if (componentes[i] instanceof JViewport) {
                limpiarFormulario(((JViewport) componentes[i]).getComponents());
            } else if (componentes[i] instanceof JScrollPane) {
                limpiarFormulario(((JScrollPane) componentes[i]).getComponents());
            } else if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JTextArea) {
                ((JTextArea) componentes[i]).setText("");
            } else if (componentes[i] instanceof JPasswordField) {
                ((JPasswordField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JCheckBox) {
                ((JCheckBox) componentes[i]).setSelected(false);
            } else if (componentes[i] instanceof JRadioButton) {
                ((JRadioButton) componentes[i]).setSelected(false);
            } else if (componentes[i] instanceof JToggleButton) {
                ((JToggleButton) componentes[i]).setSelected(false);
            } else if (componentes[i] instanceof JComboBox) {
                ((JComboBox<?>) componentes[i]).setSelectedIndex(0);
            } else if (componentes[i] instanceof JSlider) {
                ((JSlider) componentes[i]).setValue(((JSlider) componentes[i]).getMinimum());
            } else if (componentes[i] instanceof JSpinner) {
                ((JSpinner) componentes[i]).setValue(0);
            } else if (componentes[i] instanceof JFormattedTextField) {
                ((JFormattedTextField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JTable) {
                ((DefaultTableModel) (((JTable) componentes[i]).getModel())).setRowCount(0);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Ventana().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelBotones;
    
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JSlider sliderSalario;
    
    private javax.swing.JLabel lblGenero;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioOtro;
    private javax.swing.ButtonGroup grupoGenero;
    
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JComboBox<String> comboEstadoCivil;
    
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JCheckBox chkDeportes;
    private javax.swing.JCheckBox chkLectura;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkViajes;
    
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JTextArea txtAreaComentarios;
    private javax.swing.JScrollPane scrollComentarios;
    
    private javax.swing.JLabel lblLista;
    private javax.swing.JList<String> listElementos;
    private javax.swing.JScrollPane scrollPane;
    
    private javax.swing.JLabel lblTabla;
    private javax.swing.JTable tableDatos;
    private javax.swing.table.DefaultTableModel modeloTabla;
    private javax.swing.JScrollPane tableScrollPane;
    
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
