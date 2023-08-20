/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import static controlimpuestos.SystemCRUD.crudClientes.queryUseDB;
import controlimpuestos.cEmpleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controlimpuestos.cEmpleados;
import controlimpuestos.cConexion;


/**
 *
 * @author Rachel
 */
public class crudEmpleados {
    
    public void guardarEmpleado(cEmpleados empleado) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO empleados (nombre, cedula, correo, telefono, direccion, puesto, salario)"
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Asignar valores a los parametros del query
            prStmt.setString(1, empleado.getNombre());
            prStmt.setString(2, empleado.getTelefono());
            prStmt.setString(3, empleado.getCorreo());
            prStmt.setString(4, empleado.getCedula());
            prStmt.setString(5, empleado.getDireccion());
            prStmt.setString(6, empleado.getPuesto());
            prStmt.setString(7, empleado.getSalario());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar queries
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente. Datos creados:\n" + empleado.toString(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }

    }
    //Metodos de busqueda segun el campo llenado
    public cEmpleados buscarEmpleadoNombre(String nombreBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryNombre = "SELECT * FROM empleados WHERE nombre = ?";

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
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, cedula, correo,telefono,  direccion, puesto, salario);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cEmpleados buscarEmpleadoCedula(String cedulaBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCedula = "SELECT * FROM empleados WHERE cedula = ?";
        

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
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, cedula, correo,telefono,  direccion, puesto, salario);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cEmpleados buscarEmpleadoCorreo(String correoBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryCorreo = "SELECT * FROM empleados WHERE correo = ?";
        

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
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, cedula, correo,telefono,  direccion, puesto, salario);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    

    //Metodo para actualizar la informacion del Empleado encontrado
    public void actualizarEmpleado(cEmpleados empleado) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del cliente
        String query = "UPDATE empleados SET nombre = ?, cedula = ?, correo = ?,  telefono = ?, direccion = ?, puesto = ?, salario = ? WHERE cedula = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, empleado.getNombre());
            prStmt.setString(2, empleado.getTelefono());
            prStmt.setString(3, empleado.getCorreo());
            prStmt.setString(4, empleado.getCedula());
            prStmt.setString(5, empleado.getDireccion());
            prStmt.setString(6, empleado.getPuesto());
            prStmt.setString(7, empleado.getSalario());


            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Empleado actualizado.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }

    //Metodo para eliminar el empleado encontrado
    public void eliminarEmpleado(cEmpleados empleado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

       

        try {
             //Query para eliminar el cliente
             String query = "DELETE FROM empleados WHERE cedula = ?";
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el cliente a eliminar dentro de la DB
            prStmt.setString(1, empleado.getCedula());

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Empleado eliminado.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
}
