package ScannerClass;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your current age is " + age + " and next year you will be " + (age + 1));
    }
}