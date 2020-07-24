package LinkedList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.LinkedList;

class accessItems {
    public static void main(String[] args) {
        LinkedList<String> colores = new LinkedList<String>();
        colores.add(0, "Rojo");
        colores.add(1, "Amarillo");
        colores.add(2, "Verde");
        colores.add(3, "Azul");
        colores.add(4, "Morado");
        System.out.println(colores.get(3));

        colores.set(3, "Blanco");
        System.out.println(colores.get(3));
    }
}