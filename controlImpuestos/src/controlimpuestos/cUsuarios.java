/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlimpuestos;

/**
 *
 * @author fanta
 */
public class cUsuarios {
    private String usuario;
    private String contrasena;

    public cUsuarios(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    //GET
    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    //SET
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString(){
        return "Usuario: " + usuario + "\nContraseña: " + contrasena;
    }
}
