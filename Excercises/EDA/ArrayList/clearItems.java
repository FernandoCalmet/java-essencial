package Excercises.EDA.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class clearItems {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<String>();

        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Purple");

        colorsList.clear();

        System.out.println(colorsList);
    }
}