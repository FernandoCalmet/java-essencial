package Excercises.POO.UPAO.PatronesCreacionales.Singleton.Coche;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMain {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            Coche.getInstancia();
        }
    }
}
