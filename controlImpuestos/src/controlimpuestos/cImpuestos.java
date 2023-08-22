package controlimpuestos;

public class cImpuestos{
    
    //Atributos
    private String nombre;
    private String cedula;
    private String descripcion;
    private String tasaImpuesto;
    private String fecha;
    
    public cImpuestos (String nombre, String cedula, String descripcion, String tasaImpuesto, String fecha){
        this.nombre = nombre;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.tasaImpuesto = tasaImpuesto;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTasaImpuesto() {
        return tasaImpuesto;
    }

    public void setTasaImpuesto(String tasaImpuesto) {
        this.tasaImpuesto = tasaImpuesto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   

    public void showData(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Cedula: " + getCedula());
    System.out.println("Indique el tipo de impuesto: " + getDescripcion());
    System.out.println("Indique la tasa de impuesto: " + getTasaImpuesto());
    System.out.println("Indique la fecha de pago: " + getFecha());
}
   
}
