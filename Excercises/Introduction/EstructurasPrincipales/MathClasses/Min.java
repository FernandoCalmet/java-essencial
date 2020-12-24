package Excercises.Introduction.EstructurasPrincipales.MathClasses;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Min {
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 50;
        /*
         * Math.min(int ,int) : Regresa el valor minimo entre dos numeros.
         */
        int numeroMenor = Math.min(numero1, numero2);
        System.out.println("El numero menor entre " + numero1 + " y " + numero2 + " es " + numeroMenor);
    }
}