/*
    cadenaTexto.charAt() : Devuelve la posicion del caracter de la cadena de una variable tipo String. La posicion inicial es 0.
 */
package ClaseString;

public class MetodoCharAt {
    
    public static void main(String[] args) {
        
        int posicion = 5;
        String texto = "abcdefgh";

        System.out.println("El caracter "+texto.charAt(posicion)+" esta en la posicion "+posicion+" de la cadena "+texto);
        
    }
    
}