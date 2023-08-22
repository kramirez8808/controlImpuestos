/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cImpuestos;
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
public class crudImpuestos {

    int idAnterior;


    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }

    //Metodo para crear un impuesto
    public void guardarImpuesto(cImpuestos impuesto) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Definir SQL query para insertar datos en la tabla
        String query = "INSERT INTO impuestos (descripcion, tasaImpuesto, fechaVencimiento)"
                + "VALUES (?,?,?)";

        try {
            
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Asignar valores a los parametros del query
            prStmt.setString(1, impuesto.getDescripcion());
            prStmt.setString(2, String.valueOf(impuesto.getTasaImpuesto()));
            prStmt.setString(3, impuesto.getFecha());

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
    public cImpuestos buscarImpuestoFecha(String fechaBusqueda) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryFecha = "SELECT * FROM impuestos WHERE fechaVencimiento = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryFecha);

            //Definir el campo de busqueda
            prStmt.setString(1, fechaBusqueda);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                idAnterior = Integer.parseInt(rs.getString("idImpuesto"));
                
            
                return new cImpuestos(descripcion, Double.valueOf(tasaImpuesto), fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cImpuestos buscarImpuestoID(String idBusqueda) throws SQLException {

        //Convertir el idBusqueda a int
        int idBusquedaInt = Integer.parseInt(idBusqueda);

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryID = "SELECT * FROM impuestos WHERE idImpuesto = ?";
        

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
                String descripcion = rs.getString("descripcion");
                String tasaImpuesto = rs.getString("tasaImpuesto");
                String fechaVencimiento = rs.getString("fechaVencimiento");
                idAnterior = Integer.parseInt(rs.getString("idImpuesto"));
            
                return new cImpuestos(descripcion, Double.valueOf(tasaImpuesto), fechaVencimiento);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    //Metodo para actualizar la informacion del impuesto encontrado
    public void actualizarImpuesto(cImpuestos impuestoResultado, String idAnterior) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del impuesto
        String query = "UPDATE impuestos SET descripcion = ?, tasaImpuesto = ?, fechaVencimiento = ? WHERE idImpuesto = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, impuestoResultado.getDescripcion());
            prStmt.setString(2, String.valueOf(impuestoResultado.getTasaImpuesto()));
            prStmt.setString(3, impuestoResultado.getFecha());
            prStmt.setString(4, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Impuesto actualizado.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }

    //Metodo para eliminar el impuesto encontrado
    public void eliminarImpuesto(cImpuestos impuestoResultado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Query para eliminar el impuesto
        String query = "DELETE FROM impuestos WHERE idImpuesto = ?";

        try {
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el impuesto a eliminar dentro de la DB
            prStmt.setString(1, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Impuesto eliminado.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el impuesto. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int returnIdAnterior() {
        return idAnterior;
    }

}
