package EstructurasPrincipales.MathClasses;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Round {
    public static void main(String[] args) {
        double numero = 7.60;
        /*
         * Math.round(numero) : Redondeo de un numero hacia el natural mas cercano
         */
        double redondeo = Math.round(numero);
        System.out.println(redondeo);
    }
}