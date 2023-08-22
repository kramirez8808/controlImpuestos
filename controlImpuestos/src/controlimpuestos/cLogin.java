/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public class cLogin {
    public boolean autenticarUsuario (String usuario, String contrasena )
    {
    
        Connection con = cConexion.getConnection();
    
        try{
            String query ="SELECT * FROM  usuarios WHERE usuario = ? AND contrasena = ?";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, usuario);
            ps.setString(2, contrasena);

            System.out.println(query);
            
            queryUseDB(con);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
            
        }catch(Exception e)
        {
        
        }
        return false;
        
    }

    //Metodo para seleccionar la base de datos
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos"; //Query para seleccionar la base de datos
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }
}
