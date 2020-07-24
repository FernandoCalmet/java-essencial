package Iterators;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;
import java.util.Iterator;

class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(80);
        numeros.add(10);
        numeros.add(5);
        numeros.add(9);
        numeros.add(35);

        Iterator<Integer> iNumeros = numeros.iterator();

        /* Recorrido del primer item */
        System.out.println(iNumeros.next() + "\n");

        /* Recorrido despues del primer item */
        while (iNumeros.hasNext())
            System.out.println(iNumeros.next());

        /* Remover x item */
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            Integer i = iterador.next();
            if (i < 20) {
                iterador.remove();
            }
        }
        System.out.println(numeros);
    }
}