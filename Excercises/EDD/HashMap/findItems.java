package HashMap;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;

class findItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-819", "Andres");
        alumnos.put("000-754", "Juan");
        alumnos.put("000-439", "Alessa");

        if (alumnos.containsKey("000-123"))
            System.out.println(alumnos.get("000-123"));
        else
            System.out.println(alumnos.get("No se encontro al alumno."));
    }
}