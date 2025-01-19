package ej17;

public class Piramide {
    int altura;
    private static int  piramidesCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }   
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= altura; i++) {
            for (int k = 0; k < (2 * i - 1); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
    
}
