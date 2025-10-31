package CapaVisualzacion;

import capaLogica.Estudiantes;
import capaDatos.EstudiantesDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauricio
 */
public class jdManteniEstudiantes extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jdManteniEstudiantes.class.getName());

    /**
     * Creates new form jdManteniEstudiantes
     */
    public jdManteniEstudiantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroup1.add(optMasculino);
        buttonGroup1.add(optFemenino);
        cargarEstudiantesEjemplo();
        cargarTabla();
        estiloTAbla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        optMasculino = new javax.swing.JRadioButton();
        optFemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(241, 247, 252));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(218, 244, 255));
        jPanel4.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Source Han Sans JP Heavy", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 67, 174));
        jLabel1.setText("Detalles del Estudiante");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("id");

        txtId.setBorder(null);

        txtNombre.setBorder(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombres");

        txtTelefono.setBorder(null);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("sexo");

        optMasculino.setBackground(new java.awt.Color(218, 244, 255));
        optMasculino.setFont(new java.awt.Font("Source Han Sans JP Normal", 1, 13)); // NOI18N
        optMasculino.setForeground(new java.awt.Color(51, 51, 51));
        optMasculino.setText("masculino");

        optFemenino.setBackground(new java.awt.Color(218, 244, 255));
        optFemenino.setFont(new java.awt.Font("Source Han Sans JP Normal", 1, 13)); // NOI18N
        optFemenino.setForeground(new java.awt.Color(51, 51, 51));
        optFemenino.setText("femenino");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Teléfono");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Dirección");

        txtDireccion.setBorder(null);

        txtApellido.setBorder(null);

        jButton2.setBackground(new java.awt.Color(75, 89, 233));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jButton2.setText("agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(37, 183, 106));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton3.setText("editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(231, 53, 72));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButton4.setText("eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(optMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(optFemenino))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optMasculino)
                    .addComponent(optFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 360, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaEstudiantes.setFont(new java.awt.Font("Source Han Sans JP Normal", 1, 13)); // NOI18N
        tablaEstudiantes.setForeground(new java.awt.Color(51, 51, 51));
        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombres", "apellidos", "sexo", "telefono", "direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEstudiantes.setToolTipText("");
        tablaEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaEstudiantes.setDoubleBuffered(true);
        tablaEstudiantes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setRowHeight(40);
        tablaEstudiantes.setRowMargin(1);
        tablaEstudiantes.setSelectionBackground(new java.awt.Color(5, 153, 255));
        tablaEstudiantes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tablaEstudiantes.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaEstudiantes.setShowGrid(false);
        tablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 80, 610, 650));

        jPanel1.setBackground(new java.awt.Color(239, 244, 249));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(218, 244, 255), 35, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 340, 650));

        jPanel2.setBackground(new java.awt.Color(239, 244, 249));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 35, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 640, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregarEstudiante();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificarEstudiante();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        eliminarEstudiante();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudiantesMouseClicked
        
        //implementacion de doble clik para seleccionar es mas intuitivo aparte no esta llamando a la funcion a cada rato
        if (evt.getClickCount() == 2) {
            int fila = tablaEstudiantes.getSelectedRow();

            if (fila < 0) {
                JOptionPane.showMessageDialog(this, "Selecciona una fila");
                return;
            }

            Estudiantes estudiante = EstudiantesDao.getElemento(fila);
            if (estudiante != null) {
                cargarCampos(estudiante);
            }
        }
    }//GEN-LAST:event_tablaEstudiantesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optFemenino;
    private javax.swing.JRadioButton optMasculino;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void agregarEstudiante() {
        String id = txtId.getText();
        String nombres = txtNombre.getText();
        String apellidos = txtApellido.getText();
        String sexo = obtenerSexo();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();

        if (!EstudiantesDao.validarAgregar(id, nombres)) {
            JOptionPane.showMessageDialog(this, "no se repide el id");
            return;
        }

        Estudiantes estudiante = new Estudiantes(id, nombres, apellidos, sexo, telefono, direccion);
        EstudiantesDao.agregar(estudiante);

        DefaultTableModel modelo = (DefaultTableModel) tablaEstudiantes.getModel();
        modelo.addRow(new Object[]{id, nombres, apellidos, sexo, telefono, direccion});

        JOptionPane.showMessageDialog(this, "Agregado correctamente");
        limpiar();
    }

    private void cargarTabla() {
        Estudiantes[] e = EstudiantesDao.obtener();
        if (e != null) {
            for (int i = 0; i < EstudiantesDao.getCantidad(); i++) {
                if (e[i] != null) {
                    DefaultTableModel modelo = (DefaultTableModel) tablaEstudiantes.getModel();
                    modelo.addRow(new Object[]{e[i].getId(), e[i].getNombres(), e[i].getApellidos(), e[i].getSexo(), e[i].getTelefono(), e[i].getDireccion()});
                }
            }
        }
    }

    private void eliminarEstudiante() {
        int fila = tablaEstudiantes.getSelectedRow();

        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al estudiante " + txtNombre.getText() + "?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tablaEstudiantes.getModel();
        if (EstudiantesDao.eliminar(fila)) {
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            limpiar();
        }
    }

    private void recargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEstudiantes.getModel();
        modelo.setRowCount(0);
        cargarTabla();
    }

    private void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        buttonGroup1.clearSelection();
    }

    private void cargarCampos(Estudiantes estudiante) {
        txtId.setText(estudiante.getId());
        txtNombre.setText(estudiante.getNombres());
        txtApellido.setText(estudiante.getApellidos());
        txtTelefono.setText(estudiante.getTelefono());
        txtDireccion.setText(estudiante.getDireccion());

        if ("masculino".equalsIgnoreCase(estudiante.getSexo())) {
            optMasculino.setSelected(true);
        } else {
            optFemenino.setSelected(true);
        }
    }

    private void modificarEstudiante() {
        String id = txtId.getText();
        String nombres = txtNombre.getText();
        String apellidos = txtApellido.getText();
        String sexo = obtenerSexo();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();

        if (id == null || id.trim().isEmpty() || nombres == null || nombres.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese ID y nombres");
            return;
        }

        Estudiantes estudianteActualizado = new Estudiantes(id, nombres, apellidos, sexo, telefono, direccion);
        if (EstudiantesDao.actualizar(id, estudianteActualizado)) {
            JOptionPane.showMessageDialog(this, "modificado correctamente");
            recargarTabla();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "pon bien el codigo esta en tabla loco");
        }
    }

    private String obtenerSexo() {
        if (optMasculino.isSelected()) {
            return "masculino";
        } else if (optFemenino.isSelected()) {
            return "femenino";
        }
        return "";
    }

    private void cargarEstudiantesEjemplo() {
        Estudiantes[] estudiantes = new Estudiantes[10];

        estudiantes[0] = new Estudiantes("001", "Juan", "García", "masculino", "3001234567", "Calle Principal 123");
        estudiantes[1] = new Estudiantes("002", "María", "López", "femenino", "3012345678", "Avenida Central 456");
        estudiantes[2] = new Estudiantes("003", "Carlos", "Rodríguez", "masculino", "3123456789", "Calle Secundaria 789");
        estudiantes[3] = new Estudiantes("004", "Ana", "Martínez", "femenino", "3134567890", "Carrera 3 #100");
        estudiantes[4] = new Estudiantes("005", "Pedro", "Hernández", "masculino", "3145678901", "Diagonal 50 - 200");
        estudiantes[5] = new Estudiantes("006", "Laura", "Pérez", "femenino", "3156789012", "Transversal 10 #50");
        estudiantes[6] = new Estudiantes("007", "Miguel", "Sánchez", "masculino", "3167890123", "Calle 15 con 20");
        estudiantes[7] = new Estudiantes("008", "Sofia", "Gómez", "femenino", "3178901234", "Avenida Paseo 555");
        estudiantes[8] = new Estudiantes("009", "Diego", "Torres", "masculino", "3189012345", "Calle 80 #45-30");
        estudiantes[9] = new Estudiantes("010", "Valentina", "Ruiz", "femenino", "3190123456", "Carrera 7 #30-45");

        for (Estudiantes estudiante : estudiantes) {
            EstudiantesDao.agregar(estudiante);
        }
    }

    //sacado de : https://github.com/DJ-Raven/java-jpanel-round-border/blob/main/src/test/Test.java
    private void estiloTAbla() {

        javax.swing.table.JTableHeader header = tablaEstudiantes.getTableHeader();
        header.setBackground(java.awt.Color.WHITE);
        header.setForeground(java.awt.Color.BLACK);
        header.setFont(new java.awt.Font("sansserif", java.awt.Font.BOLD, 12));

        jScrollPane1.setBorder(null);
        jScrollPane1.setBackground(java.awt.Color.WHITE);
        jScrollPane1.getViewport().setBackground(java.awt.Color.WHITE);
    }

}
