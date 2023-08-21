/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import static controlimpuestos.SystemCRUD.crudClientes.queryUseDB;
import controlimpuestos.cConexion;
import controlimpuestos.cImpuestos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jsilv
 */
public class crudImpuestos {
    
    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }
    
    //Método para crear un impuesto
    public void guardarImpuesto(cImpuestos impuesto) throws SQLException {
        //Crea conexión con BD
        Connection conn = cConexion.getConnection();
        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO impuestos (nombre, descripcion, tasaImpuesto, fechaVencimiento)"
                + "VALUES (?,?,?,?)";
        
        try {
            
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Asignar valores a los parametros del query
            prStmt.setString(1, impuesto.getNombre());
            prStmt.setString(2, impuesto.getDescripcion());
            prStmt.setString(3, impuesto.getTasaImpuesto());
            prStmt.setString(4, impuesto.getFecha());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar queries
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Impuesto registrado exitosamente. Datos creados:\n" + impuesto.toString(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }
    
    //Metodos de busqueda segun el campo llenado
    public cImpuestos buscarImpuestoNombre(String nombreBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryNombre = "SELECT * FROM impuestos WHERE nombre = ?";

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
                String cedula = rs.getString("cedula");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");                
                String direccion = rs.getString("direccion");
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                
            
                return new cImpuestos(nombre, cedula, correo,telefono, direccion, descripcion, tasaImpuesto, fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }
    
    public cImpuestos buscarImpuestoCedula(String cedulaBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCedula = "SELECT * FROM impuestos WHERE cedula = ?";
        

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
                String cedula = rs.getString("cedula");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");                
                String direccion = rs.getString("direccion");
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                
            
                return new cImpuestos(nombre, cedula, correo,telefono, direccion, descripcion, tasaImpuesto, fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }
    
    public cImpuestos buscarImpuestoCorreo(String correoBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCorreo = "SELECT * FROM impuestos WHERE correo = ?";
        

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
                String cedula = rs.getString("cedula");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");                
                String direccion = rs.getString("direccion");
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                
            
                return new cImpuestos(nombre, cedula, correo,telefono, direccion, descripcion, tasaImpuesto, fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }
    
    public cImpuestos buscarImpuestoDescripcion(String descripcionBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryDescripcion = "SELECT * FROM impuestos WHERE descripcion = ?";
        

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryDescripcion);

            //Definir el campo de busqueda
            prStmt.setString(1, descripcionBusqueda);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String cedula = rs.getString("cedula");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");                
                String direccion = rs.getString("direccion");
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                
            
                return new cImpuestos(nombre, cedula, correo,telefono, direccion, descripcion, tasaImpuesto, fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }
    //Metodo para actualizar la informacion del impuesto encontrado
    public void actualizarImpuestos(cImpuestos impuesto) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del cliente
        String query = "UPDATE impuestos SET nombre = ?, cedula = ?, correo = ?,  telefono = ?, direccion = ?, descripcion = ?, tasaImpuesto = ?, fechaVencimiento = ? WHERE cedula = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, impuesto.getNombre());
            prStmt.setString(2, impuesto.getTelefono());
            prStmt.setString(3, impuesto.getCorreo());
            prStmt.setString(4, impuesto.getCedula());
            prStmt.setString(5, impuesto.getDireccion());
            prStmt.setString(6, impuesto.getDescripcion());
            prStmt.setString(7, impuesto.getTasaImpuesto());
            prStmt.setString(8, impuesto.getFecha());


            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Impuestos actualizados.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los impuestos. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }
    
    //Metodo para eliminar el impuesto encontrado
    public void eliminarImpuestos(cImpuestos impuesto){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

       

        try {
             //Query para eliminar el cliente
             String query = "DELETE FROM impuestos WHERE cedula = ?";
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el cliente a eliminar dentro de la DB
            prStmt.setString(1, impuesto.getCedula());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Impuestos eliminados.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los impuestos. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
}
