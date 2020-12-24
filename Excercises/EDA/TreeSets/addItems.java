package Excercises.EDA.TreeSets;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.TreeSet;

public class addItems {
    public static void main(String[] args) {
        TreeSet<String> abc = new TreeSet<String>();

        abc.add("C");
        abc.add("A");
        abc.add("B");

        /* No permite valores duplicados */
        abc.add("C");

        /* Ordena los elementos en orden natural y ascendente */
        System.out.println(abc);
    }
}