package ScannerClass;

import java.util.Scanner;

public class NextDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Your weight is " + weight);
    }
}