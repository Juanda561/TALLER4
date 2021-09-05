
package Ej8;


public class principal {
    
    public static void main(String[] args) {
        
        Libro l= new Libro();
        ImprimirDatos(l);
        
    }
    
    public static void ImprimirDatos(Libro a){
        System.out.println("Título: "+a.getTitulo());
        System.out.println(""+a.getEdicion());
        System.out.println("Autor: "+a.getPrimer_nombre()+", "+a.getSegundo_nombre());
        System.out.println("ISBN: "+a.getISBN());
        System.out.println(""+a.getEditorial()+", "+a.getCiudad()+" ("+a.getPais()+"), "+a.getFecha_edicion());
        System.out.println(a.getPaginas()+" páginas");
    }
    
}
