package Ejercicio12;

public class Publicacion {
    String isbn;
    String titulo;
    int anio;
    protected Publicacion(String isbn, String titulo, int anio){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anio=anio;
    }
    @Override
    public String toString() {
        return "ISBN: "+isbn+" Título: "+titulo+" Año: "+anio;
    }
    
}
