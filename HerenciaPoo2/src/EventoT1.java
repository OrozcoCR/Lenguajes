/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class EventoT1 extends Evento{
    private String lugar;

    public EventoT1(String Fecha, String hora,String lugar) {
        super(Fecha, hora);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    @Override
    public void imprimir() {
        //System.out.println("EventoT1"+ this.toString());
        EventoT1Frame pantalla = new EventoT1Frame();
        pantalla.Fechatxt.setText(this.getFecha());
        pantalla.Horatxt.setText(this.getHora());
        pantalla.Lugartxt.setText(this.lugar);
        
        pantalla.setVisible(true);
}

    @Override
    public String toString() {
        return "EventoT1{" + super.toString() + '\'' +
                "lugar='" + lugar + '\'' +
                '}';
    }
    
}
/* public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "email='" + email + '\'' +
                '}';*/ 
