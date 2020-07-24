package Maps;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;
import java.util.Map;

class generic {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Fernando");
        map.put(102, "Daniela");
        map.put(101, "Andres");
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}