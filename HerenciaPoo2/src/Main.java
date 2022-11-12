
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Main {

    
    public static void main(String[] args) {
       Agenda agendaPersonal = new Agenda ();
       Agenda agendaEvento = new Agenda ();
        //System.out.println("Agregando contactos");
       
        agendaPersonal.agregarT1(new ContactoT1("@gmail", "pancho", "0", true, "platanar", 0));
        
        
        agendaPersonal.agregarT1(new ContactoT2("cuenta telegram", "nombre usuario", "pancho perez","0", true, "CQ", 0));
        System.out.println("------------------------------------------");

        agendaPersonal.imprimirT1();
        System.out.println("------------------------------------------");
        
        
        agendaEvento.agregarEventoT1(new EventoT1("05-diciembre-2021", "8pm","Platnar"));
        agendaEvento.agregarEventoT2(new EventoT2("5-12-2021","8 pm","zoom"));
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        agendaEvento.imprimirEventoT1();
        agendaEvento.imprimirEventoT2();
        
        

        
        
       
    }
    
}
