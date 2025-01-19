package Ejercicio12;

public class Revista extends Publicacion{
    int numero;
    public Revista(String isbn, String titulo, int anio, int numero){
        super(isbn, titulo, anio);
        this.numero=numero;
    }
   @Override
   public String toString() {
       
       return super.toString()+" Número: "+numero;
   }

    
     
}
