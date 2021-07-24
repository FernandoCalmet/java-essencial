package Excercises.POO.UPAO.Matrices.ejercicio2.presentacion;

import java.io.IOException;
import javax.swing.JOptionPane;

import Excercises.POO.UPAO.Matrices.ejercicio2.logica.Matrices;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MatricesApp {
    private static Matrices logica = new Matrices();

    public static void main(String[] args) throws IOException {
        String[] opciones = { "1. Eliminacion gausiana.", "2. Suma de matrices.", "3. Resta de matrices.",
                "4. Multiplicacion de matrices.", "5. Definir si es una matriz identidad",
                "6. Multiplicar una matriz identidad", "7. Calcular la transpuesta de una matriz",
                "8. Calcular si una matriz es simetrica", "9. Fin del programa" };
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Matrices",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (resp == null) {
            finPrograma();
        }

        switch (resp) {
            case "1. Eliminacion gausiana.":
                eliminacionGaussiana();
                break;
            case "2. Suma de matrices.":
                sumaMatrices();
                break;
            case "3. Resta de matrices.":
                restaMatrices();
                break;
            case "4. Multiplicacion de matrices.":
                multiplicacionMatrices();
                break;
            case "5. Definir si es una matriz identidad":
                esMatrizIdentidad();
                break;
            case "6. Multiplicar una matriz identidad":
                multiplicacionMatrizIdentidad();
                break;
            case "7. Calcular la transpuesta de una matriz":
                MatrizTranspuesta();
                break;
            case "8. Calcular si una matriz es simetrica":
                matrizEsSimetrica();
                break;
            case "9. Fin del programa":
                finPrograma();
                break;
        }
    }

    // Metodo eliminacion gausiana
    private static void eliminacionGaussiana() throws NumberFormatException, IOException {
        // Definir variables para la matriz A
        double[][] matriz = new double[3][3];
        // Leer valores de la matriz A
        System.out.println("Ingresar valores para la Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Realizar el calculo de la matriz A
        matriz = logica.CalcularEliminacionGaussiana(matriz);
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j;
        // Mostrar matriz resultado
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz resultado",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    // Metodo de suma de matrices
    private static void sumaMatrices() throws NumberFormatException, IOException {
        // Definir variables para la matriz A y B
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        // Leer valores de la matriz A
        System.out.println("Ingresar valores para la Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        System.out.println("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz1[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Leer valores de la matriz B
        System.out.println("Ingresar valores para la Matriz B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz B
        System.out.println("B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + matriz2[i][j] + " | ");
            }
            System.out.println();
        }
        // // Realizar el calculo de la matriz A
        double[][] matriz = new double[3][3];
        matriz = logica.CalcularSumaMatrices(matriz1, matriz2);
        int filas1 = matriz.length;
        int columnas1 = matriz[0].length;
        int i, j;
        // Mostrar los valores de la matriz resultado
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz resultado (A + B)",
                        JOptionPane.PLAIN_MESSAGE);
            }
            System.out.println();
        }
    }

    // Metodo de resta de matrices
    private static void restaMatrices() throws NumberFormatException, IOException {
        // Definir variables para la matriz A y B
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        // Leer valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz A: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        System.out.println("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz1[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Leer valores de la matriz B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz B: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz B
        System.out.println("B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz2[i][j] + " | ", "Matriz B",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Definir variables para el calculo de las matrices
        double[][] matriz = new double[3][3];
        matriz = logica.CalcularRestaMatrices(matriz1, matriz2);
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int i, j;
        // Mostrar los valores de la matriz resultado
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz resultado (A - B)",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    // Metodo de multiplicacion de matrices
    private static void multiplicacionMatrices() throws NumberFormatException, IOException {
        // Definir variables para la matriz A y B
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        // Leer valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz A: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        System.out.println("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz1[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Leer valores de la matriz B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz B
        System.out.println("B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz2[i][j] + " | ", "Matriz B",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Definir variables para el calculo de las matrices
        double[][] matriz = new double[3][3];
        matriz = logica.CalcularMultiplicacionMatrices(matriz1, matriz2);
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int i, j, k;
        // Mostrar los valores de la matriz resultado
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas2; j++) {
                for (k = 0; k < columnas1; k++) {
                    JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz resultado (A * B)",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }

    // Metodo para definir si una matriz es una matriz de identidad
    private static void esMatrizIdentidad() throws NumberFormatException, IOException {
        // Definir variables para la matriz A
        double[][] matriz = new double[3][3];
        // Leer valores de la matriz A
        System.out.println("Ingresar valores para la Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        System.out.println("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Verificar si la matriz es una matriz de identidad
        boolean resultado = logica.CalcularSiEsMatrizIdentidad(matriz);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La matriz es identidad.", "Matriz identidad",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es identidad.", "Matriz identidad",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    // Metodo para multiplicacion por una matriz identidad
    private static void multiplicacionMatrizIdentidad() throws NumberFormatException, IOException {
        // Definir variables para la matriz A
        double[][] matriz = new double[3][3];
        // Leer valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz A: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        System.out.println("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Definir variables para el calculo de la matriz
        double[][] matrizResultado = new double[3][3];
        matrizResultado = logica.CalcularMultiplicacionMatrizIdentidad(matriz);
        int filas = matrizResultado.length;
        int columnas = matrizResultado[0].length;
        int i, j, k;
        // Mostrar los valores de la matriz resultado
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                for (k = 0; k < columnas; k++) {
                    JOptionPane.showMessageDialog(null, " | " + matrizResultado[i][j] + " | ",
                            "Matriz resultado (A * A^-1)", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }

    // Metodo para calcular la transpuesta de una matriz
    private static void MatrizTranspuesta() throws NumberFormatException, IOException {
        // Definir variables para la matriz A
        double[][] matriz = new double[3][3];
        // Leer valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz A: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Definir variables para el calculo de la matriz
        double[][] matrizResultado = new double[3][3];
        matrizResultado = logica.CalcularMatrizTranspuesta(matriz);
        int filas = matrizResultado.length;
        int columnas = matrizResultado[0].length;
        int i, j;
        // Mostrar los valores de la matriz resultado
        System.out.println("A^T = ");
        for (i = 0; i < columnas; i++) {
            for (j = 0; j < filas; j++) {
                JOptionPane.showMessageDialog(null, " | " + matrizResultado[i][j] + " | ", "Matriz resultado (A^T)",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    // Metodo para calcular si una matriz es simetrica o no
    private static void matrizEsSimetrica() throws NumberFormatException, IOException {
        // Definir variables para la matriz A
        double[][] matriz = new double[3][3];
        // Leer valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Matriz A: Ingrese el valor de la posicion " + (i + 1) + "," + (j + 1)));
            }
        }
        // Mostrar los valores de la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, " | " + matriz[i][j] + " | ", "Matriz A",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Definir variables para el calculo de la matriz
        boolean resultado = logica.CalcularMatrizSiEsSimetrica(matriz);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "La matriz es simetrica.", "Matriz simetrica",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica.", "Matriz no simetrica",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static void finPrograma() {
        System.out.println("Gracias por usar el programa de matrices.");
        System.exit(0);
    }
}
