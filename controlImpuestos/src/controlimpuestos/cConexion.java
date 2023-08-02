package controlimpuestos;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class cConexion {
    //Variables para la conexion con el servidor de base de datos (MySQL)
    public static final String DB_URL = "jdbc:mysql://localhost:3306/"; //URL de la base de datos
    public static final String DB_USER = "root"; //Usuario de la base de datos
    public static final String DB_PASS = "fidelitas1232ytu-"; //Contraseña de la base de datos

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return conn;
    }

    public static void initializeDB() {
        Connection conn = getConnection();

        try {
            conn.createStatement().execute("CREATE DATABASE IF NOT EXISTS controlimpuestos"); //Crear base de datos controlImpuestos si no existe
            conn.createStatement().execute("USE controlimpuestos"); //Usar base de datos controlImpuestos
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS clientes (" + //Crear tabla clientes si no existe
                                "idCliente int NOT NULL AUTO_INCREMENT," + 
                                "nombre VARCHAR(50) NOT NULL," + 
                                "telefono VARCHAR(10) NOT NULL," + 
                                "correo VARCHAR(50) NOT NULL," + 
                                "cedula VARCHAR(10) NOT NULL," + 
                                "direccion VARCHAR(50) NOT NULL," +
                                "PRIMARY KEY (idImpuestos)"+
                                "PRIMARY KEY (idCliente))");
            
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS impuestos (" + //Crear tabla pagos si no existe
                                "idImpuestos int NOT NULL AUTO_INCREMENT," +
                                "descripcion VARCHAR(50) NOT NULL," + 
                                "tasaImpuesto DOUBLE NOT NULL," +
                                "fechaVencimiento DATE NOT NULL)");
            
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS Pagos (" + //Crear tabla pagos si no existe
                                "idPagos int NOT NULL AUTO_INCREMENT," + 
                                "impuesto Double," + 
                                "fecha DATE," +
                                "pago FLOAT,"+
                                "PRIMARY KEY (idPagos)"+
                                "FOREIGN KEY (idCliente) REFERENCES clientes(idCliente))");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error al inicializar base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}   
