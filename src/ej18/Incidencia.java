package ej18;

public class Incidencia {
    int puesto;
    String descripcion;
    boolean EstaResuelto;
    String Resolucion;
    static int pendientes=0;
    static int num = 0;
    int numinc;
    public Incidencia(int puesto, String descripcion){
        this.puesto=puesto;
        this.descripcion=descripcion;
        this.EstaResuelto=false;
        pendientes++;
        num++;
        numinc=num;
        
    }
    public void resuelve(String resolucion){
        this.EstaResuelto=true;
        this.Resolucion=resolucion;
        pendientes--;
    }
    public static int getPendientes(){
        return pendientes;
    }
    @Override
    public String toString() {
        if(EstaResuelto){
            return "Incidencia "+numinc+" - Puesto: "+puesto+" Descripción: "+descripcion+" Resuelta: "+Resolucion;
        }
        else{
            return "Incidencia "+numinc+" - Puesto: "+puesto+" Descripción: "+descripcion+" No resuelta";
        }
    }
}
