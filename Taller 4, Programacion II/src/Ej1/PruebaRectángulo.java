
package Ej1;

public class PruebaRectángulo {
    
    public static void main(String[] args) {
        Rectángulo r1=new Rectángulo();
        ImprimirInfoRectangulo(r1);
        
        Rectángulo r2=new Rectángulo();
        ImprimirInfoRectangulo(r2);
        
        r2.setAncho(5);
        ImprimirInfoRectangulo(r2);
        
        r2.setLongitud(15);
        ImprimirInfoRectangulo(r2);
    }
    
    public static void ImprimirInfoRectangulo(Rectángulo r){
        System.out.println("Ancho: "+r.getAncho());
        System.out.println("Longitud: "+r.getLongitud());
        System.out.println("Area: "+r.Calcular_Area());
        System.out.println("Perimetro: "+r.Calcular_Perímetro());
        System.out.println("------------------------------");
    }
}
