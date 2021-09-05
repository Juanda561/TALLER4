/*
8. Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: título, primer 
nombre, segundo nombre, primer apellido, ISBN, páginas, edición, editorial, ciudad, país y fecha de edición (String). La 
clase debe proporcionar los siguientes servicios: getters y setters. Implementar una clase principal, en la cual, además 
del método main, se debe implementar método para leer la información del Libro y método para mostrar su información. 
Este último método mostrará la información del libro con este formato:

Título: Introduction to Java Programming
3a. edición
Autor: Liang, Y. Daniel
ISBN: 0-13-031997-X
Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de 2001
784 páginas
 */
package Ej8;


public class Libro {
    
    private String titulo;
    private String primer_nombre;
    private String segundo_nombre;
    private String ISBN;
    private int paginas;
    private String edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private String fecha_edicion;
    
    public Libro() {
        this.titulo = "La bella y la bestia";
        this.primer_nombre = "Juan";
        this.segundo_nombre = "David";
        this.ISBN = "0-12-537954-Z";
        this.paginas = 540;
        this.edicion = "2a edición";
        this.editorial = "Norma";
        this.ciudad = "Valledupar";
        this.pais = "Colombia";
        this.fecha_edicion = "Viernes 4 de Septiembre de 2021";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(String fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }
    
    
    
}
