/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import LogicaNegocio.*;
import DAO.*;
import java.util.logging.*;
import java.sql.*;
import DAO.Conexion;
import Identidades.Carrera;
import static java.awt.Frame.ICONIFIED;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge Alberto
 */
public class frmCarrera extends javax.swing.JPanel {
TransaccionesCarrera ob=new TransaccionesCarrera();
DefaultComboBoxModel modelo;
    /**
     * Creates new form frmCarrera
     */
    public frmCarrera(){
        initComponents();
        llenar();
      //  btnagregar.setEnabled(false);
       mostrarFacultad();
    }
private  void llenar(){
    JTablecarrera.setModel(ob.mostrar());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtmaterias = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTablecarrera = new javax.swing.JTable();
        cmbfacultad = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(153, 255, 153));
        setName("Carreras"); // NOI18N

        txtcodigo.setText(" ");

        jLabel1.setText("CARRERAS");

        jLabel2.setText("Código");

        jLabel3.setText("Nombre de la carrera");

        jLabel4.setText("Cantidad de Materias");

        jLabel5.setText("Facultad");

        txtmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmateriasActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        JTablecarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTablecarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablecarreraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTablecarrera);

        cmbfacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(btnagregar)
                                .addGap(47, 47, 47)
                                .addComponent(btnmodificar)
                                .addGap(30, 30, 30)
                                .addComponent(btneliminar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(cmbfacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmateriasActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
    ob.agregar(txtnombre.getText(),txtmaterias.getText(), cmbfacultad.getSelectedItem().toString());
       llenar();
       btnagregar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Datos insertados");
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtcodigo.setText("");
        txtnombre.setText("");
        txtmaterias.setText("");
        cmbfacultad.setSelectedIndex(0);
        btnagregar.setEnabled(true);
    }//GEN-LAST:event_btnnuevoActionPerformed
    
    void limpiar()
    {
        txtcodigo.setText("");
        txtnombre.setText("");
        txtmaterias.setText("");
        cmbfacultad.setSelectedIndex(0);
        btnagregar.setEnabled(true);
    }
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       ob.modificar(txtcodigo.getText(),txtnombre.getText(),txtmaterias.getText(), cmbfacultad.getSelectedItem().toString());
        llenar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ob.eliminar(Integer.parseInt(txtcodigo.getText()));
        llenar();
        limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void JTablecarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablecarreraMouseClicked
        int f=JTablecarrera.getSelectedRow();
        txtcodigo.setText(JTablecarrera.getValueAt(f, 0).toString());
        txtnombre.setText(JTablecarrera.getValueAt(f, 1).toString());
        txtmaterias.setText(JTablecarrera.getValueAt(f, 2).toString());
        cmbfacultad.setSelectedItem(JTablecarrera.getValueAt(f, 3).toString());
    }//GEN-LAST:event_JTablecarreraMouseClicked


         
    public void mostrarFacultad() {
       Conexion con = new Conexion();
       Connection cn;
       ResultSet res;
       
       try {
            con.con();
            String sql="Select * from facultad";
            PreparedStatement pre = con.con().prepareCall(sql);
            res = pre.executeQuery();
            modelo.removeAllElements();
            while(res.next()){
                 modelo.addElement(res.getString("nombre"));
             }
           cmbfacultad.setModel(modelo); 
            con.con();
         } catch (Exception e) {
            
            System.out.println("ERROR: failed to load HSQLDB JDBC driver.");
             e.printStackTrace();
        }
                    
      }
       
    
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablecarrera;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbfacultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtmaterias;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
