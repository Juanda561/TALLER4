/*
Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, platoActual y piñonActual, de tipo entero, 
método constructor, getters y setters, y los siguientes métodos miembros: acelerar (), frenar (), cambiarPlato (int plato), 
y cambiarPiñon (int piñon), donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual, 
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según los parámetros recibidos. Crear una clase 
principal, e instancia un objeto bicicleta y mostrar sus comportamientos.

 */
package Ej6;

public class Bicicleta {

    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
    
    
    public Bicicleta(){
        
        this.velocidadActual=200;
        this.platoActual=1;
        this.piñonActual=2;
        
    }
    
    public double getVelocidadActual(){
        return this.velocidadActual;
    }
    
    public double getPlatoActual(){
        return this.platoActual;
    }
    
    public double getPiñonActual(){
        return this.piñonActual;
    }
    
    public void setVelocidadActual(int velocidadActual){
        this.velocidadActual=velocidadActual;
    }
    
    public void setPlatoActual(int platoActual){
        this.platoActual=platoActual;
    }
    
    public void setPiñonActual(int piñonActual){
        this.piñonActual=piñonActual;
    }
    
    public int Acelerar(){
        System.out.println("Aceleraste "+this.velocidadActual+" más");
        System.out.println("-----------------");
        return this.velocidadActual=this.velocidadActual*2;
    }
    
    public int Frenar(){
        System.out.println("Frenando... ");
        
        return this.velocidadActual=this.velocidadActual/2;
    }
    
    public int CambiarPlato(int plato){
        System.out.println("Cambiaste el plato a: "+plato);
        System.out.println("------------------");
        return this.platoActual=plato;
    }
    
    public int CambiarPiñon(int piñon){
        System.out.println("Cambiaste piñón a: "+piñon);
        System.out.println("------------------");
        return this.piñonActual=piñon;
    }
    
    
}
