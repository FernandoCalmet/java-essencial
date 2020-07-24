package HashMap;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;

class addItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-456", "Andres");

        System.out.println(alumnos);
    }
}