/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Clases.Baraja;
import Enumerados.TipoBaraja;

/**
 *
 * @author mauricio
 */
public class Ventana extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana.class.getName());

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        buttonGroup1.add(this.optCon89);
        buttonGroup1.add(this.optSin89);
        buttonGroup1.add(this.optConJokkers);
        buttonGroup1.add(this.optSinJokkers);
        
    }
    
    public void predef (){
       boton1.setEnabled(true);
       boton2.setEnabled(true);
       cartasdisponiblestxt.setText(""+baraja.getCant());
    }
    
   
    private Baraja baraja;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        cartassacadastxt = new javax.swing.JTextField();
        cartasdisponiblestxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCarta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarajas = new javax.swing.JMenu();
        tiposBarajaEsp = new javax.swing.JMenu();
        optCon89 = new javax.swing.JRadioButtonMenuItem();
        optSin89 = new javax.swing.JRadioButtonMenuItem();
        tiposBarajaFrc = new javax.swing.JMenu();
        optConJokkers = new javax.swing.JRadioButtonMenuItem();
        optSinJokkers = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carta");
        jLabel1.setToolTipText("");

        boton1.setText("Siguiente Carta");
        boton1.setEnabled(false);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setText("Barajar");
        boton2.setEnabled(false);
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        cartassacadastxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cartassacadastxt.setText("0");

        cartasdisponiblestxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cartasdisponiblestxt.setText("0");
        cartasdisponiblestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartasdisponiblestxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Cartas sacadas");

        jLabel3.setText("Cartas disponibles");

        menuBarajas.setText("Barajas");

        tiposBarajaEsp.setText("Baraja española");

        optCon89.setSelected(true);
        optCon89.setText("con 9 y 8");
        optCon89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCon89ActionPerformed(evt);
            }
        });
        tiposBarajaEsp.add(optCon89);

        optSin89.setSelected(true);
        optSin89.setText("sin 9 y 8");
        optSin89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSin89ActionPerformed(evt);
            }
        });
        tiposBarajaEsp.add(optSin89);

        menuBarajas.add(tiposBarajaEsp);

        tiposBarajaFrc.setText("Baraja francesa");

        optConJokkers.setSelected(true);
        optConJokkers.setText("Con Jokkers");
        optConJokkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optConJokkersActionPerformed(evt);
            }
        });
        tiposBarajaFrc.add(optConJokkers);

        optSinJokkers.setSelected(true);
        optSinJokkers.setText("Sin  Jokkers");
        optSinJokkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSinJokkersActionPerformed(evt);
            }
        });
        tiposBarajaFrc.add(optSinJokkers);

        menuBarajas.add(tiposBarajaFrc);

        jMenuBar1.add(menuBarajas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartassacadastxt)
                            .addComponent(cartasdisponiblestxt)))
                    .addComponent(boton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(boton1)
                        .addGap(18, 18, 18)
                        .addComponent(boton2)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartassacadastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartasdisponiblestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optConJokkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optConJokkersActionPerformed
       baraja = new Baraja(53, TipoBaraja.FRANCESA);
       predef();
       
       mostrarImagenes(lblCarta, "img/otras/tapa.jpg");
    }//GEN-LAST:event_optConJokkersActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        mostrarImagenes(lblCarta, baraja.getCartaActual().getRutaImg());
        baraja.siguienteCarta();

        cartassacadastxt.setText(""+baraja.getC());
        int x = baraja.getCant()-baraja.getC();
        cartasdisponiblestxt.setText(""+x);
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void cartasdisponiblestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartasdisponiblestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartasdisponiblestxtActionPerformed

    private void optCon89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCon89ActionPerformed
        baraja = new Baraja(48, TipoBaraja.ESPANOLA);
        predef();
       
       mostrarImagenes(lblCarta, "img/otras/tapa.jpg");
    }//GEN-LAST:event_optCon89ActionPerformed

    private void optSin89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSin89ActionPerformed
        baraja = new Baraja(40, TipoBaraja.ESPANOLA);
        predef();
       
       mostrarImagenes(lblCarta, "img/otras/tapa.jpg");
    }//GEN-LAST:event_optSin89ActionPerformed

    private void optSinJokkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSinJokkersActionPerformed
      baraja = new Baraja(52, TipoBaraja.FRANCESA);
      predef();
       
       mostrarImagenes(lblCarta, "img/otras/tapa.jpg");
    }//GEN-LAST:event_optSinJokkersActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        baraja.barajar();
    }//GEN-LAST:event_boton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cartasdisponiblestxt;
    private javax.swing.JTextField cartassacadastxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCarta;
    private javax.swing.JMenu menuBarajas;
    private javax.swing.JRadioButtonMenuItem optCon89;
    private javax.swing.JRadioButtonMenuItem optConJokkers;
    private javax.swing.JRadioButtonMenuItem optSin89;
    private javax.swing.JRadioButtonMenuItem optSinJokkers;
    private javax.swing.JMenu tiposBarajaEsp;
    private javax.swing.JMenu tiposBarajaFrc;
    // End of variables declaration//GEN-END:variables

    public static void mostrarImagenes(JLabel lbl , String Ruta){
        lbl.setIcon(new ImageIcon(Ruta));
    }

}
