package Excercises.EDA.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class loopItems {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<String>();

        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Purple");

        /* FOR LOOP */
        for (int i = 0; i < colorsList.size(); i++) {
            System.out.println(colorsList.get(i));
        }

        /* FOR-EACH LOOP */
        for (String i : colorsList) {
            System.out.println(i);
        }
    }
}