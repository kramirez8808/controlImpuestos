package controlimpuestos;

public class cImpuestos{

    private String descripcion;
    private Double tasaImpuesto;
    private String fecha;
    
    public cImpuestos (String descripcion, double tasaImpuesto, String fecha){
        this.descripcion = descripcion;
        this.tasaImpuesto = tasaImpuesto;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public void setTasaImpuesto(double tasaImpuesto) {
        this.tasaImpuesto = tasaImpuesto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void showData(){
    System.out.println("Indique el tipo de impuesto: " + getDescripcion());
    System.out.println("Indique la tasa de impuesto: " + getTasaImpuesto());
    System.out.println("Indique la fecha de pago: " + getFecha());
}
}
