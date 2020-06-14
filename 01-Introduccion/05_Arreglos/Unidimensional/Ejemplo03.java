package Unidimensional;

public class Ejemplo03 {
    public static void main(String[] args) {
        int[] dados = new int[5];

        for (int i = 0; i < dados.length; i++) {
            dados[i] = (int) Math.round(Math.random() * 6);
        }

        for (int d : dados) {
            System.out.println("Resultado del dado: " + d);
        }
    }
}
