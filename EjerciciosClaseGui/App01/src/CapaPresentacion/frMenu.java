package CapaPresentacion;

import CapaLogica.clsUsuario;
import CapaLogica.clsMarca;
import CapaLogica.clsCategoria;
import CapaPresentacion.frMantenimiento;
import capaDatos.clsUsuarioDao;
import capaDatos.clsMarcaDao;
import capaDatos.clsCategoriaDao;
import javax.swing.ImageIcon;

public class frMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frMenu.class.getName());

    public frMenu() {

        //if (dlgLogin.selogeo()) {
        initComponents();
        cargarUsuariosEjemplo();
        cargarMarcasEjemplo();
        cargarCategoriasEjemplo();

        //} else {
        //this.dispose();
        //System.exit(0);
        //}
        frLogin dlgLogin = new frLogin(this, true);
        dlgLogin.setLocationRelativeTo(this);
        dlgLogin.setIconImage(new ImageIcon("src/img/unprg.png").getImage());
        this.setIconImage(new ImageIcon("src/img/unprg.png").getImage());
        dlgLogin.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        barraMenu = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        itemMenuUsr = new javax.swing.JMenuItem();
        itemMenuMarca = new javax.swing.JMenuItem();
        itemMenuManCategoria = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        menuReporte = new javax.swing.JMenu();
        ItemReporteUsuario = new javax.swing.JMenuItem();
        ReporteUsuariosTipo = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuSistema.setText("Sistema");

        itemCerrarSesion.setText("Cerrar sesion");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        menuSistema.add(itemCerrarSesion);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuSistema.add(itemSalir);

        barraMenu.add(menuSistema);

        menuMantenimiento.setText("Mantenimiento");
        menuMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMantenimientoMouseClicked(evt);
            }
        });
        menuMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMantenimientoActionPerformed(evt);
            }
        });

        itemMenuUsr.setText("Usuarios");
        itemMenuUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuUsrActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemMenuUsr);

        itemMenuMarca.setText("Marcas");
        itemMenuMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuMarcaActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemMenuMarca);

        itemMenuManCategoria.setText("Categoria");
        itemMenuManCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuManCategoriaActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemMenuManCategoria);

        barraMenu.add(menuMantenimiento);

        menuOperaciones.setText("operaciones");
        barraMenu.add(menuOperaciones);

        menuAyuda.setText("ayuda");
        barraMenu.add(menuAyuda);

        menuReporte.setText("reportes");

        ItemReporteUsuario.setText("Usuarios");
        ItemReporteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReporteUsuarioActionPerformed(evt);
            }
        });
        menuReporte.add(ItemReporteUsuario);

        ReporteUsuariosTipo.setText("Usuarios por tipo");
        ReporteUsuariosTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteUsuariosTipoActionPerformed(evt);
            }
        });
        menuReporte.add(ReporteUsuariosTipo);

        barraMenu.add(menuReporte);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void menuMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMantenimientoActionPerformed


    }//GEN-LAST:event_menuMantenimientoActionPerformed

    private void menuMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMantenimientoMouseClicked

    }//GEN-LAST:event_menuMantenimientoMouseClicked

    private void ItemReporteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReporteUsuarioActionPerformed
        JdRepUsuarios objForm = new JdRepUsuarios(this, true);
        objForm.setLocationRelativeTo(this);
        objForm.setVisible(true);
    }//GEN-LAST:event_ItemReporteUsuarioActionPerformed

    private void ReporteUsuariosTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteUsuariosTipoActionPerformed
        jdReportePorTipo objForm = new jdReportePorTipo(this, true);
        objForm.setLocationRelativeTo(this);
        objForm.setVisible(true);
    }//GEN-LAST:event_ReporteUsuariosTipoActionPerformed

    private void itemMenuMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuMarcaActionPerformed
        jdManteniminetoMarca manMarca = new jdManteniminetoMarca(this, true);
        manMarca.setLocationRelativeTo(manMarca);
        manMarca.setVisible(true);
    }//GEN-LAST:event_itemMenuMarcaActionPerformed

    private void itemMenuUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuUsrActionPerformed
        frMantenimiento mantUsr = new frMantenimiento();
        mantUsr.setLocationRelativeTo(mantUsr);
        mantUsr.setVisible(true);
    }//GEN-LAST:event_itemMenuUsrActionPerformed

    private void itemMenuManCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuManCategoriaActionPerformed
        jdMantenimientoCategoria manCat = new jdMantenimientoCategoria();
        manCat.setLocationRelativeTo(this);
        manCat.setVisible(true);
    }//GEN-LAST:event_itemMenuManCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemReporteUsuario;
    private javax.swing.JMenuItem ReporteUsuariosTipo;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemMenuManCategoria;
    private javax.swing.JMenuItem itemMenuMarca;
    private javax.swing.JMenuItem itemMenuUsr;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenu menuReporte;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables

    public static void cargarUsuariosEjemplo() {

        clsUsuarioDao.agregar(new clsUsuario("admin1", "pass123", "Carlos López", "Administrador", true));
        clsUsuarioDao.agregar(new clsUsuario("admin2", "pass456", "María García", "Administrador", true));
        clsUsuarioDao.agregar(new clsUsuario("admin3", "pass789", "Juan Martínez", "Administrador", false));

        clsUsuarioDao.agregar(new clsUsuario("vend1", "pass111", "Pedro Rodríguez", "vendedor", true));
        clsUsuarioDao.agregar(new clsUsuario("vend2", "pass222", "Ana Fernández", "vendedor", true));
        clsUsuarioDao.agregar(new clsUsuario("vend3", "pass333", "Luis Sánchez", "vendedor", false));

        clsUsuarioDao.agregar(new clsUsuario("geren1", "pass444", "Sandra Torres", "gerente", true));
        clsUsuarioDao.agregar(new clsUsuario("geren2", "pass555", "Roberto Díaz", "gerente", true));

        clsUsuarioDao.agregar(new clsUsuario("admin_op1", "pass666", "Laura Gómez", "Administrativo", true));
        clsUsuarioDao.agregar(new clsUsuario("admin_op2", "pass777", "Patricia Morales", "Administrativo", true));
    }

    public static void cargarMarcasEjemplo() {

        // Marcas de PC
        clsMarcaDao.agregar(new clsMarca("M001", "DELL", true));
        clsMarcaDao.agregar(new clsMarca("M002", "HP", true));
        clsMarcaDao.agregar(new clsMarca("M003", "Lenovo", true));
        clsMarcaDao.agregar(new clsMarca("M004", "ASUS", true));
        clsMarcaDao.agregar(new clsMarca("M005", "Acer", true));
        clsMarcaDao.agregar(new clsMarca("M006", "Apple", true));

        // Distribuidores
        clsMarcaDao.agregar(new clsMarca("D001", "Tech Store Perú", true));
        clsMarcaDao.agregar(new clsMarca("D002", "Computadoras Plaza", true));
        clsMarcaDao.agregar(new clsMarca("D003", "PC Center", true));
        clsMarcaDao.agregar(new clsMarca("D004", "Distribuidor Nacional", true));
        clsMarcaDao.agregar(new clsMarca("D005", "Mega Tech", true));
        clsMarcaDao.agregar(new clsMarca("D006", "Componentes y Sistemas", false));
    }

    public static void cargarCategoriasEjemplo() {

        // Categorías de productos
        clsCategoriaDao.agregar(new clsCategoria("C001", "COMPUTADORAS", "Computadoras de escritorio y portátiles", true));
        clsCategoriaDao.agregar(new clsCategoria("C002", "PERIFÉRICOS", "Periféricos y accesorios", true));
        clsCategoriaDao.agregar(new clsCategoria("C003", "MONITORES", "Monitores y pantallas", true));
        clsCategoriaDao.agregar(new clsCategoria("C004", "IMPRESORAS", "Impresoras y multifuncionales", true));
        clsCategoriaDao.agregar(new clsCategoria("C005", "ACCESORIOS", "Cables, adaptadores y accesorios", true));
        clsCategoriaDao.agregar(new clsCategoria("C006", "REDES", "Equipos de red y conectividad", true));
        clsCategoriaDao.agregar(new clsCategoria("C007", "ALMACENAMIENTO", "Discos duros y memorias", true));
        clsCategoriaDao.agregar(new clsCategoria("C008", "COMPONENTES", "Componentes internos", true));
        clsCategoriaDao.agregar(new clsCategoria("C009", "SERVICIO TÉCNICO", "Servicio técnico y mantenimiento", false));
    }
}
