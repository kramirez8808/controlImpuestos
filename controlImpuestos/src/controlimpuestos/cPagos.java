
package controlimpuestos;

/**
 *
 * @author danie
 */
public class cPagos {
    
    cClientes idCliente;
    cImpuestos tasa_impuesto;
    cImpuestos fecha;

    public cPagos(cClientes idCliente, cImpuestos tasa_impuesto, cImpuestos fecha) {
        this.idCliente = idCliente;
        this.tasa_impuesto = tasa_impuesto;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "cPagos{" + "idCliente=" + idCliente + ", tasa_impuesto=" + tasa_impuesto + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
