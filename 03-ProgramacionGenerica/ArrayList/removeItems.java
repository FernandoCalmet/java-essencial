import java.util.ArrayList;

public class removeItems {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<String>();

        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Purple");

        colorsList.remove(0);
        colorsList.remove(1);

        System.out.println(colorsList);
    }
}