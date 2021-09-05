/*
3. Diseñar una clase Habitación, con atributos para su largo, ancho y altura en metros. Implemente métodos habituales, 
así mismo, un método que permita calcular la cantidad de metros cuadrados que se requiere de enchape para el piso 
de la habitación, y otro que calcule cuantos metros cuadrados de papel se requiere para tapizar sus paredes
 */
package Ej3;


public class PruebaHabitacion {

    public static void main(String[] args) {
        Habitacion h=new Habitacion();
        Imprimir_datos(h);
    }
    
    public static void Imprimir_datos(Habitacion a){
        System.out.println("Largo: "+a.getLargo());
        System.out.println("Ancho: "+a.getAncho());
        System.out.println("Altura: "+a.getAltura());
        System.out.println("Metros cuadrados del piso de la habitacion: "+a.Calcular_Metros_Cuadrados_Piso());
        System.out.println("Metros cuadrados necesarios para tapizar las paredes: "+a.Calcular_Metros_Cuadrados_Pared());
    }
    
}
