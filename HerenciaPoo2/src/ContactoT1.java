/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class ContactoT1 extends Contacto{
   private String email; 

    public ContactoT1(String email, Persona persona, String direccion, int telefono) {
        super(persona, direccion, telefono);
        this.email = email;
    }

    public ContactoT1(String email, String nombre, String edad, boolean genero, String direccion, int telefono) {
        super(nombre, edad, genero, direccion, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
   public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "email='" + email + '\'' +
                '}';
    }
    
;

    @Override
    public void imprimir() {
        System.out.println("ContactoT1"+ this.toString());
        Contacto1Frame pantalla = new Contacto1Frame();
        pantalla.mailtxt.setText(email);
        pantalla.nombretxt.setText(getPersona().getNombre());
        pantalla.edadtxt.setText(getPersona().getEdad());
        pantalla.direcciontxt.setText(getDireccion());
        pantalla.setVisible(true);
       
    }


}
