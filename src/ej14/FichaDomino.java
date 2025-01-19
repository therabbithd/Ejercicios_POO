package ej14;

public class FichaDomino {
    int num1;
    int num2;
    public FichaDomino(int n1, int n2){
        this.num1=n1;
        this.num2=n2;
    }
    public FichaDomino voltea(){
        return new FichaDomino(num2,num1);
    }
    public boolean encaja(FichaDomino f2){
        if(this.num1==f2.num1 || this.num1==f2.num2 || this.num2==f2.num1 || this.num2==f2.num2){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        if(num1==0){
            return "[ |"+num2+"]";
        }
        else if(num2==0){
            return "["+num1+"| ]";
        }
        else{
            return "["+num1+"|"+num2+"]";
        }
    }
}