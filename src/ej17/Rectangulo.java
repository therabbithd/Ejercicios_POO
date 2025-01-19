package ej17;

public class Rectangulo {
    int base;
    int altura;
    private static int rectangulosCreados = 0;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
