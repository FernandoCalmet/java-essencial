package Excercises.POO.UPAO.Matrices.ejercicio2.logica;

import java.util.Scanner;

public class Determinante {
    // METODO PRINCIPAL
    public static void main(String[] args) {
        Determinante obj = new Determinante();
        obj.elegir();
    }

    // METODO DE MENU PRINCIPAL
    public void elegir() {
        Scanner lea = new Scanner(System.in);
        int opc;
        System.out.println("Seleccione el Tamaño de la Matriz:");
        System.out.println("1) Matrices 2x2");
        System.out.println("2) Matrices 3x3");
        opc = lea.nextInt();
        switch (opc) {
            case 1:
                int matriz[][] = new int[2][2];
                System.out.println(
                        "Ingrese los elementos de las siguientes intersecciones de la Matriz 'A' en su respectivo orden: (1,1 - 1,2 - 2,1 - 2,2)");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matriz[i][j] = lea.nextInt();
                    }
                }
                System.out.println("A = ");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("|" + matriz[i][j] + "|");
                    }
                    System.out.println();
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        int determinante;
                        determinante = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
                        System.out.println("Determinante: " + determinante);
                        break;
                    }
                    break;
                }
                break;
            case 2:
                int matriz1[][] = new int[3][3];
                System.out.println(
                        "Ingrese los elementos de las siguientes intersecciones de la Matriz 'A' en su respectivo orden: (1,1 - 1,2 - 1,3 - 2,1 - 2,2 - 2,3 - 3,1 - 3,2 - 3,3)");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz1[i][j] = lea.nextInt();
                    }
                }
                System.out.println("A = ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("|" + matriz1[i][j] + "|");
                    }
                    System.out.println();
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int determinante;
                        determinante = ((matriz1[0][0] * matriz1[1][1] * matriz1[2][2])
                                + (matriz1[0][1] * matriz1[1][2] * matriz1[2][1])
                                + (matriz1[1][0] * matriz1[2][1] * matriz1[0][2]))
                                - ((matriz1[2][0] * matriz1[1][1] * matriz1[0][2])
                                        + (matriz1[1][0] * matriz1[0][1] * matriz1[2][2])
                                        + (matriz1[2][1] * matriz1[1][2] * matriz1[0][0]));
                        System.out.println("Determinante: " + determinante);
                        break;
                    }
                    break;
                }
                break;
            default:
                System.out.println("La Opcion Ingresada no es valida, ingrese solo 1 ó 2");
        }
    }
}