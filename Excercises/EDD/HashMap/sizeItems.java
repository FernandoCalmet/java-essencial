package HashMap;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;

class sizeItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-819", "Andres");
        alumnos.put("000-754", "Juan");
        alumnos.put("000-439", "Alessa");

        System.out.println(alumnos.size());
    }
}