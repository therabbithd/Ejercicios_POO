package ej16;

public class Linea{
    Punto p1;
    Punto p2;
    double p1x;
    double p1y;
    double p2x;
    double p2y;
    public Linea(Punto punto1, Punto punto2){
        p1=punto1;
        p2=punto2;
        p1x=p1.getX();
        p1y=p1.getY();
        p2x=p2.getX();
        p2y=p2.getY();
    }
   
    @Override

    public String toString() {
       return "Linea formada por los puntos: ("+p1x+","+p1y+") y ("+p2x+","+p2y+")";
    }
}
