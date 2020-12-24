package Excercises.Introduction.FlujoControl.BasicSwitch;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Scanner;

public class NumericSwitch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingresar un numero entre 0,1,2,3: ");
        int menu = Integer.parseInt(scanner.nextLine());

        switch (menu) {
            case 0:
                System.out.println("Usted escogio la opcion 0");
                break;
            case 1:
                System.out.println("Usted escogio la opcion 1");
                break;
            case 2:
                System.out.println("Usted escogio la opcion 2");
                break;
            case 3:
                System.out.println("Usted escogio la opcion 3");
                break;
            default:
                System.out.println("Numero no permitida.");
                break;
        }

        System.out.println("Gracias por usar nuestro menu.");
    }
}
