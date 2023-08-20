/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

/**
 *
 * @author fanta
 */
public class cEmpleados extends scPersona {
    //Atributos
    private String puesto;
    private String salario;

    //Constructor
    public cEmpleados(  String nombre, String cedula, String correo,String telefono,  String direccion, String puesto, String salario) {
        super(nombre, cedula, correo,telefono,  direccion);
        this.puesto = puesto;
        this.salario = salario;
    }

    //GET

    public String getPuesto() {
        return puesto;
    }

    public String getSalario() {
        return salario;
    }

    //SET


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    //Metodos
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Salario: " + getSalario());
    }

    //Metodos abstract
    @Override
    public void crearPersona() {
        //Pendiente
    }

}
