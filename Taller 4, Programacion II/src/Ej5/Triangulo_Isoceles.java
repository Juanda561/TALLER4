/*
5. Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura, 
proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de 
sus lados iguales, el perímetro, el valor del ángulo vértice.
 */
package Ej5;

public class Triangulo_Isoceles {

    private double base;
    private double altura;
    
    public Triangulo_Isoceles(){
        this.base=8;
        this.altura=12;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double Calcular_Longitud_Lados(){
        double base_mitad=this.base/2;
        return Math.sqrt((this.altura*this.altura+base_mitad*base_mitad));
    }
    
    public double Calcular_Area(){
        return (this.base*this.altura)/2;
    }
    
    public double Calcular_Perimetro(){
        return Calcular_Longitud_Lados()+Calcular_Longitud_Lados()+this.base;
    }
    
    public double Calcular_Angulo_Vertice(){
        double base_mitad=(this.base/2);//saca la mitad de la base
        double tangente=this.altura/base_mitad;//opuesto/adyacente
        double radiansAux = Math.atan(tangente);//arcotangete de lo que dió en la division
        double conversion= Math.toDegrees(radiansAux);
        
        double c1=90+conversion;//se suma 90 grados+lo que dió de ese ángulo
        double c2=180-c1;//se resta 180 con la suma anterior, y da como resultado el valor del angulo
        
        return c2+c2;//pero como solamente calculamos la mitad de ese angulo, hay que sumarlo dos veces para dar con el angulo del vertice completo del triangulo isoceles
    }
}
