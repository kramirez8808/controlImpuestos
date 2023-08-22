/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Empleados;

import java.awt.Color;

import javax.swing.JOptionPane;

import controlimpuestos.cEmpleados;
import controlimpuestos.SystemCRUD.crudEmpleados;

/**
 *
 * @author Rachel
 */
public class frmEmpleadosCrear extends javax.swing.JPanel {

    //Variables requeridas para obtener los datos del formulario
    private String nombre, telefono, 
    correo, cedula, direccion, 
    puesto, salario;


    /**
     * Creates new form frmEmpleadosCrear
     */
    public frmEmpleadosCrear() {
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

        jPanel1 = new javax.swing.JPanel();
        h1Registro = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNombreEmpleado = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfTelefonoEmpleado = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfCorreoEmpleado = new javax.swing.JTextField();
        jlCedula = new javax.swing.JLabel();
        tfCedulaEmpleado = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jlDireccion = new javax.swing.JLabel();
        taDireccionEmpleado = new javax.swing.JTextArea();
        jlcharWarning = new javax.swing.JLabel();
        btnCrear = new javax.swing.JPanel();
        jlCrear = new javax.swing.JLabel();
        jlPuesto = new javax.swing.JLabel();
        tfPuestoEmpleado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        tfSalarioEmpleado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jlSalario = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h1Registro.setBackground(new java.awt.Color(21, 14, 48));
        h1Registro.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Registro.setText("Registro de Empleados");
        jPanel1.add(h1Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 40));

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Nombre:");
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        tfNombreEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombreEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfNombreEmpleado.setText("Ingrese el nombre");
        tfNombreEmpleado.setBorder(null);
        tfNombreEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 30));

        jlTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(21, 14, 48));
        jlTelefono.setText("Teléfono:");
        jPanel1.add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 230, 10));

        tfTelefonoEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfTelefonoEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfTelefonoEmpleado.setText("Ingrese el teléfono");
        tfTelefonoEmpleado.setBorder(null);
        tfTelefonoEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTelefonoEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 230, 30));

        jlCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreo.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreo.setText("Correo:");
        jPanel1.add(jlCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 10));

        tfCorreoEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreoEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreoEmpleado.setText("Ingrese el correo");
        tfCorreoEmpleado.setBorder(null);
        tfCorreoEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 30));

        jlCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula.setText("Cédula:");
        jPanel1.add(jlCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        tfCedulaEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedulaEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfCedulaEmpleado.setText("Ingrese la cédula");
        tfCedulaEmpleado.setBorder(null);
        tfCedulaEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCedulaEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfCedulaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 230, 10));

        jlDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(21, 14, 48));
        jlDireccion.setText("Dirección:");
        jPanel1.add(jlDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        taDireccionEmpleado.setColumns(20);
        taDireccionEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        taDireccionEmpleado.setForeground(new java.awt.Color(21, 14, 48));
        taDireccionEmpleado.setRows(5);
        taDireccionEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(taDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 590, -1));

        jlcharWarning.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        jlcharWarning.setForeground(new java.awt.Color(21, 14, 48));
        jlcharWarning.setText("Max 100 caracteres.");
        jPanel1.add(jlcharWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        btnCrear.setBackground(new java.awt.Color(21, 14, 48));
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlCrear.setBackground(new java.awt.Color(21, 14, 48));
        jlCrear.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlCrear.setForeground(new java.awt.Color(255, 255, 255));
        jlCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/newMini.png"))); // NOI18N
        jlCrear.setText("Crear");
        jlCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlCrearMousePressed(evt);
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

        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, 40));

        jlPuesto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlPuesto.setForeground(new java.awt.Color(21, 14, 48));
        jlPuesto.setText("Puesto:");
        jPanel1.add(jlPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        tfPuestoEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfPuestoEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfPuestoEmpleado.setText("Ingrese el puesto");
        tfPuestoEmpleado.setBorder(null);
        tfPuestoEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPuestoEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfPuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 170, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 170, 10));

        tfSalarioEmpleado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfSalarioEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tfSalarioEmpleado.setText("Ingrese el salario");
        tfSalarioEmpleado.setBorder(null);
        tfSalarioEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSalarioEmpleadoFocusGained(evt);
            }
        });
        jPanel1.add(tfSalarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(21, 14, 48));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 180, 10));

        jlSalario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlSalario.setForeground(new java.awt.Color(21, 14, 48));
        jlSalario.setText("Salario:");
        jPanel1.add(jlSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfCedulaEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCedulaEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfCedulaEmpleado.getText().equals("Ingrese la cédula")) {
            tfCedulaEmpleado.setText("");
            tfCedulaEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfCedulaEmpleadoFocusGained

    private void tfTelefonoEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefonoEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfTelefonoEmpleado.getText().equals("Ingrese el teléfono")) {
            tfTelefonoEmpleado.setText("");
            tfTelefonoEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfTelefonoEmpleadoFocusGained

    private void tfPuestoEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPuestoEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfPuestoEmpleado.getText().equals("Ingrese el puesto")) {
            tfPuestoEmpleado.setText("");
            tfPuestoEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfPuestoEmpleadoFocusGained

    private void tfSalarioEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSalarioEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfSalarioEmpleado.getText().equals("Ingrese el salario")) {
            tfSalarioEmpleado.setText("");
            tfSalarioEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfSalarioEmpleadoFocusGained

    private void tfNombreEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfNombreEmpleado.getText().equals("Ingrese el nombre")) {
            tfNombreEmpleado.setText("");
            tfNombreEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfNombreEmpleadoFocusGained

    private void tfCorreoEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoEmpleadoFocusGained
        // TODO add your handling code here:
        if (tfCorreoEmpleado.getText().equals("Ingrese el correo")) {
            tfCorreoEmpleado.setText("");
            tfCorreoEmpleado.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfCorreoEmpleadoFocusGained

    private void jlCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCrearMousePressed
        // TODO add your handling code here:
                //Obtener los datos de los campos
        nombre = tfNombreEmpleado.getText();
        cedula = tfCedulaEmpleado.getText();
        correo = tfCorreoEmpleado.getText();
        telefono = tfTelefonoEmpleado.getText();
        direccion = taDireccionEmpleado.getText();
        puesto = tfPuestoEmpleado.getText();
        salario = tfSalarioEmpleado.getText();

        //Validar que los campos no esten vacios
        if (nombre == null || nombre.equals("Ingrese el nombre")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre");
        } else if (cedula == null || cedula.equals("Ingrese la cédula")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula");
        } else if (correo == null || correo.equals("Ingrese el correo")) {
            JOptionPane.showMessageDialog(null, "Ingrese el correo");
        } else if (telefono == null || telefono.equals("Ingrese el télefono")) {
            JOptionPane.showMessageDialog(null, "Ingrese el teléfono");
        } else if (direccion == null || direccion.equals("Ingrese la dirección")) {
            JOptionPane.showMessageDialog(null, "Ingrese la dirección");
        } else if (puesto == null || puesto.equals("Ingrese el puesto")) {
            JOptionPane.showMessageDialog(null, "Ingrese el puesto");
        } else if (salario == null || salario.equals("Ingrese el salario")) {
            JOptionPane.showMessageDialog(null, "Ingrese el salario. Asegúrese que es un número");
        } else {
            //Crear el objeto empleado
            cEmpleados empleado = new cEmpleados(nombre, telefono, correo, cedula, direccion, puesto, Double.valueOf(salario));

            //Agregar el los datos del objeto empleado a la DB
            try {
                //Instanciar la clase crudEmpleados
                crudEmpleados crud = new crudEmpleados();

                //Llamar al metodo para guardar el empleado en DB
                crud.guardarEmpleado(empleado);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el empleado");
            }


            //Limpiar los campos
            tfNombreEmpleado.setText("Ingrese el nombre");
            tfNombreEmpleado.setForeground(new Color(153, 153, 153));
            tfCedulaEmpleado.setText("Ingrese la cédula");
            tfCedulaEmpleado.setForeground(new Color(153, 153, 153));
            tfCorreoEmpleado.setText("Ingrese el correo");
            tfCorreoEmpleado.setForeground(new Color(153, 153, 153));
            tfTelefonoEmpleado.setText("Ingrese el télefono");
            tfTelefonoEmpleado.setForeground(new Color(153, 153, 153));
            taDireccionEmpleado.setText("Ingrese la dirección");
            taDireccionEmpleado.setForeground(new Color(153, 153, 153));
            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Cliente creado con éxito");
        }
    }//GEN-LAST:event_jlCrearMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCrear;
    private javax.swing.JLabel h1Registro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCrear;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPuesto;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlcharWarning;
    private javax.swing.JTextArea taDireccionEmpleado;
    private javax.swing.JTextField tfCedulaEmpleado;
    private javax.swing.JTextField tfCorreoEmpleado;
    private javax.swing.JTextField tfNombreEmpleado;
    private javax.swing.JTextField tfPuestoEmpleado;
    private javax.swing.JTextField tfSalarioEmpleado;
    private javax.swing.JTextField tfTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
