package Ejercicio11;

public class TarjetaRegalo {
    private double saldo;
    private int numero;
    public TarjetaRegalo(double n1){
        this.saldo=n1;
        numero=generarnumero();
    }
    /*
     * Genera un número aleatorio de 6 cifras
     * @return número aleatorio de 6 cifras
     * 
     */
    public int generarnumero(){
        int n1=(int)(Math.random()*1000000);
        return n1;
    }
    /*
     * Gasta una cantidad de dinero de la tarjeta
     * @param n1 cantidad de dinero a gastar
     */
    public void gasta(double n1){
        if(saldo < n1){
            System.out.println("No tiene suficiente saldo para gastar "+n1+"€");
        }
        else{
            saldo-=n1;
            saldo=Math.round(saldo*100.0)/100.0;
        }
    }
    @Override
    public String toString() {
        return "TarjetaRegalo no "+numero+ " - saldo=" + saldo;
    }
    /*
     * Fusiona dos tarjetas en una
     * @param t2 tarjeta a fusionar
     * @return tarjeta fusionada
     */
    public TarjetaRegalo fusion(TarjetaRegalo t2){
        double saldootr= t2.saldo;
        double newsaldo= this.saldo+saldootr;
        return new TarjetaRegalo(newsaldo);
    }
}
