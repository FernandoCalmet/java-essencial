package Excercises.Introduction.EntradasSalidasDatos.ScannerClass;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Scanner;

public class NextDouble {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Your weight is " + weight);
    }
}