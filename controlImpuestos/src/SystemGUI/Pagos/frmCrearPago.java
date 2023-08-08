
package SystemGUI.Pagos;

import controlimpuestos.SystemCRUD.crudPagos;
import controlimpuestos.cPagos;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class frmCrearPago extends javax.swing.JPanel {

    /**
     * Creates new form frmCrearPago
     */
    private crudPagos cPagos;   //objeto
    
    //variables
    private String nombre;
    private String monto;
    private String impuesto;
    private String fecha;

    
    public frmCrearPago() {
        initComponents();
        cPagos = new crudPagos();
        
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
        h1Busqueda = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlNombre2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jlNombre1 = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JTextField();
        jlNombre3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(630, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 550));

        h1Busqueda.setBackground(new java.awt.Color(21, 14, 48));
        h1Busqueda.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Busqueda.setText("Realizar  Pago");

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el nombre...");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });

        jlNombre2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre2.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre2.setText("Monto:");

        txtMonto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(153, 153, 153));
        txtMonto.setText("Ingrese el monto...");
        txtMonto.setBorder(null);
        txtMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMontoMousePressed(evt);
            }
        });
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        jlNombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre1.setText("Impuesto:");

        txtImpuesto.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        txtImpuesto.setForeground(new java.awt.Color(153, 153, 153));
        txtImpuesto.setText("Ingrese el impuesto...");
        txtImpuesto.setBorder(null);
        txtImpuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtImpuestoMousePressed(evt);
            }
        });
        txtImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestoActionPerformed(evt);
            }
        });

        jlNombre3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre3.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre3.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtFecha.setText("Ingrese la fecha (YYYY-MM-DD)");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addGap(547, 547, 547))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombre2)
                                    .addComponent(jlNombre1)
                                    .addComponent(jlNombre3))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre2)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlNombre3))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtMontoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMousePressed
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
    }//GEN-LAST:event_txtMontoMousePressed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtImpuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtImpuestoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestoMousePressed

    private void txtImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestoActionPerformed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        nombre = txtNombre.getText();
        String montoStr = txtMonto.getText();
        String impuestoStr = txtImpuesto.getText();
        fecha = txtFecha.getText();

        //parse doble to string
        double monto = Double.parseDouble(montoStr);
        double impuesto = Double.parseDouble(impuestoStr);
        
        cPagos nuevoPago = new cPagos(monto, fecha, impuesto, nombre);
        
        try{
            
            crudPagos crud = new crudPagos();
            crud.guardarPago(nuevoPago);

        }catch(Exception e){JOptionPane.showMessageDialog(null, "Error" +e);}
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel h1Busqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JLabel jlNombre3;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
