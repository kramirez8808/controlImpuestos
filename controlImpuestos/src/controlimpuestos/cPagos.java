
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
    private double impuestos;
    private String nombre;

    public cPagos(double monto, String fecha, double impuestos, String nombre) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.impuestos = impuestos;
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
        return impuestos;
    }

    public void setImpuesto(double impuesto) {
        this.impuestos = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "cPagos{" + "id=" + idPago + ", monto=" + monto + ", fecha=" + fecha + ", impuesto=" + impuestos + ", cliente=" + nombre + '}';
    }
}