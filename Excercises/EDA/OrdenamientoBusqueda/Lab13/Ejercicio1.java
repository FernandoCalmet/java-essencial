package Excercises.EDA.OrdenamientoBusqueda.Lab13;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejercicio1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 80, 30, 90, 55, 85, 10, 50, 60, 20 };
        int size = arr.length;

        System.out.println("Numeros disponibles para busqueda:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nIngresar el valor del numero a buscar: ");
        int value = scanner.nextInt();

        System.out.println(linearSearchUnsorted(arr, size, value));
    }

    public static boolean linearSearchUnsorted(int[] arr, int size, int value) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (value == arr[i])
                return true;
        }
        return false;
    }
}