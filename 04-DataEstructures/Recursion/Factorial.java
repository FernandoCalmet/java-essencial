public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 0) {
            // Caso Base: Respuesta explicita
            return 1;
        } else {
            // Dominio: Problema -1
            return n * factorial(n - 1);
        }
    }
}