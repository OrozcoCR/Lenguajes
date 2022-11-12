/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public abstract class Contacto {
    Persona persona; 
    private String direccion;
    private int telefono;

    public Contacto(Persona persona, String direccion, int telefono) {
        this.persona = persona;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    

    public Contacto(String nombre, String edad,boolean genero,String direccion, int telefono) {
        this.persona = new Persona (nombre,edad,genero);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "persona=" + persona + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public Persona getPersona() {
        return persona;
    }
    public abstract void imprimir ();

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
        
    
}
