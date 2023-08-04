/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemGUI.Clientes;

import javax.swing.JOptionPane;

import controlimpuestos.cClientes;
import controlimpuestos.SystemCRUD.crudClientes;

/**
 *
 * @author fanta
 */
public class frmClientesBuscar extends javax.swing.JPanel {

    //Variables requeridas para obtener los datos del formulario
    private String nombre, telefono, 
    correo, cedula, direccion, 
    tipoCliente, tipoContribuyente, idCliente;

    //Instancia del objeto SystemCRUD.crudClientes
    private crudClientes crudClientes;

    public static cClientes clienteResultado;

    private java.awt.Color lightGray = new java.awt.Color(153,153,153);


    /**
     * Creates new form frmTest
     */
    public frmClientesBuscar() {
        initComponents();

        //Instanciar la clase crudClientes
        crudClientes = new crudClientes();

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
        tfNombreResultado = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        tfTelefonoResultado = new javax.swing.JTextField();
        jlCorreoResultado = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tfCorreoResultado = new javax.swing.JTextField();
        jlCedula1 = new javax.swing.JLabel();
        tfCedulaResultado = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jlDireccion = new javax.swing.JLabel();
        taDireccionResultado = new javax.swing.JTextArea();
        jlcharWarning = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jlEliminar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jlEditar = new javax.swing.JLabel();
        cbTipoClienteResultado = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JLabel();
        cbTipoContribuyenteResultado = new javax.swing.JComboBox<>();
        jlContribuyente = new javax.swing.JLabel();

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
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
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
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIDFocusGained(evt);
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
        tfCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoFocusGained(evt);
            }
        });

        jlCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula.setText("Por Cédula:");

        tfCedula.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedula.setForeground(new java.awt.Color(153, 153, 153));
        tfCedula.setText("Ingrese la cédula");
        tfCedula.setBorder(null);
        tfCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCedulaFocusGained(evt);
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
                .addGap(238, 238, 238)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBuscar, "card2");

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));
        pnlResultado.setLayout(null);

        h1Registro.setBackground(new java.awt.Color(21, 14, 48));
        h1Registro.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        h1Registro.setText("Resultado de la búsqueda");
        pnlResultado.add(h1Registro);
        h1Registro.setBounds(20, 20, 260, 40);

        jlNombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(21, 14, 48));
        jlNombre1.setText("Nombre:");
        pnlResultado.add(jlNombre1);
        jlNombre1.setBounds(20, 100, 53, 17);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(21, 14, 48));
        pnlResultado.add(jSeparator5);
        jSeparator5.setBounds(90, 120, 230, 10);

        tfNombreResultado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfNombreResultado.setForeground(new java.awt.Color(21, 14, 48));
        tfNombreResultado.setBorder(null);
        pnlResultado.add(tfNombreResultado);
        tfNombreResultado.setBounds(90, 90, 230, 30);

        jlTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(21, 14, 48));
        jlTelefono.setText("Teléfono:");
        pnlResultado.add(jlTelefono);
        jlTelefono.setBounds(20, 280, 57, 17);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(21, 14, 48));
        pnlResultado.add(jSeparator6);
        jSeparator6.setBounds(90, 300, 230, 10);

        tfTelefonoResultado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfTelefonoResultado.setForeground(new java.awt.Color(21, 14, 48));
        tfTelefonoResultado.setBorder(null);
        pnlResultado.add(tfTelefonoResultado);
        tfTelefonoResultado.setBounds(90, 270, 230, 30);

        jlCorreoResultado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCorreoResultado.setForeground(new java.awt.Color(21, 14, 48));
        jlCorreoResultado.setText("Correo:");
        pnlResultado.add(jlCorreoResultado);
        jlCorreoResultado.setBounds(20, 220, 45, 17);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(21, 14, 48));
        pnlResultado.add(jSeparator7);
        jSeparator7.setBounds(90, 240, 230, 10);

        tfCorreoResultado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCorreoResultado.setForeground(new java.awt.Color(21, 14, 48));
        tfCorreoResultado.setBorder(null);
        pnlResultado.add(tfCorreoResultado);
        tfCorreoResultado.setBounds(90, 210, 230, 30);

        jlCedula1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCedula1.setForeground(new java.awt.Color(21, 14, 48));
        jlCedula1.setText("Cédula:");
        pnlResultado.add(jlCedula1);
        jlCedula1.setBounds(20, 160, 46, 17);

        tfCedulaResultado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        tfCedulaResultado.setForeground(new java.awt.Color(21, 14, 48));
        tfCedulaResultado.setBorder(null);
        pnlResultado.add(tfCedulaResultado);
        tfCedulaResultado.setBounds(90, 150, 230, 30);

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(21, 14, 48));
        pnlResultado.add(jSeparator8);
        jSeparator8.setBounds(90, 180, 230, 10);

        jlDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(21, 14, 48));
        jlDireccion.setText("Dirección:");
        pnlResultado.add(jlDireccion);
        jlDireccion.setBounds(20, 350, 60, 17);

        taDireccionResultado.setColumns(20);
        taDireccionResultado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        taDireccionResultado.setForeground(new java.awt.Color(21, 14, 48));
        taDireccionResultado.setRows(5);
        taDireccionResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlResultado.add(taDireccionResultado);
        taDireccionResultado.setBounds(20, 370, 590, 77);

        jlcharWarning.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        jlcharWarning.setForeground(new java.awt.Color(21, 14, 48));
        jlcharWarning.setText("Max 100 caracteres.");
        pnlResultado.add(jlcharWarning);
        jlcharWarning.setBounds(500, 450, 106, 15);

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlEliminar.setBackground(new java.awt.Color(21, 14, 48));
        jlEliminar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jlEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/deleteMini.png"))); // NOI18N
        jlEliminar.setText("Eliminar");
        jlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlEliminarMousePressed(evt);
            }
        });

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

        pnlResultado.add(btnEliminar);
        btnEliminar.setBounds(510, 500, 100, 40);

        btnEditar.setBackground(new java.awt.Color(21, 14, 48));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlEditar.setBackground(new java.awt.Color(21, 14, 48));
        jlEditar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlEditar.setForeground(new java.awt.Color(255, 255, 255));
        jlEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemGUI/images/editMini.png"))); // NOI18N
        jlEditar.setText("Editar");
        jlEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlEditarMouseClicked(evt);
            }
        });

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

        pnlResultado.add(btnEditar);
        btnEditar.setBounds(400, 500, 100, 40);

        cbTipoClienteResultado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoClienteResultado.setForeground(new java.awt.Color(21, 14, 48));
        cbTipoClienteResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona Física", "Persona Jurídica" }));
        cbTipoClienteResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 14, 48)));
        pnlResultado.add(cbTipoClienteResultado);
        cbTipoClienteResultado.setBounds(460, 130, 150, 30);

        jlCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(21, 14, 48));
        jlCliente.setText("Cliente:");
        pnlResultado.add(jlCliente);
        jlCliente.setBounds(350, 140, 45, 17);

        cbTipoContribuyenteResultado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoContribuyenteResultado.setForeground(new java.awt.Color(21, 14, 48));
        cbTipoContribuyenteResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contribuyente No Especial", "Contribuyente Especial" }));
        cbTipoContribuyenteResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 14, 48)));
        pnlResultado.add(cbTipoContribuyenteResultado);
        cbTipoContribuyenteResultado.setBounds(460, 250, 150, 30);

        jlContribuyente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlContribuyente.setForeground(new java.awt.Color(21, 14, 48));
        jlContribuyente.setText("Contribuyente:");
        pnlResultado.add(jlContribuyente);
        jlContribuyente.setBounds(350, 260, 91, 17);

        add(pnlResultado, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        //Obtener el texto de los campos
        nombre = tfNombre.getText();
        cedula = tfCedula.getText();
        correo = tfCorreo.getText();
        idCliente = tfID.getText();

        //Buscar y mostrar los datos segun el campo llenado
        if (!nombre.equals("") && !nombre.equals("Ingrese el nombre")) {

            //Llamar al metodo de busqueda y guardar los resultados
            try {
                clienteResultado = crudClientes.buscarClienteNombre(nombre);

                h1Busqueda.requestFocusInWindow();
                tfNombre.setText("Ingrese el nombre");
                tfNombre.setForeground(lightGray);
                tfCedula.setText("Ingrese la cédula");
                tfCedula.setForeground(lightGray);
                tfCorreo.setText("Ingrese el correo");
                tfCorreo.setForeground(lightGray);
                tfID.setText("Ingrese el ID");
                tfID.setForeground(lightGray);

                //Verificar que el cliente exista y mostrar los datos en el nuevo panel
                if (clienteResultado != null) {
                    tfNombreResultado.setText(clienteResultado.getNombre());
                    tfCedulaResultado.setText(clienteResultado.getCedula());
                    tfCorreoResultado.setText(clienteResultado.getCorreo());
                    tfTelefonoResultado.setText(clienteResultado.getTelefono());
                    taDireccionResultado.setText(clienteResultado.getDireccion());
                    cbTipoClienteResultado.setSelectedItem(clienteResultado.getTipoCliente());
                    cbTipoContribuyenteResultado.setSelectedItem(clienteResultado.getTipoContribuyente());

                    //Cambiar de panel
                    pnlBuscar.setVisible(false);
                    pnlResultado.setVisible(true);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el proceso de busqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (!cedula.equals("") && !cedula.equals("Ingrese la cédula")) {

            //Llamar al metodo de busqueda y guardar los resultados
            try {
                clienteResultado = crudClientes.buscarClienteCedula(cedula);


                h1Busqueda.requestFocusInWindow();
                tfNombre.setText("Ingrese el nombre");
                tfNombre.setForeground(lightGray);
                tfCedula.setText("Ingrese la cédula");
                tfCedula.setForeground(lightGray);
                tfCorreo.setText("Ingrese el correo");
                tfCorreo.setForeground(lightGray);
                tfID.setText("Ingrese el ID");
                tfID.setForeground(lightGray);

                //Verificar que el cliente exista y mostrar los datos en el nuevo panel
                if (clienteResultado != null) {
                    tfNombreResultado.setText(clienteResultado.getNombre());
                    tfCedulaResultado.setText(clienteResultado.getCedula());
                    tfCorreoResultado.setText(clienteResultado.getCorreo());
                    tfTelefonoResultado.setText(clienteResultado.getTelefono());
                    taDireccionResultado.setText(clienteResultado.getDireccion());
                    cbTipoClienteResultado.setSelectedItem(clienteResultado.getTipoCliente());
                    cbTipoContribuyenteResultado.setSelectedItem(clienteResultado.getTipoContribuyente());

                    //Cambiar de panel
                    pnlBuscar.setVisible(false);
                    pnlResultado.setVisible(true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el proceso de busqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (!correo.equals("") && !correo.equals("Ingrese el correo")) {
            
            //Llamar al metodo de busqueda y guardar los resultados
            try {
                clienteResultado = crudClientes.buscarClienteCorreo(correo);

                h1Busqueda.requestFocusInWindow();
                tfNombre.setText("Ingrese el nombre");
                tfNombre.setForeground(lightGray);
                tfCedula.setText("Ingrese la cédula");
                tfCedula.setForeground(lightGray);
                tfCorreo.setText("Ingrese el correo");
                tfCorreo.setForeground(lightGray);
                tfID.setText("Ingrese el ID");
                tfID.setForeground(lightGray);

                //Verificar que el cliente exista y mostrar los datos en el nuevo panel
                if (clienteResultado != null) {
                    tfNombreResultado.setText(clienteResultado.getNombre());
                    tfCedulaResultado.setText(clienteResultado.getCedula());
                    tfCorreoResultado.setText(clienteResultado.getCorreo());
                    tfTelefonoResultado.setText(clienteResultado.getTelefono());
                    taDireccionResultado.setText(clienteResultado.getDireccion());
                    cbTipoClienteResultado.setSelectedItem(clienteResultado.getTipoCliente());
                    cbTipoContribuyenteResultado.setSelectedItem(clienteResultado.getTipoContribuyente());

                    //Cambiar de panel
                    pnlBuscar.setVisible(false);
                    pnlResultado.setVisible(true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el proceso de busqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (!idCliente.equals("") && !idCliente.equals("Ingrese el ID")) {

            //Llamar al metodo de busqueda y guardar los resultados
            try {
                clienteResultado = crudClientes.buscarClienteID(idCliente);

                h1Busqueda.requestFocusInWindow();
                tfNombre.setText("Ingrese el nombre");
                tfNombre.setForeground(lightGray);
                tfCedula.setText("Ingrese la cédula");
                tfCedula.setForeground(lightGray);
                tfCorreo.setText("Ingrese el correo");
                tfCorreo.setForeground(lightGray);
                tfID.setText("Ingrese el ID");
                tfID.setForeground(lightGray);

                //Verificar que el cliente exista y mostrar los datos en el nuevo panel
                if (clienteResultado != null) {
                    tfNombreResultado.setText(clienteResultado.getNombre());
                    tfCedulaResultado.setText(clienteResultado.getCedula());
                    tfCorreoResultado.setText(clienteResultado.getCorreo());
                    tfTelefonoResultado.setText(clienteResultado.getTelefono());
                    taDireccionResultado.setText(clienteResultado.getDireccion());
                    cbTipoClienteResultado.setSelectedItem(clienteResultado.getTipoCliente());
                    cbTipoContribuyenteResultado.setSelectedItem(clienteResultado.getTipoContribuyente());

                    //Cambiar de panel
                    pnlBuscar.setVisible(false);
                    pnlResultado.setVisible(true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el proceso de busqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar al menos un campo para realizar la búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlBuscarMouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfNombre.getText().equals("Ingrese el nombre")) {
            tfNombre.setText("");
            tfNombre.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCedulaFocusGained
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfCedula.getText().equals("Ingrese la cédula")) {
            tfCedula.setText("");
            tfCedula.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfCedulaFocusGained

    private void tfCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusGained
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
            if (tfCorreo.getText().equals("Ingrese el correo")) {
            tfCorreo.setText("");
            tfCorreo.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfCorreoFocusGained

    private void tfIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusGained
        // Metodo para eliminar el texto por default y cambiar a un color más oscuro. Tambien evita que el texto se borre cuando el usuario escribe
        if (tfID.getText().equals("Ingrese el ID")) {
            tfID.setText("");
            tfID.setForeground(btnBuscar.getForeground());
        }
    }//GEN-LAST:event_tfIDFocusGained

    private void jlEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEditarMouseClicked
        //Guardar cedula anterior para la busqueda en DB
        String cedulaAnterior = clienteResultado.getCedula();

        //Obtener los datos del formulario
        nombre = tfNombreResultado.getText();
        cedula = tfCedulaResultado.getText();
        correo = tfCorreoResultado.getText();
        telefono = tfTelefonoResultado.getText();
        direccion = taDireccionResultado.getText();
        tipoCliente = cbTipoClienteResultado.getSelectedItem().toString();
        tipoContribuyente = cbTipoContribuyenteResultado.getSelectedItem().toString();

        //Verificar que los campos no esten vacios
        if (!nombre.equals("") || !cedula.equals("") || !correo.equals("") || !telefono.equals("") || !direccion.equals("")) {
            try {
                //Actualizar los datos del objeto cliente previamente encontrado
                clienteResultado.setNombre(nombre);
                clienteResultado.setCedula(cedula);
                clienteResultado.setCorreo(correo);
                clienteResultado.setTelefono(telefono);
                clienteResultado.setDireccion(direccion);
                clienteResultado.setTipoCliente(tipoCliente);
                clienteResultado.setTipoContribuyente(tipoContribuyente);

                //Llamar al metodo de actualizar
                crudClientes.actualizarCliente(clienteResultado, cedulaAnterior);

                //Mostrar mensaje de exito
                JOptionPane.showMessageDialog(null, "Cliente actualizado con éxito", "Exito", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el proceso de actualización: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlEditarMouseClicked

    private void jlEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEliminarMousePressed
        //Obtener la cedula del cliente a eliminar, se toma desde el mismo panel de resultado
        cedula = tfCedulaResultado.getText();

        //Confirmar que se desea eliminar el cliente
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try {
            //Eliminar el cliente en caso de seleccionar confirmar
            if (opcion == JOptionPane.YES_OPTION) {
                //Se invoca el metodo de eliminarCliente
                crudClientes.eliminarCliente(clienteResultado);

                //Evitar que se seleccione el campo "Por Nombre:" por defecto al volver al panel de busqueda
                h1Busqueda.requestFocusInWindow();

                //Volver a la pantalla de busqueda
                pnlResultado.setVisible(false);
                pnlBuscar.setVisible(true);


            } else {
                JOptionPane.showMessageDialog(null, "Se ha cancelado el proceso de eliminación", "Eliminación cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el proceso de eliminación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jlEliminarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JComboBox<String> cbTipoClienteResultado;
    private javax.swing.JComboBox<String> cbTipoContribuyenteResultado;
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
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCedula1;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlContribuyente;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCorreoResultado;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEditar;
    private javax.swing.JLabel jlEliminar;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlcharWarning;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTextArea taDireccionResultado;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCedulaResultado;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfCorreoResultado;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreResultado;
    private javax.swing.JTextField tfTelefonoResultado;
    // End of variables declaration//GEN-END:variables
}
