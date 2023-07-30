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
    private String idEmpleado;
    private String puesto;
    private int salario;

    //Constructor
    public cEmpleados(String idEmpleado, String puesto, int salario, String nombre, String telefono, String correo, String cedula, String direccion) {
        super(nombre, telefono, correo, cedula, direccion);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    //GET
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getSalario() {
        return salario;
    }

    //SET
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(int salario) {
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
        System.out.println("ID Empleado: " + getIdEmpleado());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Salario: " + getSalario());
    }

    //Metodos abstract
    @Override
    public void crearPersona() {
        //Pendiente
    }

}
