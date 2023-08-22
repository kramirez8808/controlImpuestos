
package controlimpuestos;

/**
 *
 * @author danie
 */
public class cPagos {
    
    private String nombre;
    private Double monto;
    private String fecha;
    private int idCliente;
    private int idImpuesto;
    

    public cPagos(String nombre, Double monto, String fecha, int idCliente, int idImpuesto) {
        this.nombre = nombre;
        this.monto = monto;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idImpuesto = idImpuesto;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdImpuesto() {
        return idImpuesto;
    }

    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdImpuesto(int idImpuesto) {
        this.idImpuesto = idImpuesto;
    }
    

    @Override
    public String toString() {
        return "cPagos{ Monto=" + monto + ", fecha=" + fecha + ", impuesto=" + idImpuesto + ", cliente=" + idCliente + '}';
    }
}