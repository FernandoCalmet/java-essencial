package Excercises.EDA.HashSet;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashSet;

class sizeItems {
    public static void main(String[] args) {
        HashSet<String> dni = new HashSet<>();
        dni.add("12345678");
        dni.add("12121212");
        dni.add("87236418");
        dni.add("82650189");
        dni.add("83494701");

        System.out.println(dni.size());
    }
}