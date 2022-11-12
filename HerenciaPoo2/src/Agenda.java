
import java.util.LinkedList;


public class Agenda {
    private LinkedList<Contacto>contactos;
     private LinkedList<Contacto>contactos2;
    
    private LinkedList<Evento>eventosT1;
    private LinkedList<Evento>eventosT2;
    

    public Agenda() {
        this.contactos = new LinkedList<>();
        this.contactos2 = new LinkedList<>();
        this.eventosT1 = new LinkedList<>();
        this.eventosT2 = new LinkedList<>();
        
    }
    
    public void agregarT1 (Contacto contactos){
        this.contactos.add(contactos);  
    }
     public void agregarT2 (Contacto contactos2){
        this.contactos2.add(contactos2);  
    }
    
     
     public void eliminarT1(String nombre){
        for(Contacto contactos : this.contactos){
            if (contactos.getPersona().getNombre().equals(nombre))
                this.contactos.remove(contactos);
        }
     
    }
      public void eliminarT2(String nombre){
        for(Contacto contactos2 : this.contactos2){
            if (contactos2.getPersona().getNombre().equals(nombre))
                this.contactos2.remove(contactos2);
            }
        }
 
    public void imprimirT1(){
      
    for (Contacto c: this.contactos){
        c.imprimir();
    }
    
    }
    public void imprimirT2(){
      
    for (Contacto c: this.contactos2){
        c.imprimir();
    }
    
    }
     public void agregarEventoT1 (Evento eventosT1){
        this.eventosT1.add(eventosT1);
}
     public void agregarEventoT2 (Evento eventosT2){
        this.eventosT2.add(eventosT2);
}
     
     public void eliminarEventoT1(String fecha){
        for(Evento eventosT1 : this.eventosT1){
            if (eventosT1.getFecha().equals(fecha))
                this.eventosT1.remove(eventosT1);
        }
     }
     
     public void eliminarEventoT2(String fecha){
        for(Evento eventosT2 : this.eventosT2){
            if (eventosT2.getFecha().equals(fecha))
                this.eventosT2.remove(eventosT2);
        }
     }
public void imprimirEventoT1 (){
      
    for (Evento e: this.eventosT1){
        e.imprimir();
        }
    }
public void imprimirEventoT2 (){
      
    for (Evento e: this.eventosT2){
        e.imprimir();
        }
    }
}