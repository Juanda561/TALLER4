/*
5. Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura, 
proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de 
sus lados iguales, el perímetro, el valor del ángulo vértice.
 */
package Ej5;

/**
 *
 * @author Asus
 */
public class PruebaTrianguloIsoceles {
    
    public static void main(String[] args) {
        
        Triangulo_Isoceles tr=new Triangulo_Isoceles();
        ImprimirInfo(tr);
        
    }
    
    public static void ImprimirInfo(Triangulo_Isoceles a){
        System.out.println("Base: "+a.getBase());
        System.out.println("Altura: "+a.getAltura());
        System.out.println("El area del triángulo isóceles es: "+a.Calcular_Area());
        System.out.println("La longitud de sus lados iguales es de : "+a.Calcular_Longitud_Lados());
        System.out.println("El perimetro del triángulo es: "+a.Calcular_Perimetro());
        System.out.println("El valor de su ángulo vértice es: "+a.Calcular_Angulo_Vertice()+"°");
    }
    
}
