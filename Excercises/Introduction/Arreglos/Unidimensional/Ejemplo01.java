package Excercises.Introduction.Arreglos.Unidimensional;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        int[] matriz = new int[5];

        matriz[0] = 5;
        matriz[1] = 10;
        matriz[2] = 15;
        matriz[3] = 20;
        matriz[4] = 25;

        for (int m : matriz) {
            System.out.println(m);
        }
    }
}
