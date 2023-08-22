/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Pagos;

import SystemGUI.Pagos.*;
import java.awt.Color;
import controlimpuestos.SystemCRUD.crudPagos;
import controlimpuestos.cPagos;
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class frmPagosCrear extends javax.swing.JPanel {

    //Variables requeridas para obtener los datos del formulario
    private String nombrePago, monto, fechaPago, idCliente, idImpuesto;

    public frmPagosCrear() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        h1Registro = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        jlMonto = new javax.swing.JLabel();
        tfMonto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JPanel();
        jlCrear = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jlIdCliente = new javax.swing.JLabel();
        tfIdCliente = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jlIdImpuesto = new javax.swing.JLabel();
        tfIdImpuesto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h1Registro.setBackground(new java.awt.Color(21, 14, 48));
        h1Registro.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Registro.setText("Registro de Pagos");
        add(h1Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 40));

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Nombre del Pago:");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, 10));

        tfNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(153, 153, 153));
        tfNombre.setText("Ingrese el nombre del pago");
        tfNombre.setBorder(null);
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
        });
        add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 230, 30));

        jlMonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlMonto.setForeground(new java.awt.Color(21, 14, 48));
        jlMonto.setText("Monto:");
        add(jlMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        tfMonto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfMonto.setForeground(new java.awt.Color(153, 153, 153));
        tfMonto.setText("Ingrese el monto del pago");
        tfMonto.setBorder(null);
        tfMonto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfMontoFocusGained(evt);
            }
        });
        add(tfMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 10));

        btnCrear.setBackground(new java.awt.Color(21, 14, 48));
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlCrear.setBackground(new java.awt.Color(21, 14, 48));
        jlCrear.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlCrear.setForeground(new java.awt.Color(255, 255, 255));
        jlCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/newMini.png"))); // NOI18N
        jlCrear.setText("Crear");
        jlCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCrearLayout = new javax.swing.GroupLayout(btnCrear);
        btnCrear.setLayout(btnCrearLayout);
        btnCrearLayout.setHorizontalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnCrearLayout.setVerticalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, 40));

        jlFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(21, 14, 48));
        jlFecha.setText("Fecha de Pago:");
        add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        tfFecha.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfFecha.setForeground(new java.awt.Color(153, 153, 153));
        tfFecha.setText("Ingrese la fecha de pago");
        tfFecha.setBorder(null);
        tfFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFechaFocusGained(evt);
            }
        });
        add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 230, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 230, 10));

        jlIdCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlIdCliente.setForeground(new java.awt.Color(21, 14, 48));
        jlIdCliente.setText("ID del Cliente:");
        add(jlIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        tfIdCliente.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfIdCliente.setForeground(new java.awt.Color(153, 153, 153));
        tfIdCliente.setText("Ingrese el ID del cliente");
        tfIdCliente.setBorder(null);
        tfIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIdClienteFocusGained(evt);
            }
        });
        add(tfIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 230, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 10));

        jlIdImpuesto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlIdImpuesto.setForeground(new java.awt.Color(21, 14, 48));
        jlIdImpuesto.setText("ID del Impuesto:");
        add(jlIdImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        tfIdImpuesto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfIdImpuesto.setForeground(new java.awt.Color(153, 153, 153));
        tfIdImpuesto.setText("Ingrese el ID del impuesto");
        tfIdImpuesto.setBorder(null);
        tfIdImpuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIdImpuestoFocusGained(evt);
            }
        });
        add(tfIdImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 230, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jlCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCrearMouseClicked
        //Obtener los datos de los campos
        nombrePago = tfNombre.getText();
        monto = tfMonto.getText();
        fechaPago = tfFecha.getText();
        idCliente = tfIdCliente.getText();
        idImpuesto = tfIdImpuesto.getText();
    

        //Validar que los campos no esten vacios
        if (nombrePago == "" || nombrePago.equals("Ingrese el nombre del pago")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del pago");
        } else if (monto == "" || monto.equals("Ingrese el monto del pago")) {
            JOptionPane.showMessageDialog(null, "Ingrese el monto del pago");
        } else if (fechaPago == "" || fechaPago.equals("Ingrese la fecha de pago")) {
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de pago");
        } else if (idCliente == "" || idCliente.equals("Ingrese el ID del cliente")) {
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente");
        } else if (idImpuesto == "" || idImpuesto.equals("Ingrese el ID del impuesto")) {
            JOptionPane.showMessageDialog(null, "Ingrese el ID del impuesto");
        } else {
            //Crear el objeto pago
            cPagos pago = new cPagos(nombrePago, Double.parseDouble(monto), fechaPago, Integer.parseInt(idCliente), Integer.parseInt(idImpuesto));

            //Agregar el los datos del objeto pago a la DB
            try {
                //Instanciar la clase crudPagos
                crudPagos crud = new crudPagos();

                //Llamar al metodo para guardar el pago en DB
                crud.guardarPago(pago);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el pago.");
            }


            //Limpiar los campos
            tfNombre.setText("Ingrese el nombre del pago");
            tfNombre.setForeground(new Color(153, 153, 153));
            tfMonto.setText("Ingrese el monto del pago");
            tfMonto.setForeground(new Color(153, 153, 153));
            tfFecha.setText("Ingrese la fecha de pago");
            tfFecha.setForeground(new Color(153, 153, 153));
            tfIdCliente.setText("Ingrese el ID del cliente");
            tfIdCliente.setForeground(new Color(153, 153, 153));
            tfIdImpuesto.setText("Ingrese el ID del impuesto");
            tfIdImpuesto.setForeground(new Color(153, 153, 153));
        }

        

    }//GEN-LAST:event_jlCrearMouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        //Efecto tipo placeholder para el campo Nombre
        if (tfNombre.getText().equals("Ingrese el nombre del pago")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfMontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMontoFocusGained
        //Efecto tipo placeholder para el campo Cedula
        if (tfMonto.getText().equals("Ingrese el monto del pago")) {
            tfMonto.setText("");
            tfMonto.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfMontoFocusGained

    private void tfFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFechaFocusGained
        // TODO add your handling code here:
        if (tfFecha.getText().equals("Ingrese la fecha de pago")) {
            tfFecha.setText("");
            tfFecha.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfFechaFocusGained

    private void tfIdClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdClienteFocusGained
        // TODO add your handling code here:
        if (tfIdCliente.getText().equals("Ingrese el ID del cliente")) {
            tfIdCliente.setText("");
            tfIdCliente.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfIdClienteFocusGained

    private void tfIdImpuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdImpuestoFocusGained
        // TODO add your handling code here:
        if (tfIdImpuesto.getText().equals("Ingrese el ID del impuesto")) {
            tfIdImpuesto.setText("");
            tfIdImpuesto.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfIdImpuestoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCrear;
    private javax.swing.JLabel h1Registro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlCrear;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlIdCliente;
    private javax.swing.JLabel jlIdImpuesto;
    private javax.swing.JLabel jlMonto;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfIdImpuesto;
    private javax.swing.JTextField tfMonto;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}