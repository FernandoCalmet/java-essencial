package Recursion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un numero"));
        JOptionPane.showMessageDialog(null, "Fibonacci recursivo de " + n + " es " + fibonnaciRecursivo(n));
        JOptionPane.showMessageDialog(null, "Fibonacci por ciclo de " + n + " es " + fibonnaciCiclo(n));
    }

    public static int fibonnaciRecursivo(int n) {
        if (n == 1 || n == 2) {
            // Caso base, respuesta explicita
            return 1;
        } else {
            // Dominio, problema -1
            return fibonnaciRecursivo(n - 1) + fibonnaciRecursivo(n - 2);
        }
    }

    public static int fibonnaciCiclo(int n) {
        int temp = 0, first = 1, second = 0;
        while (n > 0) {
            temp = first + second;
            first = second;
            second = temp;
            n--;
        }
        return temp;
    }
}