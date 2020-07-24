package ManipulacionCadenas.BasicStrings;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MetodoEquals {
    public static void main(String[] args) {
        /*
         * cadenaTexto.equals() : Devuelve true si dos cadenas que se comparan son
         * iguales y false si no lo son. Distingue mayusculas y minusculas.
         */
        String cadena1 = "Fernando";
        String cadena2 = "Fernando";

        boolean compararCadenas = cadena1.equals(cadena2);
        System.out.println("Las dos cadenas son iguales?");

        if (compararCadenas) {
            System.out.println(compararCadenas);
        } else {
            System.out.println(compararCadenas);
        }
    }
}