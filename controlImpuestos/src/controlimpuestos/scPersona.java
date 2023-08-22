/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

/**
 *
 * @author fanta
 */
abstract public class scPersona {
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;
    private String cedula;
    private String direccion;

    //Constructor
    public scPersona(String nombre, String telefono, String correo, String cedula, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodos
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Telefono: "+telefono);
        System.out.println("Correo: "+correo);
        System.out.println("Cedula: "+cedula);
        System.out.println("Direccion: "+direccion);
    }

}
