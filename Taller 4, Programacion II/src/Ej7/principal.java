/*
7. Se desea crear una aplicación en java para el registro del inventario de productos de una tienda. Para ello, se solicita 
diseñar e implementar la clase Producto, con atributos de instancia para el Código, nombre, precio de compra, 
porcentaje de utilidad. La clase debe implementar método constructor, getters y setters para sus atributos y el método 
precioVenta, que retornara el precio de venta al público (a partir del % de utilidad del producto). Implementar una clase 
principal, en la que se defina un arreglo de Productos, se registren datos de diferentes productos y luego se impriman 
incluyendo el precio de venta
 */

package Ej7;

public class principal {
    
    public static void main(String[] args) {
        
        Producto p=new Producto();
        
        int []codigo={2343,5353,6786,3578,2435,6865,8637};
        String []nombre_producto={"Avena","Arroz","Azucar","Escoba","Bolso","Zapatos","Platano"};
        double []precio_compra={5000,4000,3000,4000,45000,56000,500};
        double []porcentaje_utilidad={20,30,40,50,44,24,35};
        
        System.out.println("Productos");
        System.out.println("----------");
        
        for (int i = 0; i <codigo.length ; i++) {
            p.setCodigo(codigo[i]);
            p.setNombre(nombre_producto[i]);
            p.setPrecioCompra(precio_compra[i]);
            p.setPorcentajeUtilidad(porcentaje_utilidad[i]);
            ImprimirDatos(p);
        }
           
    }
    
    public static void ImprimirDatos(Producto a){
        System.out.printf("Codigo: %.0f ",a.getCodigo());
        System.out.println("");
        System.out.println("Nombre: "+a.getNombre());
        System.out.printf("Precio de compra: %.0f ",a.getPrecioCompra());
        System.out.println("");
        System.out.printf("Porcentaje de utilidad: %.0f ",a.getPorcentajeUtilidad());
        System.out.print("%\n");
        System.out.printf("El precio de venta es: %.0f ",a.PrecioVenta());
        System.out.println("");
        System.out.println("----------------------");
    }
}
