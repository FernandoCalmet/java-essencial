package LinkedList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.LinkedList;

class addItems {
    public static void main(String[] args) {
        LinkedList<String> colores = new LinkedList<String>();
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.addLast("Violeta");
        colores.add(1, "Verde");
        colores.addFirst("Blanco");
        colores.add("Azul");

        System.out.println(colores);
    }
}