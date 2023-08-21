package controlimpuestos;

public class cImpuestos extends scPersona{
    
    //Atributos
 
    private String descripcion;
    private String tasaImpuesto;
    private String fecha;
    
    public cImpuestos (String nombre, String cedula, String correo,String telefono, String direccion, String descripcion, String tasaImpuesto, String fecha){
        super(nombre, telefono, correo, cedula, direccion);
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
    System.out.println("Correo: " + getCorreo());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Indique el tipo de impuesto: " + getDescripcion());
    System.out.println("Indique la tasa de impuesto: " + getTasaImpuesto());
    System.out.println("Indique la fecha de pago: " + getFecha());
}
    
    @Override
    public void crearPersona() {
        //Pendiente
    }
}
