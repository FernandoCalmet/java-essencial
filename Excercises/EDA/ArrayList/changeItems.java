package Excercises.EDA.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class changeItems {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<String>();

        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Purple");

        colorsList.set(1, "Pink");
        colorsList.set(3, "Cyan");

        System.out.println(colorsList.get(1));
        System.out.println(colorsList.get(3));
    }
}