/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

/**
 *
 * @author Asus
 */
public class PruebaBicicleta {
    
    public static void main(String[] args) {
        
            Bicicleta b=new Bicicleta();
            ImprimirInfo(b);

            b.Acelerar();
            ImprimirInfo(b);
            
            b.CambiarPiñon(4);
            ImprimirInfo(b);
            
            b.Frenar();
            ImprimirInfo(b);
            
            b.CambiarPlato(3);
            ImprimirInfo(b);
           
    }
    
    public static void ImprimirInfo(Bicicleta a){
        
        System.out.println("Velocidad Actual: "+a.getVelocidadActual());
        System.out.println("Plato actual: "+a.getPlatoActual());
        System.out.println("Piñon Actual: "+a.getPiñonActual());
        System.out.println("------------------");
        
    }
}
