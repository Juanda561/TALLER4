/*
7. Se desea crear una aplicación en java para el registro del inventario de productos de una tienda. Para ello, se solicita 
diseñar e implementar la clase Producto, con atributos de instancia para el Código, nombre, precio de compra, 
porcentaje de utilidad. La clase debe implementar método constructor, getters y setters para sus atributos y el método 
precioVenta, que retornara el precio de venta al público (a partir del % de utilidad del producto). Implementar una clase 
principal, en la que se defina un arreglo de Productos, se registren datos de diferentes productos y luego se impriman 
incluyendo el precio de venta
 */
package Ej7;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio_de_compra;
    private double porcentaje_utilidad;
    
    public Producto(){
        
        this.codigo=2424;
        this.nombre="Arepa";
        this.precio_de_compra=74400;
        this.porcentaje_utilidad=38;
        
    }
    
    public double getCodigo(){
        return this.codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecioCompra(){
        return this.precio_de_compra;
    }
    
    public double getPorcentajeUtilidad(){
        return this.porcentaje_utilidad;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public void setPrecioCompra(double precio_de_compra){
        this.precio_de_compra=precio_de_compra;
    }
    
    public void setPorcentajeUtilidad(double porcentaje_utilidad){
        this.porcentaje_utilidad=porcentaje_utilidad;
    }
    
    public double PrecioVenta(){
        double porcentaje=this.porcentaje_utilidad/100;
        return this.precio_de_compra/(1-porcentaje);
    }
    
}
