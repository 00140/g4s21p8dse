/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2s21p8dse;

/**
 *
 * @author Ideapad 330
 */
public class Datos {

    
    private String nombre;
    private int edad;
    private String mail;

    public Datos() {
        this.nombre = "";
        this.edad =0;
        this.mail ="";
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
