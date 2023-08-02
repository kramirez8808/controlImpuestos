package controlimpuestos;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class cConexion {
    //Variables para la conexion con el servidor de base de datos (MySQL)
    public static final String DB_URL = "jdbc:mysql://localhost:3306/"; //URL de la base de datos
    public static final String DB_USER = "root"; //Usuario de la base de datos
    public static final String DB_PASS = "root1234"; //Contraseña de la base de datos

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
            //Crear base de datos controlImpuestos si no existe
            conn.createStatement().execute("CREATE DATABASE IF NOT EXISTS controlimpuestos"); //Crear base de datos controlImpuestos si no existe

            //Usar base de datos controlImpuestos
            conn.createStatement().execute("USE controlimpuestos"); //Usar base de datos controlImpuestos

            //Crear Tabla Clientes
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS clientes (" + //Crear tabla clientes si no existe
                                "idCliente INT NOT NULL AUTO_INCREMENT," + 
                                "nombre VARCHAR(50) NOT NULL," + 
                                "telefono VARCHAR(10) NOT NULL," + 
                                "correo VARCHAR(50) NOT NULL," + 
                                "cedula VARCHAR(10) NOT NULL," + 
                                "direccion VARCHAR(100) NOT NULL," +
                                "tipoCliente VARCHAR(10) NOT NULL," +
                                "tipoContribuyente VARCHAR(30) NOT NULL," +
                                "PRIMARY KEY (idCliente))");
            
            //Crear Tabla Impuestos
            //Pendiente evaluar fechaVencimiento o fechaCreacion
            //Descripcion cambiada de 50 a 100 caracteres
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS impuestos (" + //Crear tabla pagos si no existe
                                "idImpuestos INT NOT NULL AUTO_INCREMENT," +
                                "descripcion VARCHAR(100) NOT NULL," + 
                                "tasaImpuesto DOUBLE NOT NULL," +
                                "fechaVencimiento DATE NOT NULL," +
                                "PRIMARY KEY (idImpuestos))");
            
            //Crear Tabla Pagos
            //Recordar que el idCliente y el idImpuestos son llaves foraneas, falta definirlas
            //Pendiente modificar la clase cPagos y los atributos para matchear con la base de datos
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS pagos (" + //Crear tabla pagos si no existe
                                "idPago INT NOT NULL AUTO_INCREMENT," + 
                                "monto DOUBLE NOT NULL," + 
                                "fecha DATE NOT NULL," +
                                "idCliente INT NOT NULL," +
                                "idImpuestos INT NOT NULL," +
                                "PRIMARY KEY (idPago))");

            //Crear Tabla Usuarios
            //Evaluar si se debe crear una clase cUsuarios en java para manejar los usuarios ¿?
            //Usuario VARCHAR cambiado de 50 a 30 caracteres  
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS usuarios (" + //Crear tabla clientes si no existe
                                "idUsuario INT NOT NULL AUTO_INCREMENT," + 
                                "usuario VARCHAR(30) NOT NULL," + 
                                "contrasena VARCHAR(50) NOT NULL," +
                                "PRIMARY KEY (idUsuario))");

            //Crear Tabla Empleados
            //Se agrego puesto y salario a la tabla
            //Todos los valores de FLOAT fueron cambiados por DOUBLE para hacer match al data type que estamos usando en Java
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS empleados (" + //Crear tabla empleados si no existe
                                "idEmpleado INT NOT NULL AUTO_INCREMENT," + 
                                "nombre VARCHAR(50) NOT NULL," + 
                                "telefono VARCHAR(10) NOT NULL," + 
                                "correo VARCHAR(50) NOT NULL," + 
                                "cedula VARCHAR(10) NOT NULL," + 
                                "direccion VARCHAR(100) NOT NULL," + 
                                "puesto VARCHAR(50) NOT NULL," +
                                "salario DOUBLE NOT NULL," +
                                "PRIMARY KEY (idEmpleado))");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error al inicializar base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}   
