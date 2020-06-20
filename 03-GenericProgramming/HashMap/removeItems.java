import java.util.HashMap;

class removeItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-819", "Andres");
        alumnos.put("000-754", "Juan");
        alumnos.put("000-439", "Alessa");
        System.out.println(alumnos);

        alumnos.remove("000-754");
        System.out.println(alumnos);

        alumnos.clear();
        System.out.println(alumnos);
    }
}