
package controlimpuestos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class cPagos {
    
    cClientes idCliente;
    cImpuestos tasa_impuesto;
    cImpuestos fecha;
    private Float pagos;

    public cPagos(cClientes idCliente, cImpuestos tasa_impuesto, cImpuestos fecha, Float pagos) {
        this.idCliente = idCliente;
        this.tasa_impuesto = tasa_impuesto;
        this.fecha = fecha;
        this.pagos = pagos;
    }
    
    public cClientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(cClientes idCliente) {
        this.idCliente = idCliente;
    }

    public cImpuestos getTasa_impuesto() {
        return tasa_impuesto;
    }

    public void setTasa_impuesto(cImpuestos tasa_impuesto) {
        this.tasa_impuesto = tasa_impuesto;
    }

    public cImpuestos getFecha() {
        return fecha;
    }

    public void setFecha(cImpuestos fecha) {
        this.fecha = fecha;
    }

    public Float getPagos() {
        return pagos;
    }

    public void setPagos(Float Pagos) {
        this.pagos = Pagos;
    }

    @Override
    public String toString() {
        return "cPagos{" + "idCliente=" + idCliente + ", tasa_impuesto=" + tasa_impuesto + ", fecha=" + fecha + ", Pagos=" + pagos + '}';
    }

   
    //==========================================================================
    
    public void crearPago(){
        
        //conexion bd
        
        //busqueda de datos
        
        //algoritmo de creacion de pagos
        
        //guardar en bd
        
        //cerrar conexion
        
        
    }
    
    public void buscarPago(String nombreCliente){
      
        try{
        
            Connection conn = cConexion.getConnection();        
            String consulta = "SELECT idCliente, Impuesto, fecha, Pago FROM pagos WHERE idCliente IN (SELECT idCLiente FROM clientes WHERE nombreCliente = ?)";            
            PreparedStatement ps = conn.prepareStatement(consulta);
            
            ps.setString(1, nombreCliente);
            ResultSet res = ps.executeQuery();
            
            while(res.next()){
                int idCliente = res.getInt("idCliente");
                double impuesto = res.getDouble("Impuesto");
                Date fecha = res.getDate("fecha");
                float pago = res.getFloat("Pago");
                
                
            //imprimir en pantalla informacion (temporal)
            System.out.println("ID del Cliente: " + idCliente);
            System.out.println("Impuesto correspondiente: " + impuesto);
            System.out.println("Fecha de pago: " + fecha);
            System.out.println("Pago: " + pago);
            
            }
            
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error" +e);
        }
    
        //buscar Pago
        
        //mostrar en pantalla (interfaz)
    
        //cerrar conexion
    }
    
}
