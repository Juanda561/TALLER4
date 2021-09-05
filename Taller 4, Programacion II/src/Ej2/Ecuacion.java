/*
2. Implemente una clase ecuación, que represente una ecuación de la forma y = ax2 + bx + c. Incluya método constructor, 
getter, setter, y un método que permita evaluar la ecuación imprimiendo el valor de y
 */
package Ej2;


public class Ecuacion {
    
    private int a;
    private int b;
    private int c;
    private int x;
    
    public Ecuacion(){
        this.a=10;
        this.b=16;
        this.c=4;
        this.x=5;
       
    }
    
    public int geta(){
        return this.a;
    }
            
    public int getb(){
        return this.b;
    }
    
    public int getc(){
        return this.c;
    }
    
    public int getx(){
        return this.x;
    }
    
    public void seta(int a){
        this.a=a;
    }
    
    public void setb(int b){
        this.b=b;
    }
    
    public void setc(int c){
        this.c=c;
    }
    
    public void setx(int x){
        this.x=x;
    }
    
    public int Calcular_Y(){
        return this.a*this.x^2+this.b*this.x+this.c;
    }
}
