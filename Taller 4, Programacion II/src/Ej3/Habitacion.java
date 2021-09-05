/*
3. Diseñar una clase Habitación, con atributos para su largo, ancho y altura en metros. Implemente métodos habituales, 
así mismo, un método que permita calcular la cantidad de metros cuadrados que se requiere de enchape para el piso 
de la habitación, y otro que calcule cuantos metros cuadrados de papel se requiere para tapizar sus paredes
 */
package Ej3;

public class Habitacion {

    private double largo;
    private double ancho;
    private double altura;
    
    public Habitacion(){
        this.largo=4;
        this.ancho=3;
        this.altura=5;
    }
    
    public double getLargo(){
        return this.largo;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setLargo(double largo){
        this.largo=largo;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double Calcular_Metros_Cuadrados_Piso(){
        return this.ancho*this.largo;
    }
    
    public double Calcular_Metros_Cuadrados_Pared(){
        double a=(this.ancho*this.altura)*2;
        double b=(this.largo*this.altura)*2;
        
        
        return a+b;
    }
            
       
}
