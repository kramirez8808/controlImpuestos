/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Clientes;

import java.awt.Color;
import controlimpuestos.SystemCRUD.crudClientes;
import controlimpuestos.cClientes;
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class frmClientesCrear extends javax.swing.JPanel {

    //Variables requeridas para obtener los datos del formulario
    private String nombre, telefono, 
    correo, cedula, direccion, 
    tipoCliente, tipoContribuyente;

    //Instancia del objeto SystemCRUD.crudClientes
    private crudClientes crudClientes;

    /**
     * Creates new form frmClientesCrear1
     */
    public frmClientesCrear() {
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
        jlTelefono = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfTelefono = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfCorreo = new javax.swing.JTextField();
        jlCedula = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jlDireccion = new javax.swing.JLabel();
        taDireccion = new javax.swing.JTextArea();
        jlcharWarning = new javax.swing.JLabel();
        btnCrear = new javax.swing.JPanel();
        jlCrear = new javax.swing.JLabel();
        cbTipoCliente = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JLabel();
        cbTipoContribuyente = new javax.swing.JComboBox<>();
        jlContribuyente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h1Registro.setBackground(new java.awt.Color(21, 14, 48));
        h1Registro.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Registro.setText("Registro de Clientes");
        add(h1Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 40));

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Nombre:");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        tfNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(153, 153, 153));
        tfNombre.setText("Ingrese el nombre");
        tfNombre.setBorder(null);
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
        });
        tfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreMousePressed(evt);
            }
        });
        add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 30));

        jlTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(21, 14, 48));
        jlTelefono.setText("Teléfono:");
        add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 230, 10));

        tfTelefono.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(153, 153, 153));
        tfTelefono.setText("Ingrese el teléfono");
        tfTelefono.setBorder(null);
        tfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfTelefonoMousePressed(evt);
            }
        });
        add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 230, 30));

        jlCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreo.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreo.setText("Correo:");
        add(jlCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 10));

        tfCorreo.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreo.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreo.setText("Ingrese el correo");
        tfCorreo.setBorder(null);
        tfCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoFocusGained(evt);
            }
        });
        tfCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCorreoMousePressed(evt);
            }
        });
        add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 30));

        jlCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula.setText("Cédula:");
        add(jlCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        tfCedula.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedula.setForeground(new java.awt.Color(153, 153, 153));
        tfCedula.setText("Ingrese la cédula");
        tfCedula.setBorder(null);
        tfCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCedulaMousePressed(evt);
            }
        });
        add(tfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(21, 14, 48));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 230, 10));

        jlDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(21, 14, 48));
        jlDireccion.setText("Dirección:");
        add(jlDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        taDireccion.setColumns(20);
        taDireccion.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        taDireccion.setForeground(new java.awt.Color(21, 14, 48));
        taDireccion.setRows(5);
        taDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        add(taDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 590, -1));

        jlcharWarning.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        jlcharWarning.setForeground(new java.awt.Color(21, 14, 48));
        jlcharWarning.setText("Max 100 caracteres.");
        add(jlcharWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

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

        cbTipoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoCliente.setForeground(new java.awt.Color(21, 14, 48));
        cbTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona Física", "Persona Jurídica" }));
        cbTipoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 14, 48)));
        add(cbTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, 30));

        jlCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(21, 14, 48));
        jlCliente.setText("Cliente:");
        add(jlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        cbTipoContribuyente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoContribuyente.setForeground(new java.awt.Color(21, 14, 48));
        cbTipoContribuyente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Especial", "Especial" }));
        cbTipoContribuyente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 14, 48)));
        add(cbTipoContribuyente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 150, 30));

        jlContribuyente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlContribuyente.setForeground(new java.awt.Color(21, 14, 48));
        jlContribuyente.setText("Contribuyente:");
        add(jlContribuyente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMousePressed
        // //Efecto tipo placeholder para el campo Nombre
        // if (tfNombre.getText().equals("Ingrese el nombre")) {
        //     tfNombre.setText("");
        //     tfNombre.setForeground(btnCrear.getForeground());
        // }
    }//GEN-LAST:event_tfNombreMousePressed

    private void tfCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCedulaMousePressed
        //Efecto tipo placeholder para el campo Cedula
        if (tfCedula.getText().equals("Ingrese la cédula")) {
            tfCedula.setText("");
            tfCedula.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfCedulaMousePressed

    private void tfCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCorreoMousePressed
        // //Efecto tipo placeholder para el campo Correo
        // if (tfCorreo.getText().equals("Ingrese el correo")) {
        //     tfCorreo.setText("");
        //     tfCorreo.setForeground(btnCrear.getForeground());
        // }
    }//GEN-LAST:event_tfCorreoMousePressed

    private void tfTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTelefonoMousePressed
        //Efecto tipo placeholder para el campo Cedula
        if (tfTelefono.getText().equals("Ingrese el teléfono")) {
            tfTelefono.setText("");
            tfTelefono.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfTelefonoMousePressed

    private void jlCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCrearMouseClicked
        //Obtener los datos de los campos
        nombre = tfNombre.getText();
        cedula = tfCedula.getText();
        correo = tfCorreo.getText();
        telefono = tfTelefono.getText();
        direccion = taDireccion.getText();
        tipoCliente = cbTipoCliente.getSelectedItem().toString();
        tipoContribuyente = cbTipoContribuyente.getSelectedItem().toString();

        //DEBUGGING ------->>>>>>>
        System.out.println("Tipo Cliente: " + tipoCliente);
        System.out.println("Tipo Contribuyente: " + tipoContribuyente);

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
        } else {
            //Crear el objeto cliente
            cClientes cliente = new cClientes(nombre, cedula, correo, telefono, direccion, tipoCliente, tipoContribuyente);

            //Agregar el los datos del objeto cliente a la DB
            try {
                //Instanciar la clase crudClientes
                crudClientes crud = new crudClientes();

                //Llamar al metodo para guardar el cliente en DB
                crud.guardarCliente(cliente);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
            }


            //Limpiar los campos
            tfNombre.setText("Ingrese el nombre");
            tfNombre.setForeground(new Color(153, 153, 153));
            tfCedula.setText("Ingrese la cédula");
            tfCedula.setForeground(new Color(153, 153, 153));
            tfCorreo.setText("Ingrese el correo");
            tfCorreo.setForeground(new Color(153, 153, 153));
            tfTelefono.setText("Ingrese el télefono");
            tfTelefono.setForeground(new Color(153, 153, 153));
            taDireccion.setText("Ingrese la dirección");
            taDireccion.setForeground(new Color(153, 153, 153));
            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Cliente creado con éxito");
        }

        

    }//GEN-LAST:event_jlCrearMouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        //Efecto tipo placeholder para el campo Nombre
        if (tfNombre.getText().equals("Ingrese el nombre")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusGained
        //Efecto tipo placeholder para el campo Correo
        if (tfCorreo.getText().equals("Ingrese el correo")) {
            tfCorreo.setText("");
            tfCorreo.setForeground(btnCrear.getForeground());
        }
    }//GEN-LAST:event_tfCorreoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCrear;
    private javax.swing.JComboBox<String> cbTipoCliente;
    private javax.swing.JComboBox<String> cbTipoContribuyente;
    private javax.swing.JLabel h1Registro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlContribuyente;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCrear;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlcharWarning;
    private javax.swing.JTextArea taDireccion;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
