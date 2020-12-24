package Excercises.Introduction.FlujoControl.BasicSwitch;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Scanner;

public class StringSwitch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingresar una letra entre A, B, C, D: ");
        String menu = scanner.nextLine();

        switch (menu.toUpperCase()) {
            case "A":
                System.out.println("Usted escogio la opcion A");
                break;
            case "B":
                System.out.println("Usted escogio la opcion B");
                break;
            case "C":
                System.out.println("Usted escogio la opcion C");
                break;
            case "D":
                System.out.println("Usted escogio la opcion D");
                break;
            default:
                System.out.println("Letra no permitida.");
                break;
        }

        System.out.println("Gracias por usar nuestro menu.");
    }
}