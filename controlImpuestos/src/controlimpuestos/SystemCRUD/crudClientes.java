/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cClientes;
import controlimpuestos.cConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class crudClientes {


    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }

    //Metodo para crear un cliente
    public void guardarCliente(cClientes cliente) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        try {

            //Definir SQL query para insertar datos en la tabla
            String query = "INSERT INTO clientes (nombre, telefono, correo, cedula, direccion, tipoCliente, tipoContribuyente)"
                    + "VALUES (?,?,?,?,?,?,?)";
            
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Asignar valores a los parametros del query
            prStmt.setString(1, cliente.getNombre());
            prStmt.setString(2, cliente.getTelefono());
            prStmt.setString(3, cliente.getCorreo());
            prStmt.setString(4, cliente.getCedula());
            prStmt.setString(5, cliente.getDireccion());
            prStmt.setString(6, cliente.getTipoCliente());
            prStmt.setString(7, cliente.getTipoContribuyente());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar queries
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente. Datos creados:\n" + cliente.toString(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }

    }
}
