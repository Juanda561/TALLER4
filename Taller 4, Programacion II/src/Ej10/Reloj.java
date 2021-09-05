/*
10. Crear la clase Reloj, con atributos de instancia para las horas, minutos y segundos, atributo de clase para el formato 
de impresión (0 – militar, 1 – AM/PM, 2-Texto), método constructor, getters y setters, los métodos miembros: SS+(), 
MM+(), HH()+, para incrementar en 1, los segundos, minutos y horas respectivamente. Así mismo, los métodos SS-(), 
MM-(), HH-(), para disminuir en 1 los segundos, minutos y horas respectivamente, métodos que retornen la hora en 
formato militar, en formato AM/PM, en formato texto (“cinco y cincuenta am”, o “dos y treinta y cinco pm”) y finalmente 
un método denominado getHora que debe retornar la hora en el formato correspondiente según el atributo indicado. 
Crea una clase principal e instancia dos objetos reloj, la ejecución del aplicativo debe mostrar las horas de los relojes 
en distintos formatos.
 */
package Ej10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Reloj {
    
    private int horas;
    private int minutos;
    private int segundos;
    
    public Reloj() {
        this.horas = 0;
        this.minutos = 59;
        this.segundos = 54;
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
    public int SSmas(){
        
        return this.segundos++;
    }
    
    public int MMmas(){
        return this.minutos++;
    }
    
    public int HHmas(){
        return this.horas++;
    }
    
    public void HorasTexto(int a){
        
        if (a ==0) {
            System.out.print("Cero");
        }
        if (a ==1) {
            System.out.print("Un");
        }
        if (a ==2) {
            System.out.print("Dos");
        }
        if (a ==3) {
            System.out.print("Tres");
        }
        if (a ==4) {
            System.out.print("Cuatro");
        }
        if (a ==5) {
            System.out.print("Cinco");
        }
        if (a ==6) {
            System.out.print("Seis");
        }
        if (a ==7) {
            System.out.print("Siete");
        }
        if (a ==8) {
            System.out.print("Ocho");
        }
        if (a ==9) {
            System.out.print("Nueve");
        }
        if (a ==10) {
            System.out.print("Diez");
        }
        if (a ==11) {
            System.out.print("Once");
        }
        if (a ==12) {
            System.out.print("Doce");
        }
        if (a ==13) {
            System.out.print("Trece");
        }
        if (a ==14) {
            System.out.print("Catorce");
        }
        if (a ==15) {
            System.out.print("Quince");
        }
        if (a ==16) {
            System.out.print("Dieciséis");
        }
        if (a ==17) {
            System.out.print("Diecisiete");
        }
        if (a ==18) {
            System.out.print("Dieciocho");
        }
        if (a ==19) {
            System.out.print("Diecinueve");
        }
        if (a ==20) {
            System.out.print("Veinte");
        }
        if (a ==21) {
            System.out.print("Veintiuno");
        }
        if (a ==22) {
            System.out.print("Veintidos");
        }
        if (a ==23) {
            System.out.print("Veintitres");
        }
        if (a ==24) {
            System.out.print("Veinticuatro");
        }
        if (a ==25) {
            System.out.print("Veinticinco");
        }
        if (a ==26) {
            System.out.print("Veintiséis");
        }
        if (a ==27) {
            System.out.print("Veintisiéte");
        }
        if (a ==28) {
            System.out.print("Veintiocho");
        }
        if (a ==29) {
            System.out.print("Veintinueve");
        }
        if (a ==30) {
            System.out.print("Treinta");
        }
        if (a ==31) {
            System.out.print("Treinte y Uno");
        }
        if (a ==32) {
            System.out.print("Treinte y Dos");
        }
        if (a ==33) {
            System.out.print("Treinte y Tres");
        }
        if (a ==34) {
            System.out.print("Treinte y Cuatro");
        }
        if (a ==35) {
            System.out.print("Treinte y Cinco");
        }
        if (a ==36) {
            System.out.print("Treinte y Séis");
        }
        if (a ==37) {
            System.out.print("Treinte y Siéte");
        }
        if (a ==38) {
            System.out.print("Treinte y Ocho");
        }
        if (a ==39) {
            System.out.print("Treinte y Nueve");
        }
        if (a ==40) {
            System.out.print("Cuarenta");
        }
        if (a ==41) {
            System.out.print("Cuarenta y Uno");
        }
        if (a ==42) {
            System.out.print("Cuarenta y Dos");
        }
        if (a ==43) {
            System.out.print("Cuarenta y Tres");
        }
        if (a ==44) {
            System.out.print("Cuarenta y Cuatro");
        }
        if (a ==45) {
            System.out.print("Cuarenta y Cinco");
        }
        if (a ==46) {
            System.out.print("Cuarenta y Séis");
        }
        if (a ==47) {
            System.out.print("Cuarenta y Siéte");
        }
        if (a ==48) {
            System.out.print("Cuarenta y Ocho");
        }
        if (a ==49) {
            System.out.print("Cuarenta y Nueve");
        }
        if (a ==50) {
            System.out.print("Cincuenta");
        }
        if (a ==51) {
            System.out.print("Cincuenta y Uno");
        }
        if (a ==52) {
            System.out.print("Cincuenta y Dos");
        }
        if (a ==53) {
            System.out.print("Cincuenta y Tres");
        }
        if (a ==54) {
            System.out.print("Cincuenta y Cuatro");
        }
        if (a ==55) {
            System.out.print("Cincuenta y Cinco");
        }
        if (a ==56) {
            System.out.print("Cincuenta y Séis");
        }
        if (a ==57) {
            System.out.print("Cincuenta y Siéte");
        }
        if (a ==58) {
            System.out.print("Cincuenta y Ocho");
        }
        if (a ==59) {
            System.out.print("Cincuenta y Nueve");
        }
        
    }
    
    public void Texto(){
        HorasTexto(this.getHoras());
            System.out.print(" Hora, ");
          HorasTexto(this.getMinutos());
            System.out.print(" Minuto, ");
            HorasTexto(this.getSegundos());
            System.out.print(" Segundos, ");
    }
    
    public void LimpiarOutput() throws AWTException {
        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_L);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_L);
        
    }
   
    
}
