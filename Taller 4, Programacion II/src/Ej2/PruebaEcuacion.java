
package Ej2;


public class PruebaEcuacion {
    
    public static void main(String[] args) {
        Ecuacion e= new Ecuacion();
        ImprimirEcuacion(e);
        
    }
    
    public static void ImprimirEcuacion(Ecuacion ec){
        System.out.println("a: "+ec.geta());
        System.out.println("b: "+ec.getb());
        System.out.println("c: "+ec.getc());
        System.out.println("x: "+ec.getx());
        System.out.println("y=ax2+bx+c: "+ec.Calcular_Y());
    }
    
}
