/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class ContactoT2 extends Contacto{
    
    
    private String telegram;
    private String fb;

    public ContactoT2(String telegram, String fb, Persona persona, String direccion, int telefono) {
        super(persona, direccion, telefono);
        this.telegram = telegram;
        this.fb = fb;
    }

    public ContactoT2(String telegram, String fb, String nombre, String edad, boolean genero, String direccion, int telefono) {
        super(nombre, edad, genero, direccion, telefono);
        this.telegram = telegram;
        this.fb = fb;
    }

    public String getTelegram() {
        return telegram;
    }

    public String getFb() {
        return fb;
    }

    public Persona getPersona() {
        return persona;
    }

   

    @Override
    public String toString() {
        return "ContactoT2{" + 
                "telegram=" + telegram + 
                ", fb=" + fb +
                '}'+ super.toString();
    }
    @Override
   public void imprimir() {
        //System.out.println("ContactoT2"+ this.toString());
        Contacto2Frame pantalla = new Contacto2Frame();
        pantalla.telegramtxt.setText(this.getTelegram());
        pantalla.fbtxt.setText(this.fb);
        pantalla.nombretxt.setText(getPersona().getNombre());
        pantalla.edadtxt.setText(getPersona().getEdad());
        pantalla.direcciontxt.setText(getDireccion());
        pantalla.setVisible(true);
       //pantalla.Fechatxt.setText(this.getFecha());
    }
    
    

    
    
    
    
}
