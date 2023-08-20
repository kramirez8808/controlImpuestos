
package controlimpuestos.SystemCRUD;

import controlimpuestos.cConexion;
import controlimpuestos.cPagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class crudPagos {
    
    public static void queryUseDB(Connection conn) throws SQLException {
        String selectDB = "USE controlImpuestos";
        
        PreparedStatement prStmt = conn.prepareStatement(selectDB);
        prStmt.executeUpdate();
    }
 
    public void guardarPago(cPagos pago)throws SQLException {
  
        Connection conn = cConexion.getConnection();
        
        String query = "INSERT INTO pagos (monto, fecha, impuestos, nombre)"
                + "VALUES (?,?,?,?)";
         
        try{
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setDouble(1, pago.getMonto());
            ps.setString(2,pago.getFecha());
            ps.setDouble(3,pago.getImpuestos());
            ps.setString(4,pago.getNombre());
            
            queryUseDB(conn);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Pago realizado");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al realizar el pago " +e.getMessage());
        }finally{
            conn.close();
        
        }
    }
    
    public cPagos buscarPago(int idPago)throws SQLException {
        
        Connection conn = cConexion.getConnection();
        
        String query = "SELECT * FROM pagos WHERE idPago = ?";
        
        try{
                     
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, idPago);
            
            queryUseDB(conn);
            
            ResultSet res = ps.executeQuery();
            
            if(res.next()){
                
                
                int id = res.getInt("idPago");
                double monto = res.getDouble("monto");
                String fecha = res.getString("fecha");
                double impuestos = res.getDouble("impuestos");
                String nombre = res.getString("nombre");
               
            return new cPagos(monto, fecha, impuestos, nombre);
            
            }else {
                JOptionPane.showMessageDialog(null,"No hay resulatdos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
                conn.close();
            }
        
        return null;
    }
}
   