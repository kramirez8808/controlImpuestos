/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Clientes;

/**
 *
 * @author fanta
 */
public class frmClientesBuscar extends javax.swing.JPanel {

    /**
     * Creates new form frmTest
     */
    public frmClientesBuscar() {
        initComponents();
        pnlBuscar.setVisible(true);
        pnlResultado.setVisible(false);
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
        jlID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfID = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfCorreo = new javax.swing.JTextField();
        jlCedula = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        jlBuscar = new javax.swing.JLabel();
        pnlResultado = new javax.swing.JPanel();
        h1Registro = new javax.swing.JLabel();
        jlNombre1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tfNombre1 = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        tfTelefono = new javax.swing.JTextField();
        jlCorreo1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tfCorreo1 = new javax.swing.JTextField();
        jlCedula1 = new javax.swing.JLabel();
        tfCedula1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jlDireccion = new javax.swing.JLabel();
        taDireccion = new javax.swing.JTextArea();
        jlcharWarning = new javax.swing.JLabel();
        tfID1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jlID1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jlEliminar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jlEditar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        pnlBuscar.setBackground(new java.awt.Color(255, 255, 255));

        h1Busqueda.setBackground(new java.awt.Color(21, 14, 48));
        h1Busqueda.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Busqueda.setText("Búsqueda de clientes");

        jlNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre.setText("Por Nombre:");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(21, 14, 48));

        tfNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(153, 153, 153));
        tfNombre.setText("Ingrese el nombre");
        tfNombre.setBorder(null);
        tfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreMousePressed(evt);
            }
        });

        jlID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlID.setForeground(new java.awt.Color(21, 14, 48));
        jlID.setText("Por ID:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(21, 14, 48));

        tfID.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfID.setForeground(new java.awt.Color(153, 153, 153));
        tfID.setText("Ingrese el ID");
        tfID.setBorder(null);
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        jlCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreo.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreo.setText("Por Correo:");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(21, 14, 48));

        tfCorreo.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreo.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreo.setText("Ingrese el correo");
        tfCorreo.setBorder(null);
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoActionPerformed(evt);
            }
        });

        jlCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula.setText("Por Cédula:");

        tfCedula.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedula.setForeground(new java.awt.Color(153, 153, 153));
        tfCedula.setText("Ingrese la cédula");
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

        jlBuscar.setBackground(new java.awt.Color(21, 14, 48));
        jlBuscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jlBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/searchMini.png"))); // NOI18N
        jlBuscar.setText("Buscar");
        jlBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addGap(32, 32, 32)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jlID)
                        .addGap(39, 39, 39)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(jlCedula)
                        .addGap(39, 39, 39)
                        .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(jlCorreo)
                        .addGap(40, 40, 40)
                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(h1Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombre)
                            .addComponent(jlID))))
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlCedula))
                    .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlCorreo))
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBuscar, "card2");

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));

        h1Registro.setBackground(new java.awt.Color(21, 14, 48));
        h1Registro.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Registro.setText("Resultado de la búsqueda");

        jlNombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre1.setText("Nombre:");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(21, 14, 48));

        tfNombre1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombre1.setForeground(new java.awt.Color(21, 14, 48));
        tfNombre1.setBorder(null);
        tfNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombre1MousePressed(evt);
            }
        });

        jlTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(21, 14, 48));
        jlTelefono.setText("Teléfono:");

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(21, 14, 48));

        tfTelefono.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(21, 14, 48));
        tfTelefono.setBorder(null);
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        jlCorreo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreo1.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreo1.setText("Correo:");

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(21, 14, 48));

        tfCorreo1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreo1.setForeground(new java.awt.Color(21, 14, 48));
        tfCorreo1.setBorder(null);
        tfCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreo1ActionPerformed(evt);
            }
        });

        jlCedula1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula1.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula1.setText("Cédula:");

        tfCedula1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedula1.setForeground(new java.awt.Color(21, 14, 48));
        tfCedula1.setBorder(null);
        tfCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCedula1ActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(21, 14, 48));

        jlDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(21, 14, 48));
        jlDireccion.setText("Dirección:");

        taDireccion.setColumns(20);
        taDireccion.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        taDireccion.setForeground(new java.awt.Color(21, 14, 48));
        taDireccion.setRows(5);
        taDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jlcharWarning.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        jlcharWarning.setForeground(new java.awt.Color(21, 14, 48));
        jlcharWarning.setText("Max 100 caracteres.");

        tfID1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfID1.setForeground(new java.awt.Color(21, 14, 48));
        tfID1.setBorder(null);
        tfID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfID1ActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(21, 14, 48));

        jlID1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlID1.setForeground(new java.awt.Color(21, 14, 48));
        jlID1.setText("ID:");

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlEliminar.setBackground(new java.awt.Color(21, 14, 48));
        jlEliminar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jlEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/deleteMini.png"))); // NOI18N
        jlEliminar.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(21, 14, 48));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlEditar.setBackground(new java.awt.Color(21, 14, 48));
        jlEditar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlEditar.setForeground(new java.awt.Color(255, 255, 255));
        jlEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/editMini.png"))); // NOI18N
        jlEditar.setText("Editar");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlResultadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(h1Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addComponent(jlNombre1)
                            .addGap(17, 17, 17)
                            .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(jlID1)
                            .addGap(14, 14, 14)
                            .addComponent(tfID1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addComponent(jlCedula1)
                            .addGap(24, 24, 24)
                            .addComponent(tfCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addComponent(jlCorreo1)
                            .addGap(25, 25, 25)
                            .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addComponent(jlTelefono)
                            .addGap(13, 13, 13)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jlDireccion)
                        .addComponent(taDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(480, 480, 480)
                            .addComponent(jlcharWarning))
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlResultadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(h1Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNombre1)
                                .addComponent(jlID1))))
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jlCedula1))
                        .addComponent(tfCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jlCorreo1))
                        .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jlTelefono))
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jlDireccion)
                    .addGap(3, 3, 3)
                    .addComponent(taDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jlcharWarning)
                    .addGap(35, 35, 35)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(pnlResultado, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMousePressed
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfNombre.getText().equals("Ingrese el nombre del cliente")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfNombreMousePressed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoActionPerformed

    private void tfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedulaActionPerformed

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        pnlBuscar.setVisible(false);
        pnlResultado.setVisible(true);

    }//GEN-LAST:event_jlBuscarMouseClicked

    private void tfNombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombre1MousePressed
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfNombre.getText().equals("Ingrese el nombre del cliente")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnEliminar.getForeground());
        }
    }//GEN-LAST:event_tfNombre1MousePressed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreo1ActionPerformed

    private void tfCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedula1ActionPerformed

    private void tfID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfID1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel h1Busqueda;
    private javax.swing.JLabel h1Registro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCedula1;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCorreo1;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEditar;
    private javax.swing.JLabel jlEliminar;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlID1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlcharWarning;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTextArea taDireccion;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCedula1;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfCorreo1;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfID1;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
