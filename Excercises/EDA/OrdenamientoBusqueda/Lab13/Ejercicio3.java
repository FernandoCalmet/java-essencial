package Excercises.EDA.OrdenamientoBusqueda.Lab13;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejercicio3 {
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

        sort(arr);

        System.out.println(linearSearchSorted(arr, size, value));
    }

    public static boolean linearSearchSorted(int[] arr, int size, int value) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (value == arr[i])
                return true;
            else if (value < arr[i])
                return false;
        }
        return false;
    }

    public static void sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                for (int j = i - 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}