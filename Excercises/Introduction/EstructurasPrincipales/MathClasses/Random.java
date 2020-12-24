package Excercises.Introduction.EstructurasPrincipales.MathClasses;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Random {
    public static void main(String[] args) {
        /*
         * (Math.random()*numero) : Genera valores aleatorios entre un rango maximo del
         * numero multiplicado.
         */
        int dado = (int) (Math.random() * 6);
        System.out.println(dado);
    }
}
