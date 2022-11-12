/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class EventoT2 extends Evento{
    private String medio;

    public EventoT2(String fecha,String hora,String medio) {
        super(fecha,hora);
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
    
@Override
    public void imprimir() {
       // System.out.println("EventoT2"+ this.toString());
       EventoT2Frame pantalla = new EventoT2Frame();
        pantalla.fechatxt.setText(this.getFecha());
        pantalla.horatxt.setText(this.getHora());
        pantalla.mediotxt.setText(this.medio);
        pantalla.setVisible(true);
}

    @Override
    
    public String toString() {
        return "EventoT1{" + super.toString() + '\'' +
                "medio='" + medio + '\'' +
                '}';
    }
   
    
    
}
