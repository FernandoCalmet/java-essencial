package Excercises.EDA.Memory.StaticMemory;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        numeros[0] = 12;
        numeros[1] = 5;
        numeros[2] = 34;
        numeros[3] = 9;
        numeros[4] = 30;

        System.out.println("\nNumeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

        System.out.println("\nNumeros ordenados: ");
        Arrays.sort(numeros);
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

        String palabras[] = new String[3];
        Arrays.fill(palabras, "Hola Mundo");
        System.out.println("\nPalabras: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + palabras[i] + "]");
        }
    }
}