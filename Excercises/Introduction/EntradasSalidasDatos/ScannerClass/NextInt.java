package EntradasSalidasDatos.ScannerClass;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Scanner;

public class NextInt {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your current age is " + age + " and next year you will be " + (age + 1));
    }
}