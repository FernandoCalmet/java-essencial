import java.util.ArrayList;
import java.util.Collections;

public class sortItems {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<String>();

        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Purple");

        Collections.sort(colorsList);

        for (String i : colorsList) {
            System.out.println(i);
        }
    }
}