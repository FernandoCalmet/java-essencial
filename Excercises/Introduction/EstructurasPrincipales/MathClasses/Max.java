package EstructurasPrincipales.MathClasses;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Max {
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 50;
        /*
         * Math.max(int, int) : Regresa el valor maximo entre dos numeros.
         */
        int numeroMayor = Math.max(numero1, numero2);
        System.out.println("El numero mayor entre " + numero1 + " y " + numero2 + " es " + numeroMayor);
    }

}