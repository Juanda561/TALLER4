/*
1.  Crear una clase Rectángulo, con atributos longitud y ancho. Crear también el constructor de la clase y los métodos 
necesarios para calcular el área y el perímetro. Crear otra clase PruebaRectangulo que pruebe varios rectángulos y 
muestre por pantalla sus áreas y perímetros.
 */
package Ej1;

public class Rectángulo {

    //atributos de instancia
    private double longitud;
    private double ancho;
    
    //atributos de clase
    public static final String COLOR="Negro";
    
            //constructor
    public Rectángulo(){
        this.ancho=40;
        this.longitud=25;
    }
    
    //metodos getter
    public double getAncho(){
        return this.ancho;
    }
    
    public double getLongitud(){
        return this.longitud;
    }
    
    //metodos setter
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public void setLongitud(double longitud){
        this.longitud=longitud;
    }
    
    public double Calcular_Area(){
        return this.ancho*this.longitud;
    }
    
    public double Calcular_Perímetro(){
        return (2*this.ancho)+(2*this.longitud);
    }
    
}
