/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public  abstract class Evento {
     private String Fecha;
    private String hora;

    public Evento(String Fecha, String hora) {
        this.Fecha = Fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento{" + "Fecha=" + Fecha + ", hora=" + hora + '}';
    }
   public abstract void imprimir();
       
    
}

