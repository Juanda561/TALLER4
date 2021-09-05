
package Ej10;

import java.awt.AWTException;

public class principal {
 
    public static void main(String[] args) throws InterruptedException, AWTException {
        
        Reloj r=new Reloj();
        Imprimir(r);
          
    }
    
    public static void Imprimir(Reloj a) throws InterruptedException, AWTException {
                
        while (true) {
              
            if (a.getHoras()<10) {
                System.out.print("0");
            }
            System.out.print(a.getHoras()+":");
            
            if (a.getMinutos()<10) {
                System.out.print("0");
            }
            System.out.print(a.getMinutos()+":");
            
            if(a.getSegundos()<10){
                System.out.print("0");
            }
            System.out.print(a.getSegundos());
            
            //Imprime Hora militar y si es AM ó PM
            System.out.print(" Hora Militar; ");
            
            //Imprime Hora en Texto
            a.Texto();
            
            a.SSmas();
            
            if (a.getSegundos()>=60) {
                a.setSegundos(0);
                a.MMmas();
                if (a.getMinutos()>=60) {
                    a.setMinutos(0);
                    a.HHmas();
                    if (a.getHoras()>=24) {
                        a.setHoras(0);
                    }
                } 
            }
            
            Thread.sleep(1000);
            
            System.out.println("");
            
            
            
        }
        
       
        
    }
    
    
    
}
