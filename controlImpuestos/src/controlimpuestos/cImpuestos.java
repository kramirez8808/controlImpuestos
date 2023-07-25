package controlimpuestos;

public class cImpuestos{

    private String descripcion;
    private double tasa_impuesto;
    private String fecha;
    
    public cImpuestos (String descripcion, double tasa_impuesto, String fecha){
        this.descripcion = descripcion;
        this.tasa_impuesto = tasa_impuesto;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTasa_impuesto() {
        return tasa_impuesto;
    }

    public void setTasa_impuesto(double tasa_impuesto) {
        this.tasa_impuesto = tasa_impuesto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public void showdata(){
    System.out.println("Indique el tipo de impuesto: " + getDescripcion());
    System.out.println("Indique la tasa de impuesto: " + getTasa_impuesto());
    System.out.println("Indique la fecha de pago: " + getFecha());
}
}
