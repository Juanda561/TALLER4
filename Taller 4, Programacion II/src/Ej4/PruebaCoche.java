
package Ej4;


/**
 *
 * @author Asus
 */
public class PruebaCoche {
    
    public static void main(String[] args) {
        
        Coche c=new Coche();
        ImprimirInfo(c);
        
        Coche ch=new Coche();
        ch.setColor("rojo");
        ImprimirInfo(ch);
        
        Coche chc=new Coche();
        chc.setColor("Amarillo");
        ImprimirInfo(chc);
        
        Coche chch=new Coche();
        chch.setColor("Verde");
        ImprimirInfo(chch);
    }
    
    public static void ImprimirInfo(Coche a){
        System.out.println("Color: "+a.getColor());
        System.out.println("Marca: "+a.getMarca());
        System.out.println("Modelo: "+a.getModelo());
        System.out.println("Caballor de fuerza: "+a.getCaballos());
        System.out.println("Numero de puertas: "+a.getNumeroPuerta());
        System.out.println("Matricula: "+a.getMatricula());
        System.out.println("--------------------------------");
    }
}
