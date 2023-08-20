/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author danie
 */
public class cLogin {
    
    public boolean autenticarUsuario (String usuario, String contrasena )
    {
    
        Connection con = cConexion.getConnection();
    
        try{
            String query ="Select * FROM  usuarios Where usuario = ? and contrasena = ?";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
            
        }catch(Exception e)
        {
        
        }
        return false;
        
    }
}
