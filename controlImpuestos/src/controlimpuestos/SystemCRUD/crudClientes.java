/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cClientes;
import controlimpuestos.cConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO clientes (nombre, cedula, correo, telefono, direccion, tipoCliente, tipoContribuyente)"
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            
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

    //Metodos de busqueda segun el campo llenado
    public cClientes buscarClienteNombre(String nombreBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryNombre = "SELECT * FROM clientes WHERE nombre = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryNombre);

            //Definir el campo de busqueda
            prStmt.setString(1, nombreBusqueda);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String tipoCliente = rs.getString("tipoCliente");
                String tipoContribuyente = rs.getString("tipoContribuyente");
            
                return new cClientes(nombre, telefono, correo, cedula, direccion, tipoCliente, tipoContribuyente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cClientes buscarClienteCedula(String cedulaBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCedula = "SELECT * FROM clientes WHERE cedula = ?";
        

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryCedula);

            //Definir el campo de busqueda
            prStmt.setString(1, cedulaBusqueda);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String tipoCliente = rs.getString("tipoCliente");
                String tipoContribuyente = rs.getString("tipoContribuyente");
            
                return new cClientes(nombre, telefono, correo, cedula, direccion, tipoCliente, tipoContribuyente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cClientes buscarClienteCorreo(String correoBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCorreo = "SELECT * FROM clientes WHERE correo = ?";
        

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryCorreo);

            //Definir el campo de busqueda
            prStmt.setString(1, correoBusqueda);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String tipoCliente = rs.getString("tipoCliente");
                String tipoContribuyente = rs.getString("tipoContribuyente");
            
                return new cClientes(nombre, telefono, correo, cedula, direccion, tipoCliente, tipoContribuyente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cClientes buscarClienteID(String idBusqueda) throws SQLException {

        //Convertir el idBusqueda a int
        int idBusquedaInt = Integer.parseInt(idBusqueda);

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryID = "SELECT * FROM clientes WHERE idCliente = ?";
        

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryID);

            //Definir el campo de busqueda
            prStmt.setInt(1, idBusquedaInt);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String tipoCliente = rs.getString("tipoCliente");
                String tipoContribuyente = rs.getString("tipoContribuyente");

                return new cClientes(nombre, telefono, correo, cedula, direccion, tipoCliente, tipoContribuyente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    //Metodo para actualizar la informacion del cliente encontrado
    public void actualizarCliente(cClientes clienteResultado, String cedulaAnterior) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del cliente
        String query = "UPDATE clientes SET nombre = ?, telefono = ?, correo = ?, cedula = ?, direccion = ?, tipoCliente = ?, tipoContribuyente = ? WHERE cedula = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, clienteResultado.getNombre());
            prStmt.setString(2, clienteResultado.getTelefono());
            prStmt.setString(3, clienteResultado.getCorreo());
            prStmt.setString(4, clienteResultado.getCedula());
            prStmt.setString(5, clienteResultado.getDireccion());
            prStmt.setString(6, clienteResultado.getTipoCliente());
            prStmt.setString(7, clienteResultado.getTipoContribuyente());
            prStmt.setString(8, cedulaAnterior);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Cliente actualizado.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }

    //Metodo para eliminar el cliente encontrado
    public void eliminarCliente(cClientes clienteResultado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Query para eliminar el cliente
        String query = "DELETE FROM clientes WHERE cedula = ?";

        try {
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el cliente a eliminar dentro de la DB
            prStmt.setString(1, clienteResultado.getCedula());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Cliente eliminado.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
