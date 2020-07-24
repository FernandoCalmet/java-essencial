package EntradasSalidasDatos.ScannerClass;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Scanner;

public class NextLine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", welcome!");
    }
}
