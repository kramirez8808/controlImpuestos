/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

/**
 *
 * @author fanta
 */
public class cClientes extends scPersona {
    //Atributos
    private String tipoCliente; //Persona fisica o juridica
    private String tipoContribuyente; //Contribuyente especial o no

    //Constructor
    public cClientes(String nombre, String telefono, String correo, String cedula, String direccion, String tipoCliente, String tipoContribuyente) {
        super(nombre, telefono, correo, cedula, direccion);
        this.tipoCliente = tipoCliente;
        this.tipoContribuyente = tipoContribuyente;
    }

    //GET
    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getTipoContribuyente() {
        return tipoContribuyente;
    }

    //SET
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setTipoContribuyente(String tipoContribuyente) {
        this.tipoContribuyente = tipoContribuyente;
    }
    
    //Metodos
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Tipo de cliente: " + getTipoCliente());
        System.out.println("Tipo de contribuyente: " + getTipoContribuyente());
    }
}
