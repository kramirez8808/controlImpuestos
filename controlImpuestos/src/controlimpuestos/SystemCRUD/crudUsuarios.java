/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import static controlimpuestos.SystemCRUD.crudClientes.queryUseDB;
import controlimpuestos.cConexion;
import controlimpuestos.cUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rachel
 */



public class crudUsuarios {
    
    public cUsuarios  buscarUsuarios(String usuario)
    {
    
        Connection conn = cConexion.getConnection();
        
        try {
        String query = "SELECT * FROM usuarios WHERE usuario = ?"; 
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, usuario);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
          usuario = rs.getString("usuario");
         String contrasena = rs.getString("contrasena");

        
         return new cUsuarios(usuario,contrasena);
        }
       
        }catch(Exception e)
        
        {
            JOptionPane.showMessageDialog(null, "Error" +e);
        
        }
         return null;
    
    }
    
     public void actualizarUsuario(cUsuarios usuarios) {
        Connection conn = cConexion.getConnection();
    
    try {
        String query = "UPDATE usuarios SET usuario=?, contrasena=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, usuarios.getUsuario());
        ps.setString(2, usuarios.getContrasena());
        
        ps.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro " + e);
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                }
            }
        }
    }
}
