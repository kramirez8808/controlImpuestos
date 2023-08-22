/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cUsuarios;
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
public class crudUsuarios {

    int idAnterior;


    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }

    //Metodo para crear un usuario
    public void guardarUsuario(cUsuarios usuario) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        boolean verificarUsuario = usuarioExiste(usuario.getUsuario());

        if (verificarUsuario == true) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe. Ingrese otro nombre de usuario", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            //Definir SQL query para insertar datos en la tabla
            String query = "INSERT INTO usuarios (usuario, contrasena)"
                    + "VALUES (?,?)";

            try {
                
                //Crear objetos PreparedStatement para ejecutar los queries
                PreparedStatement prStmt = conn.prepareStatement(query);

                //Asignar valores a los parametros del query
                prStmt.setString(1, usuario.getUsuario());
                prStmt.setString(2, usuario.getContrasena());

                //Se selecciona la base de datos
                queryUseDB(conn);

                //Ejecutar queries
                prStmt.executeUpdate();

                //Mostrar mensaje de exito
                JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente. Datos creados:\n" + usuario.toString(), "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al registrar usuario. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                //Cerrar conexion con DB
                conn.close();
            }
        }

    }

    //Metodos de busqueda segun el campo llenado
    public cUsuarios buscarUsuarioNombre(String nombreUsuario) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryFecha = "SELECT * FROM usuarios WHERE usuario = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryFecha);

            //Definir el campo de busqueda
            prStmt.setString(1, nombreUsuario);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                String usuarioBusqueda = rs.getString("usuario");
                String contrasena = rs.getString("contrasena");
                idAnterior = Integer.parseInt(rs.getString("idUsuario"));
            
                return new cUsuarios(usuarioBusqueda, contrasena);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    public cUsuarios buscarUsuarioID(String idUsuario) throws SQLException {

        //Convertir el idBusqueda a int
        int idBusquedaInt = Integer.parseInt(idUsuario);

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryID = "SELECT * FROM usuarios WHERE idUsuario = ?";
        

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
                String usuarioBusqueda = rs.getString("usuario");
                String contrasena = rs.getString("contrasena");
                idAnterior = Integer.parseInt(rs.getString("idUsuario"));
            
                return new cUsuarios(usuarioBusqueda, contrasena);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
        return null;
    }

    //Metodo para actualizar la informacion del usuario encontrado
    public void actualizarUsuario(cUsuarios usuarioResultado, String idAnterior) throws SQLException {
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Query para actualizar la informacion del usuario
        String query = "UPDATE usuarios SET usuario = ?, contrasena = ? WHERE idUsuario = ?";

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir los campos a actualizar
            prStmt.setString(1, usuarioResultado.getUsuario());
            prStmt.setString(2, usuarioResultado.getContrasena());
            prStmt.setString(3, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Usuario actualizado.", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }
    }

    //Metodo para eliminar el usuario encontrado
    public void eliminarUsuario(cUsuarios usuarioResultado){
        //Crear conexion con DB
        Connection conn = cConexion.getConnection();

        //Query para eliminar el usuario
        String query = "DELETE FROM usuarios WHERE idUsuario = ?";

        try {
            //Crear objeto PreparedStatement para ejecutar el query
            PreparedStatement prStmt = conn.prepareStatement(query);

            //Definir el campo para buscar el usuario a eliminar dentro de la DB
            prStmt.setString(1, String.valueOf(idAnterior));

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Ejecutar el query
            prStmt.executeUpdate();

            //Mostrar mensaje de exito
            JOptionPane.showMessageDialog(null, "Usuario eliminado.", "Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int returnIdAnterior() {
        return idAnterior;
    }

        public boolean usuarioExiste(String nombreUsuario) throws SQLException {

        //Crear conexion con DB
        Connection conn = cConexion.getConnection();
        
        //Queries para las busquedas segun el campo seleccionado
        String queryUsuario = "SELECT * FROM usuarios WHERE usuario = ?";
        

        try {
            //Crear objetos PreparedStatement para ejecutar los queries
            PreparedStatement prStmt = conn.prepareStatement(queryUsuario);

            //Definir el campo de busqueda
            prStmt.setString(1, nombreUsuario);

            //Se selecciona la base de datos
            queryUseDB(conn);

            //Crear objeto ResultSet para recibir los resultados de la busqueda
            ResultSet rs = prStmt.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al verificar si el usuario existe. Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            //Cerrar conexion con DB
            conn.close();
        }

        return false;
    }
}
