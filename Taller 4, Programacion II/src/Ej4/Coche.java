/*
4. Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de 
caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere 
necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el color a lo largo de la vida a 
algunos de ellos y mostrándolo por pantalla.
 */
package Ej4;

/**
 *
 * @author Asus
 */
public class Coche {
    
    private String color;
    private String marca;
    private String modelo;
    private int caballos_de_fuerza;
    private int numero_puertas;
    private String matricula;
    
    public Coche(){
        this.color="Negro";
        this.marca="Ferrari";
        this.modelo="2021";
        this.caballos_de_fuerza=400;
        this.numero_puertas=2;
        this.matricula="GHLT-ERR2";
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getCaballos(){
        return this.caballos_de_fuerza;
    }
    
    public int getNumeroPuerta(){
        return this.numero_puertas;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setCaballos(int caballos_de_fuerza){
        this.caballos_de_fuerza=caballos_de_fuerza;
    }
    
    public void setNumeroPuerta(int numero_puertas){
        this.numero_puertas=numero_puertas;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    
    
    
}
