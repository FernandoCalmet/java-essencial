package Maps;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;
import java.util.Map;

class comparingByValue {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Fernando");
        map.put(101, "Andres");
        map.put(102, "Daniela");
        // Returns a Set view of the mappings contained in this map
        map.entrySet()
                // Returns a sequential Stream with this collection as its source
                .stream()
                // Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue())
                // Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}