/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cPagos;
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
public class crudPagos {

    int idAnterior;
    String nombreCliente;
    String cedulaCliente;
    String tipoContribuyente;
    Double tasaImpuesto;
    


    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }

    //Metodo para crear un pago
    public void guardarPago(cPagos pago) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO pagos (nombre, monto, fecha, idCliente, idImpuesto)"
                + "VALUES (?,?,?,?,?)";

        try {
            
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Asignar valores a los parametros del query
            prStmt.setString(1, pago.getNombre());
            prStmt.setString(2, String.valueOf(pago.getMonto()));
            prStmt.setString(3, pago.getFecha());
            prStmt.setString(4, String.valueOf(pago.getIdCliente()));
            prStmt.setString(5, String.valueOf(pago.getIdImpuesto()));


            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar queries
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Pago registrado exitosamente. Datos creados:\n" + pago.toString(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar pago. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }

    }

    public cPagos buscarPagoID(String idBusqueda) throws SQLException {

        //Convertir el idBusqueda a int
        int idBusquedaInt = Integer.parseInt(idBusqueda);

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryID = "SELECT Pagos.nombre, Pagos.monto, Pagos.fecha, Clientes.nombre, Clientes.cedula, Clientes.tipoContribuyente, Impuestos.tasaImpuesto "
                    + "FROM Pagos "
                    + "INNER JOIN Clientes ON Pagos.idCliente=Clientes.idCliente "
                    + "INNER JOIN Impuestos ON Pagos.idImpuesto=Impuestos.idImpuesto "
                    + "WHERE Pagos.idPago = ?";
        

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
                String nombre = rs.getString(1);
                Double monto = rs.getDouble("monto");
                String fecha = rs.getString("fecha");
                idAnterior = idBusquedaInt;
                nombreCliente = rs.getString(4);
                cedulaCliente = rs.getString(5);
                tipoContribuyente = rs.getString(6);
                tasaImpuesto = rs.getDouble("tasaImpuesto");
                
            
                return new cPagos(nombre, monto, fecha, 0, 0);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el pago. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    //Metodo para actualizar la informacion del pago encontrado
    public void actualizarPago(cPagos pagoResultado, String idAnterior) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del pago
        String query = "UPDATE pagos SET nombre = ?, monto = ?, fecha = ? WHERE idPago = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, pagoResultado.getNombre());
            prStmt.setString(2, pagoResultado.getMonto().toString());
            prStmt.setString(3, pagoResultado.getFecha());
            prStmt.setString(4, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Pago actualizado.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el pago. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }

    //Metodo para eliminar el pago encontrado
    public void eliminarPago(cPagos pagosResultado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Query para eliminar el pago
        String query = "DELETE FROM pagos WHERE idPago = ?";

        try {
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el pago a eliminar dentro de la DB
            prStmt.setString(1, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Pago eliminado.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el pago. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int returnIdAnterior() {
        return idAnterior;
    }

    public String returnNombreCliente() {
        return nombreCliente;
    }

    public String returnCedulaCliente() {
        return cedulaCliente;
    }

    public String returnTipoContribuyente() {
        return tipoContribuyente;
    }

    public Double returnTasaImpuesto() {
        return tasaImpuesto;
    }
}
