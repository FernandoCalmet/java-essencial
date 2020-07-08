package ScannerClass;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", welcome!");
    }
}
