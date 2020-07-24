package Maps;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class nonGeneric {
    public static void main(String[] args) {
        Map map = new HashMap();
        // Adding elements to map
        map.put(1, "Fernando");
        map.put(7, "Andres");
        map.put(3, "Jhon");
        map.put(2, "Daniela");
        // Traversing Map
        Set set = map.entrySet();// Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            // Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}