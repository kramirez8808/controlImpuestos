/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cEmpleados;
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
public class crudEmpleados {


    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }

    //Metodo para crear un Empleado
    public void guardarEmpleado(cEmpleados empleado) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO empleados (nombre, telefono, correo, cedula, direccion, puesto, salario)"
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
            prStmt.setString(7, String.valueOf(empleado.getSalario()));

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
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, telefono, correo, cedula, direccion, puesto, Double.valueOf(salario));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, telefono, correo, cedula, direccion, puesto, Double.valueOf(salario));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, telefono, correo, cedula, direccion, puesto, Double.valueOf(salario));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cEmpleados buscarEmpleadoID(String idBusqueda) throws SQLException {

        //Convertir el idBusqueda a int
        int idBusquedaInt = Integer.parseInt(idBusqueda);

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryID = "SELECT * FROM empleados WHERE idEmpleado = ?";
        

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
                String puesto = rs.getString("puesto");
                String salario = rs.getString("salario");
            
                return new cEmpleados(nombre, telefono, correo, cedula, direccion, puesto, Double.valueOf(salario));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el empleado. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    //Metodo para actualizar la informacion del empleado encontrado
    public void actualizarEmpleado(cEmpleados empleadoResultado, String cedulaAnterior) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del empleado
        String query = "UPDATE empleados SET nombre = ?, telefono = ?, correo = ?, cedula = ?, direccion = ?, puesto = ?, salario = ? WHERE cedula = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, empleadoResultado.getNombre());
            prStmt.setString(2, empleadoResultado.getTelefono());
            prStmt.setString(3, empleadoResultado.getCorreo());
            prStmt.setString(4, empleadoResultado.getCedula());
            prStmt.setString(5, empleadoResultado.getDireccion());
            prStmt.setString(6, empleadoResultado.getPuesto());
            prStmt.setString(7, String.valueOf(empleadoResultado.getSalario()));
            prStmt.setString(8, cedulaAnterior);

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
    public void eliminarEmpleado(cEmpleados empleadoResultado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Query para eliminar el empleado
        String query = "DELETE FROM empleados WHERE cedula = ?";

        try {
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el empleado a eliminar dentro de la DB
            prStmt.setString(1, empleadoResultado.getCedula());

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
