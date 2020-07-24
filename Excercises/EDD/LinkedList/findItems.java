package LinkedList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.LinkedList;

class findItems {
    public static void main(String[] args) {
        LinkedList<String> colores = new LinkedList<String>();
        colores.add(0, "Rojo");
        colores.add(1, "Amarillo");
        colores.add(2, "Verde");
        colores.add(3, "Azul");
        colores.add(4, "Morado");

        boolean estado = colores.contains("Azul");

        if (estado)
            System.out.println("Se encontro el color Azul.");
        else
            System.out.println("No se encontro el color Azul.");
    }
}