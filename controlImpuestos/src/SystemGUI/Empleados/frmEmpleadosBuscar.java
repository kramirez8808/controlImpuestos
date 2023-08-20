/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Empleados;
import javax.swing.JOptionPane;
import controlimpuestos.cEmpleados;
import controlimpuestos.SystemCRUD.crudEmpleados;

/**
 *
 * @author Rachel
 */
public class frmEmpleadosBuscar extends javax.swing.JPanel {

    /**
     * Creates new form frmEmpleadosBuscar
     */
  private crudEmpleados empleado;
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private String direccion;
    private String puesto;
    private String salario;
    
    public frmEmpleadosBuscar() {       
        initComponents();

        empleado = new crudEmpleados(); 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscar = new javax.swing.JPanel();
        h1Busqueda = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfCorreo = new javax.swing.JTextField();
        jlCedula = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        jlBuscarEmpleadoB = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jlNombre1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        tfPuesto = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        tfSalario = new javax.swing.JTextField();
        jlNombre4 = new javax.swing.JLabel();
        jlNombre2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        tfDireccion = new javax.swing.JTextField();
        jlNombre3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        tfTelefono = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(593, 508));

        pnlBuscar.setBackground(new java.awt.Color(255, 255, 255));

        h1Busqueda.setBackground(new java.awt.Color(21, 14, 48));
        h1Busqueda.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Busqueda.setText("Búsqueda de empleados");

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Nombre:");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 14, 48));

        tfNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(153, 153, 153));
        tfNombre.setText("Ingrese Nombre");
        tfNombre.setBorder(null);
        tfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreMousePressed(evt);
            }
        });

        jlCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreo.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreo.setText("Correo:");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 14, 48));

        tfCorreo.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreo.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreo.setText("Ingrese Correo");
        tfCorreo.setBorder(null);
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoActionPerformed(evt);
            }
        });

        jlCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula.setText("Cédula:");

        tfCedula.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedula.setForeground(new java.awt.Color(153, 153, 153));
        tfCedula.setText("Ingrese Cédula");
        tfCedula.setBorder(null);
        tfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCedulaActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(21, 14, 48));

        btnBuscar.setBackground(new java.awt.Color(21, 14, 48));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlBuscarEmpleadoB.setBackground(new java.awt.Color(21, 14, 48));
        jlBuscarEmpleadoB.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlBuscarEmpleadoB.setForeground(new java.awt.Color(255, 255, 255));
        jlBuscarEmpleadoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBuscarEmpleadoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/searchMini.png"))); // NOI18N
        jlBuscarEmpleadoB.setText("Buscar");
        jlBuscarEmpleadoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarEmpleadoBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlBuscarEmpleadoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlBuscarEmpleadoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(21, 14, 48));
        btnEditar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(21, 14, 48));
        btnLimpiar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jlNombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre1.setText("Puesto:");

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(21, 14, 48));

        tfPuesto.setEditable(false);
        tfPuesto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfPuesto.setForeground(new java.awt.Color(153, 153, 153));
        tfPuesto.setText("Puesto");
        tfPuesto.setBorder(null);
        tfPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfPuestoMousePressed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(21, 14, 48));

        tfSalario.setEditable(false);
        tfSalario.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfSalario.setForeground(new java.awt.Color(153, 153, 153));
        tfSalario.setText("Salario");
        tfSalario.setBorder(null);
        tfSalario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfSalarioMousePressed(evt);
            }
        });

        jlNombre4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre4.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre4.setText("Salario");

        jlNombre2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre2.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre2.setText("Dirección");

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(21, 14, 48));

        tfDireccion.setEditable(false);
        tfDireccion.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfDireccion.setForeground(new java.awt.Color(153, 153, 153));
        tfDireccion.setText("Direccion");
        tfDireccion.setBorder(null);
        tfDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfDireccionMousePressed(evt);
            }
        });

        jlNombre3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre3.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre3.setText("Telefono");

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(21, 14, 48));

        tfTelefono.setEditable(false);
        tfTelefono.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(153, 153, 153));
        tfTelefono.setText("Teléfono");
        tfTelefono.setBorder(null);
        tfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfTelefonoMousePressed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(21, 14, 48));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre3)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlBuscarLayout.createSequentialGroup()
                            .addComponent(jlCedula)
                            .addGap(61, 61, 61)
                            .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBuscarLayout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBuscarLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBuscarLayout.createSequentialGroup()
                                .addComponent(jlCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBuscarLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombre2)
                            .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlBuscarLayout.createSequentialGroup()
                                    .addComponent(jlNombre1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                    .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnlBuscarLayout.createSequentialGroup()
                                    .addComponent(jlNombre4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 252, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlCedula))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCorreo)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlNombre2))
                .addGap(8, 8, 8)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(tfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlNombre1))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre4))
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMousePressed
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfNombre.getText().equals("Ingrese el nombre del cliente")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfNombreMousePressed

    private void tfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoActionPerformed

    private void jlBuscarEmpleadoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarEmpleadoBMouseClicked

    }//GEN-LAST:event_jlBuscarEmpleadoBMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        nombre = tfNombre.getText();
        cedula = tfCedula.getText();
        correo = tfCorreo.getText();
        telefono = tfTelefono.getText();
        direccion = tfDireccion.getText();
        puesto = tfPuesto.getText();
        salario  = tfSalario.getText();

        try {
            // Buscar el estudiante en la base de datos usando la cédula
            cEmpleados EmpleadoEncontrado = empleado.buscarEmpleadoCedula(cedula);
            if (EmpleadoEncontrado != null) {
                // Si se encontró el estudiante, actualizar sus datos con la nueva información
                EmpleadoEncontrado.setNombre(nombre);
                EmpleadoEncontrado.setCedula(cedula);
                EmpleadoEncontrado.setCorreo(correo);
                EmpleadoEncontrado.setTelefono(telefono);
                EmpleadoEncontrado.setDireccion(direccion);
                EmpleadoEncontrado.setPuesto(puesto);
                EmpleadoEncontrado.setSalario(salario);

                // Llamar al método en el objeto cCrudEstudiante para actualizar el estudiante en la base de datos

                empleado.actualizarEmpleado(EmpleadoEncontrado);

                // Mostrar un mensaje de éxito
            } else {
                // Si no se encontró el estudiante, mostrar un mensaje indicando que no fue encontrado
                JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con la cédula ingresada.");
            }

        }catch(Exception e){

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

        private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {   
            cedula = tfCedula.getText();

        try{

            cEmpleados EmpleadoEncontrado = empleado.buscarEmpleadoCedula(cedula);
            if (EmpleadoEncontrado!=null)
            {
                tfNombre.setText(EmpleadoEncontrado.getNombre());
                tfCedula.setText(EmpleadoEncontrado.getCedula());
                tfCorreo.setText(EmpleadoEncontrado.getCorreo());
                tfTelefono.setText(EmpleadoEncontrado.getTelefono());
                tfDireccion.setText(EmpleadoEncontrado.getDireccion());
                tfPuesto.setText(EmpleadoEncontrado.getPuesto());
                tfSalario.setText(EmpleadoEncontrado.getSalario());
            }

        }catch(Exception e){

        }

        }                                       

    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    try {

               tfNombre.setText("");
               tfCedula.setText("");
               tfCorreo.setText("");
               tfTelefono.setText("");
               tfDireccion.setText("");
               tfPuesto.setText("");
               tfSalario.setText("");
               
           }catch(Exception e){

           }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tfPuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPuestoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPuestoMousePressed

    private void tfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedulaActionPerformed

    private void tfSalarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSalarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalarioMousePressed

    private void tfDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionMousePressed

    private void tfTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cedula = tfCedula.getText();

        try {
            // Buscar el estudiante en la base de datos usando la cédula
            cEmpleados empleadoEncontrado = empleado.buscarEmpleadoCedula(cedula);
            if (empleadoEncontrado != null) {
                int opcion =  JOptionPane.showConfirmDialog(this,"Seguro que desea eliminar el registro???",
                    "CONFIRMACION",JOptionPane.YES_NO_OPTION);
                if(opcion== JOptionPane.YES_OPTION){
                    empleado.eliminarEmpleado(empleadoEncontrado);
                    tfNombre.setText("");
                    tfCedula.setText("");
                    tfCorreo.setText("");
                    tfTelefono.setText("");
                    tfDireccion.setText("");
                    tfPuesto.setText("");
                    tfSalario.setText("");

                }
                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente.");
            } else {
                // Si no se encontró el estudiante, mostrar un mensaje indicando que no fue encontrado
                JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con la cedula ingresada.");
            }

        }catch(Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel h1Busqueda;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jlBuscarEmpleadoB;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JLabel jlNombre3;
    private javax.swing.JLabel jlNombre4;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPuesto;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
