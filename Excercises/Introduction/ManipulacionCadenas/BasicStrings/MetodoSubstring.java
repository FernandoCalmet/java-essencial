package Excercises.Introduction.ManipulacionCadenas.BasicStrings;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MetodoSubstring {
    public static void main(String[] args) {
        /*
         * cadenaTexto.(x,y) : Devuelve una subcadena dentro de la cadena siendo X el
         * caracter a partir del cual se extrae Y el numero de caracters que se quiere
         * extraer.
         */
        String cadena = "01234Fernando01234";
        String subCadena = cadena.substring(5, 13);
        System.out.println(subCadena);
    }
}
