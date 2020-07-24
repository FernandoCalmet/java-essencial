package ManipulacionCadenas.BasicStrings;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MetodoCharAt {
    public static void main(String[] args) {
        /*
         * cadenaTexto.charAt() : Devuelve la posicion del caracter de la cadena de una
         * variable tipo String. La posicion inicial es 0.
         */
        int posicion = 5;
        String texto = "abcdefgh";
        System.out.println("El caracter " + texto.charAt(posicion) + " esta en la posicion " + posicion
                + " de la cadena " + texto);
    }
}