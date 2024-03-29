package Presentacion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge Alberto
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    
    frmEstudiante frmestudiante = new frmEstudiante();
    frmCarrera frmcarrera;
    frmFacultad frmfacultad = new frmFacultad();
    frmReportes frmreportes = new frmReportes();
    public Principal() throws ClassNotFoundException, SQLException {
        this.frmcarrera = new frmCarrera();
        initComponents();
        IniciarPanels();
        sized();
    }
    void IniciarPanels()
    {
        this.setExtendedState(Principal.MAXIMIZED_BOTH);
    ifca.setContentPane(frmcarrera);
    ifes.setContentPane(frmestudiante);
    iffa.setContentPane(frmfacultad);
    ifreportes.setContentPane(frmreportes);
    }
    void sized()
    {
        facultad.setSize(300, 200);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        desktopPane = new javax.swing.JDesktopPane();
        ifcarrera = new javax.swing.JInternalFrame();
        ifestudiante = new javax.swing.JInternalFrame();
        iffacultad = new javax.swing.JInternalFrame();
        ifca = new javax.swing.JInternalFrame();
        ifes = new javax.swing.JInternalFrame();
        iffa = new javax.swing.JInternalFrame();
        ifreportes = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        facultad = new javax.swing.JMenuItem();
        carrera = new javax.swing.JMenuItem();
        estudiante = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(0, 0, 51));

        ifcarrera.setClosable(true);
        ifcarrera.setIconifiable(true);
        ifcarrera.setMaximizable(true);
        ifcarrera.setVisible(false);

        javax.swing.GroupLayout ifcarreraLayout = new javax.swing.GroupLayout(ifcarrera.getContentPane());
        ifcarrera.getContentPane().setLayout(ifcarreraLayout);
        ifcarreraLayout.setHorizontalGroup(
            ifcarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifcarreraLayout.setVerticalGroup(
            ifcarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifcarrera);
        ifcarrera.setBounds(10, 10, 600, 530);

        ifestudiante.setClosable(true);
        ifestudiante.setIconifiable(true);
        ifestudiante.setMaximizable(true);
        ifestudiante.setVisible(false);

        javax.swing.GroupLayout ifestudianteLayout = new javax.swing.GroupLayout(ifestudiante.getContentPane());
        ifestudiante.getContentPane().setLayout(ifestudianteLayout);
        ifestudianteLayout.setHorizontalGroup(
            ifestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifestudianteLayout.setVerticalGroup(
            ifestudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifestudiante);
        ifestudiante.setBounds(10, 10, 600, 530);

        iffacultad.setClosable(true);
        iffacultad.setIconifiable(true);
        iffacultad.setMaximizable(true);
        iffacultad.setVisible(false);

        javax.swing.GroupLayout iffacultadLayout = new javax.swing.GroupLayout(iffacultad.getContentPane());
        iffacultad.getContentPane().setLayout(iffacultadLayout);
        iffacultadLayout.setHorizontalGroup(
            iffacultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        iffacultadLayout.setVerticalGroup(
            iffacultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(iffacultad);
        iffacultad.setBounds(10, 10, 590, 530);

        ifca.setClosable(true);
        ifca.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifca.setIconifiable(true);
        ifca.setMaximizable(true);
        ifca.setVisible(false);

        javax.swing.GroupLayout ifcaLayout = new javax.swing.GroupLayout(ifca.getContentPane());
        ifca.getContentPane().setLayout(ifcaLayout);
        ifcaLayout.setHorizontalGroup(
            ifcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifcaLayout.setVerticalGroup(
            ifcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifca);
        ifca.setBounds(10, 20, 650, 490);

        ifes.setClosable(true);
        ifes.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifes.setIconifiable(true);
        ifes.setMaximizable(true);
        ifes.setVisible(false);

        javax.swing.GroupLayout ifesLayout = new javax.swing.GroupLayout(ifes.getContentPane());
        ifes.getContentPane().setLayout(ifesLayout);
        ifesLayout.setHorizontalGroup(
            ifesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifesLayout.setVerticalGroup(
            ifesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifes);
        ifes.setBounds(10, 10, 650, 560);

        iffa.setClosable(true);
        iffa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        iffa.setIconifiable(true);
        iffa.setMaximizable(true);
        iffa.setVisible(false);

        javax.swing.GroupLayout iffaLayout = new javax.swing.GroupLayout(iffa.getContentPane());
        iffa.getContentPane().setLayout(iffaLayout);
        iffaLayout.setHorizontalGroup(
            iffaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        iffaLayout.setVerticalGroup(
            iffaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(iffa);
        iffa.setBounds(10, 10, 650, 580);

        ifreportes.setClosable(true);
        ifreportes.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifreportes.setIconifiable(true);
        ifreportes.setMaximizable(true);
        ifreportes.setVisible(false);

        javax.swing.GroupLayout ifreportesLayout = new javax.swing.GroupLayout(ifreportes.getContentPane());
        ifreportes.getContentPane().setLayout(ifreportesLayout);
        ifreportesLayout.setHorizontalGroup(
            ifreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ifreportesLayout.setVerticalGroup(
            ifreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(ifreportes);
        ifreportes.setBounds(10, 10, 660, 450);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.jpg"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        facultad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        facultad.setMnemonic('o');
        facultad.setText("Facultad");
        facultad.setInheritsPopupMenu(true);
        facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultadActionPerformed(evt);
            }
        });
        fileMenu.add(facultad);

        carrera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        carrera.setMnemonic('s');
        carrera.setText("Carrera");
        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });
        fileMenu.add(carrera);

        estudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        estudiante.setMnemonic('a');
        estudiante.setText("Estudiante");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        fileMenu.add(estudiante);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.JPG"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Reportes");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Reporte");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        ifca.setVisible(true);
        iffa.setVisible(false);
        ifes.setVisible(false);
        ifreportes.setVisible(false);
    }//GEN-LAST:event_carreraActionPerformed
    
    private void facultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultadActionPerformed
        iffa.setVisible(true);
        ifca.setVisible(false);
        ifes.setVisible(false);
        ifreportes.setVisible(false);
    }//GEN-LAST:event_facultadActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        ifes.setVisible(true);
        ifca.setVisible(false);
        iffa.setVisible(false);
        ifreportes.setVisible(false);
    }//GEN-LAST:event_estudianteActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        ifreportes.setVisible(true);
        ifes.setVisible(false);
        ifca.setVisible(false);
        iffa.setVisible(false);
    }//GEN-LAST:event_cutMenuItemActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem carrera;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem estudiante;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem facultad;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JInternalFrame ifca;
    private javax.swing.JInternalFrame ifcarrera;
    private javax.swing.JInternalFrame ifes;
    private javax.swing.JInternalFrame ifestudiante;
    private javax.swing.JInternalFrame iffa;
    private javax.swing.JInternalFrame iffacultad;
    private javax.swing.JInternalFrame ifreportes;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
