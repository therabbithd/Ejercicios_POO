package Ejercicio13;

public class CuentaCorriente {
    int saldo;
    int numero;
    public CuentaCorriente(int n1){
        this.saldo=n1;
        numero=generarnumero();
    }
    public CuentaCorriente(){
        this.saldo=0;
        numero=generarnumero();
    }
    public int generarnumero(){
        int n1=(int)(Math.random()*1000000);
        return n1;
    }
    public void ingreso(int n1){
        saldo+=n1;
    }
    public void cargo(int n1){
        if(saldo < n1){
            System.out.println("No tiene suficiente saldo para gastar "+n1+"€");
        }
        else{
            saldo-=n1;
        }
    }
    public void transferencia(CuentaCorriente c2, int n1){
        if(saldo < n1){
            System.out.println("No tiene suficiente saldo para transferir "+n1+"€");
        }
        else{
            saldo-=n1;
            c2.ingreso(n1);
        }
    }
    @Override
    public String toString() {
        return "Número de cta:"+numero+" Saldo: " +saldo+"€";
    }
}
