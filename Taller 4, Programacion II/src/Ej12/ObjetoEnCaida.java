/*
. Diseñe e implemente en Java una clase que permita simular el movimiento de caída libre de un cuerpo. Defina las 
variables que considere necesarias, método constructor, getter y setter, método miembros que permitan conocer la 
distancia recorrida por el cuerpo en un tiempo t, y la velocidad final alcanzada. Cree una clase principal, instancia un 
objeto y demuestre su comportamiento.

h=(1/2)*g*t^2
vf=g*t
 */
package Ej12;

public class ObjetoEnCaida {

    private double gravedad;
    private double tiempo;
    
    public ObjetoEnCaida() {
        this.gravedad = 9.81;
        this.tiempo = 3;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double calcularDistancia(){
        double h=(this.gravedad*(this.tiempo*this.tiempo))/2;
        return h; 
    }
    
    public double velocidadFinal(){
        return this.gravedad*this.tiempo;
    }
    
    
    
    
}
