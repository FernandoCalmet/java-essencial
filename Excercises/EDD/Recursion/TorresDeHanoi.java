package Recursion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class TorresDeHanoi {
    public static void main(String[] args) {
        int n = 3;
        char a = 1, b = 2, c = 3;
        torreHanoi(n, a, b, c);
    }

    public static void torreHanoi(int discos, int torreA, int torreB, int torreC) {
        // Caso Base
        if (discos == 1) {
            System.out.println("Mover disco de la Torre " + torreA + " a la Torre " + torreC);
        } else {
            // Dominio, problema n - 1
            torreHanoi(discos - 1, torreA, torreC, torreB);
            System.out.println("Mover disco de la Torre " + torreA + " a la Torre " + torreC);
            torreHanoi(discos - 1, torreB, torreA, torreC);
        }
    }
}