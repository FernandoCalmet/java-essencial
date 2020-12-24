package Excercises.Introduction.FlujoControl.Conditionals;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class SubCondiciones {
    public static void main(String[] args) {
        char opcion1 = 'a';
        char opcion2 = 'b';
        char opcion3 = 'a';

        if (opcion1 != opcion2) {
            System.out.println(opcion1 + " es diferente de " + opcion2);
            if (opcion2 == opcion3) {
                System.out.println(opcion1 + " es igual que " + opcion3);
            } else {
                System.out.println(opcion1 + " no es igual que " + opcion3);
                if (opcion2 != opcion3) {
                    System.out.println(opcion2 + " es diferente que " + opcion3);
                } else {
                    System.out.println(opcion2 + " no es diferente que " + opcion3);
                }
            }
        } else {
            System.out.println(opcion1 + " no es diferente de " + opcion2);
        }
    }
}
