/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

/**
 *
 * @author Asus
 */
public class principal {
    
    public static void main(String[] args) {
        
        ObjetoEnCaida ob= new ObjetoEnCaida();
        ImprimirInfo(ob);
        
    }
    
    public static void ImprimirInfo(ObjetoEnCaida a){
        System.out.println("Gravedad: "+a.getGravedad()+"m/s^2");
        System.out.println("Tiempo: "+a.getTiempo()+"s");
        System.out.println("Distancia recorrida por el cuerpo en un tiempo de "+a.getTiempo()+"sg, es: "+a.calcularDistancia()+"m");
        System.out.println("La velocidad final es: "+a.velocidadFinal()+"m/s");
    }
    
}
