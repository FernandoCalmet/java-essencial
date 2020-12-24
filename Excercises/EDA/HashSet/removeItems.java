package Excercises.EDA.HashSet;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashSet;

class removeItems {
    public static void main(String[] args) {
        HashSet<String> dni = new HashSet<>();
        dni.add("12345678");
        dni.add("12121212");
        dni.add("87236418");
        dni.add("82650189");
        dni.add("83494701");
        System.out.println(dni);

        dni.remove("12345678");
        dni.remove("87236418");
        System.out.println(dni);

        dni.clear();
        System.out.println(dni);
    }
}