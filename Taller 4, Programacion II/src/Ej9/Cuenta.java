/*
9. Implementar en java la clase que se indica en el diagrama de clases (figura), incluyendo las validaciones necesarias 
en los métodos consignar y retirar. Crear una clase principal en la que se cree un objeto de dicha clase y probar sus 
métodos.
 */
package Ej9;


public class Cuenta {

    private int cuenta;
    private String nombre_cliente;
    private double saldo;
    
    public Cuenta() {
        this.cuenta = 15333562;
        this.nombre_cliente ="Juan David Ayala";
        this.saldo = 3500000;
    }
    
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double Consignar(double monto){
        System.out.printf("Consignacion Exitosa por valor de: %.0f ",monto);
        System.out.println("\n");
        System.out.println("----------------");
        return this.saldo=this.saldo+monto;
    }
    
    public double Retirar(double monto){
        System.out.printf("Retiro Exitoso por valor de: %.0f ",monto);
        System.out.println("\n");
        System.out.println("----------------");
        return this.saldo=this.saldo-monto;
    }
    
    
}
