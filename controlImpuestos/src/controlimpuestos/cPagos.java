
package controlimpuestos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public class cPagos {
    
    private int idPago;
    private double monto;
    private String fecha;
    private double impuesto;
    private String nombre;

    public cPagos(int idPago, double monto, String fecha, double impuesto, String nombre) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.nombre = nombre;
    }

    public int getId() {
        return idPago;
    }

    public void setId(int id) {
        this.idPago = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getCliente() {
        return nombre;
    }

    public void setCliente(String cliente) {
        this.nombre = cliente;
    }

    @Override
    public String toString() {
        return "cPagos{" + "id=" + idPago + ", monto=" + monto + ", fecha=" + fecha + ", impuesto=" + impuesto + ", cliente=" + nombre + '}';
    }
}