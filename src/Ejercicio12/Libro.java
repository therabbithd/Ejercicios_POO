package Ejercicio12;
//extend titulo isb y anio de publicacion

public class Libro  extends Publicacion implements prestable.Innerprestable{
    public interface InnerLibro {
        boolean prestado=false;
    }
    boolean prestado=false;
    public boolean estaPrestado(){
        return prestado;
    }
    /*
     * @param isbn ISBN del libro
     * @param titulo Título del libro
     * @param anio Año de publicación del libro
     */
    Libro(String isbn, String titulo, int anio){
        super(isbn,titulo,anio);
    }
    /*
     * Presta el libro y si el libro ya ha sido prestado muestra un mensaje
     */
    public  void prestar(){
        if(prestado){
            System.out.println("El libro ya ha sido prestado");
        }
        else{
            prestado=true;
        }
    }
    /*
     * Devuelve el libro y si el libro no ha sido prestado muestra un mensaje
     */
    public void Devuelve(){
        if(prestado){
            prestado=false;
        }
        else{
            System.out.println("El libro no ha sido prestado");
        }
    }
    @Override
    public String toString() {
        
        if(prestado){
            return "ISBN: "+isbn+" Título: "+titulo+" Año: "+anio+" Prestado";
        }
        else{
            return "ISBN: "+isbn+" Título: "+titulo+" Año: "+anio+" No prestado";
        }
    }
}
