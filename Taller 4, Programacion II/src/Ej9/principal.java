/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9;

/**
 *
 * @author Asus
 */
public class principal {
    
    public static void main(String[] args) {
        
        Cuenta c=new Cuenta();
        ImprimirDatos(c);
        
        c.Consignar(6000);
        ImprimirDatos(c);
        
        c.Retirar(6000);
        ImprimirDatos(c);
        
    }
    
    public static void ImprimirDatos(Cuenta a){
        System.out.println("Numero de cuenta: "+a.getCuenta());
        System.out.println("Nombre del titural: "+a.getNombre_cliente());
        System.out.printf("Saldo: %.0f ",a.getSaldo());
        System.out.println("");
        System.out.println("--------------");
    }
}
