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
    private Double salario;

    //Constructor
    public cEmpleados(String nombre, String telefono, String correo, String cedula, String direccion, String puesto, Double salario) {
        super(nombre, telefono, correo, cedula, direccion);
        this.puesto = puesto;
        this.salario = salario;
    }

    //GET
    public String getPuesto() {
        return puesto;
    }

    public Double getSalario() {
        return salario;
    }

    //SET
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Metodos
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Salario: " + getSalario());
    }

}
