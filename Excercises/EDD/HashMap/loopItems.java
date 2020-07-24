package HashMap;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;
import java.util.Map;

class loopItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-819", "Andres");
        alumnos.put("000-754", "Juan");
        alumnos.put("000-439", "Alessa");

        /* FOR-EACH LOOP : VALUES */
        for (String i : alumnos.values()) {
            System.out.println(i);
        }

        /* FOR-EACH LOOP : KEYS */
        for (String i : alumnos.keySet()) {
            System.out.println(i);
        }

        /* FOR-EACH LOOP : KEYS-VALUES */
        for (String i : alumnos.keySet()) {
            System.out.println("Key: " + i + " Value: " + alumnos.get(i));
        }

        /* FOR-EACH LOOP : KEYS-VALUES */
        for (Map.Entry<String, String> i : alumnos.entrySet()) {
            System.out.println(i);
        }
    }
}