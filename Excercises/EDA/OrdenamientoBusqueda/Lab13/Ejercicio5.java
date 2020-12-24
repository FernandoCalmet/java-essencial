package Excercises.EDA.OrdenamientoBusqueda.Lab13;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejercicio5 {
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

        System.out.println("\nIngresar el valor de la notacion N: ");
        int n = scanner.nextInt(); //big O(n)

        System.out.println("LINEAR SEARCH UNSORTED:");
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println(linearSearchUnsorted(arr, size, value) + " "+ i);
        }
        
        sort(arr);

        System.out.println("LINEAR SEARCH SORTED:");
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println(linearSearchSorted(arr, size, value) + " "+ i);
        }
      
        System.out.println("BINARY SEARCH:");
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println(Binarysearch(arr, size, value) + " "+ i);
        }
    }

    public static boolean Binarysearch(int[] arr, int size, int value) {
        int low = 0;
        int high = size - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return true;
            else if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
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

    public static boolean linearSearchUnsorted(int[] arr, int size, int value) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (value == arr[i])
                return true;
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