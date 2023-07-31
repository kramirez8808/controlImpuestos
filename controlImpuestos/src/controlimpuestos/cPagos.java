
package controlimpuestos;

/**
 *
 * @author danie
 */
public class cPagos {
    
    cClientes idCliente;
    cImpuestos tasa_impuesto;
    cImpuestos fecha;
    private Float Pagos;

    public cPagos(cClientes idCliente, cImpuestos tasa_impuesto, cImpuestos fecha, float Pagos) {
        this.idCliente = idCliente;
        this.tasa_impuesto = tasa_impuesto;
        this.fecha = fecha;
        this.Pagos=Pagos;
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
        return Pagos;
    }

    public void setPagos(Float Pagos) {
        this.Pagos = Pagos;
    }

    @Override
    public String toString() {
        return "cPagos{" + "idCliente=" + idCliente + ", tasa_impuesto=" + tasa_impuesto + ", fecha=" + fecha + ", Pagos=" + Pagos + '}';
    }

    
    //==========================================================================
    
    public void crearPago(){
        
        //conexion bd
        
        //busqueda de datos
        
        //algoritmo de creacion de pagos
        
        //guardar en bd
        
        //cerrar conexion
        
        
    }
    
    public void buscarPago(){

    //metodo to string pago
        
        //conexion bd
    
        //buscar Pago
    
        //mostrar en pantalla (interfaz)
    
        //cerrar conexion
    }
    
}
