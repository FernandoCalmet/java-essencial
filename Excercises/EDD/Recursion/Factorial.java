import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un numero"));
        JOptionPane.showMessageDialog(null, "Factorial por metodo: !" + n + " = " + factorialMetodo(n));
        JOptionPane.showMessageDialog(null, "Factorial por ciclo: !" + n + " = " + factorialCiclo(n));
    }

    /* Factorial mediante metodo */
    public static int factorialMetodo(int n) {
        if (n < 0) {
            return 0;
        } else {
            if (n == 0) {
                // Caso Base: Respuesta explicita
                return 1;
            } else {
                // Dominio: Problema -1
                return n * factorialMetodo(n - 1);
            }
        }
    }

    /* Factorial mediante ciclo */
    public static int factorialCiclo(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}