/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos.SystemCRUD;

import controlimpuestos.cPagos;
import controlimpuestos.cConexion;
import controlimpuestos.cPagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author danie
 */
public class crudPagos {
    
    //==========================================================================
    
    public void crearPago(){
        
        //conexion bd
        
        //busqueda de datos
        
        //algoritmo de creacion de pagos
        
        //guardar en bd
        
        //cerrar conexion
        
        
    }
    
    public cPagos buscarPago(int idPago)throws SQLException {
        
        Connection conn = cConexion.getConnection();
        try{
        
            String query = "SELECT pagos.*,"
                    +"clientes.nombre"
                    + "FROM pagos JOIN cliente ON "
                    + "pagos.idPago = cliente.idCliente WHERE idPago = ?";            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, idPago);
            ResultSet res = ps.executeQuery();
            
            if(res.next()){
                
                
                int id = res.getInt("idPago");
                double monto = res.getDouble("monto");
                String fecha = res.getString("fecha");
                double impuesto = res.getDouble("impuesto");
                String nombre = res.getString("nombre");
               
            return new cPagos(id, monto, fecha, impuesto, nombre);
            
            }else {
                //no hay resultados
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }   
}
  
}
