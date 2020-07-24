package FlujoControl.Bucles;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Determinados {
    public static void main(String[] args) {
        // Ejemplo de bucle For
        int numero = 2;
        for (int i = 0; i <= numero; i++) {
            System.out.println("Indice " + i);
        }

        // Ejemplo de bucle For each
        String[] pelotas = { "Roja", "Verde", "Azul" };
        for (String caja : pelotas) {
            System.out.println("Pelota " + caja);
        }
    }
}