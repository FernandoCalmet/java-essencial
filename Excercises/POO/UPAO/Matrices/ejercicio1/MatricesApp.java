package Excercises.POO.UPAO.Matrices.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MatricesApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    eliminacionGaussiana();
                    break;
                case 2:
                    sumaMatrices();
                    break;
                case 3:
                    restaMatrices();
                    break;
                case 4:
                    multiplicacionMatrices();
                    break;
                case 5:
                    boolean identidad = esMatrizIdentidad();
                    if (identidad == true) {
                        System.out.println("La matriz es identidad");
                    } else {
                        System.out.println("La matriz no es identidad");
                    }
                    break;
                case 6:
                    multiplicacionMatrizIdentidad();
                    break;
                case 7:
                    MatrizTranspuesta();
                    break;
                case 8:
                    boolean simetrica = matrizEsSimetrica();
                    if (simetrica == true) {
                        System.out.println("La matriz es simetrica");
                    } else {
                        System.out.println("La matriz no es simetrica");
                    }
                    break;
                case 9:
                    finPrograma();
                    break;
            }
        } while (opcion != 9);
    }

    private static int menu() throws IOException {
        int opcion;
        do {
            System.out.println("*** PROGRAMA DE MATRICES ***");
            System.out.println("1. Eliminacion gausiana.");
            System.out.println("2. Suma de matrices.");
            System.out.println("3. Resta de matrices.");
            System.out.println("4. Multiplicacion de matrices");
            System.out.println("5. Definir si es una matriz identidad");
            System.out.println("6. Multiplicar una matriz identidad");
            System.out.println("7. Calcular la transpuesta de una matriz");
            System.out.println("8. Calcular si una matriz es simetrica");
            System.out.println("9. Fin del programa");
            opcion = Integer.parseInt(br.readLine());
        } while (opcion < 1 || opcion > 9);

        return opcion;
    }

    // Metodo eliminacion gausiana
    private static void eliminacionGaussiana() throws NumberFormatException, IOException {
        System.out.println("*** Eliminación Guassiana ***");
        double[][] matriz = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j, k;
        double[][] aux = new double[filas][columnas];
        double[][] resultado = new double[filas][columnas];
        double[] vector = new double[columnas];
        double suma;
        double[][] matrizTranspuesta = new double[columnas][filas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                aux[i][j] = matriz[i][j];
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = aux[i][j];
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                vector[j] = matrizTranspuesta[j][i];
            }
            for (j = 0; j < columnas; j++) {
                suma = 0;
                for (k = 0; k < columnas; k++) {
                    suma += matrizTranspuesta[j][k] * vector[k];
                }
                resultado[i][j] = suma;
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.println(matriz[i][j] = resultado[i][j]);
            }
        }
    }

    // Metodo de suma de matrices
    private static void sumaMatrices() throws NumberFormatException, IOException {
        System.out.println("*** Suma de matrices ***");
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int i, j;
        double[][] resultado = new double[filas1][columnas1];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                System.out.println(resultado[i][j] = matriz1[i][j] + matriz2[i][j]);
            }
        }
    }

    // Metodo de resta de matrices
    private static void restaMatrices() throws NumberFormatException, IOException {
        System.out.println("*** Resta de matrices ***");
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int i, j;
        double[][] resultado = new double[filas1][columnas1];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                System.out.println(resultado[i][j] = matriz1[i][j] - matriz2[i][j]);
            }
        }
    }

    // Metodo de multiplicacion de matrices
    private static void multiplicacionMatrices() throws NumberFormatException, IOException {
        System.out.println("*** Multiplicacion de matrices ***");
        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = Double.parseDouble(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int i, j, k;
        double[][] resultado = new double[filas1][columnas2];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas2; j++) {
                resultado[i][j] = 0;
                for (k = 0; k < columnas1; k++) {
                    System.out.println(resultado[i][j] += matriz1[i][k] * matriz2[k][j]);
                }
            }
        }
    }

    // Metodo para definir si una matriz es una matriz de identidad
    private static boolean esMatrizIdentidad() throws NumberFormatException, IOException {
        System.out.println("*** Identidad de matrices ***");
        double[][] matriz = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Metodo para multiplicacion por una matriz identidad
    private static void multiplicacionMatrizIdentidad() throws NumberFormatException, IOException {
        System.out.println("*** Multiplicacion por matriz identidad ***");
        double[][] matriz = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j, k;
        double[][] resultado = new double[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                resultado[i][j] = 0;
                for (k = 0; k < columnas; k++) {
                    System.out.println(resultado[i][j] += matriz[i][k] * resultado[k][j]);
                }
            }
        }
    }

    // Metodo para calcular la transpuesta de una matriz
    private static void MatrizTranspuesta() throws NumberFormatException, IOException {
        System.out.println("*** Transpuesta de matrices ***");
        double[][] matriz = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j;
        double[][] resultado = new double[columnas][filas];
        for (i = 0; i < columnas; i++) {
            for (j = 0; j < filas; j++) {
                System.out.println(resultado[i][j] = matriz[j][i]);
            }
        }
    }

    // Metodo para calcular si una matriz es simetrica o no
    private static boolean matrizEsSimetrica() throws NumberFormatException, IOException {
        System.out.println("*** Matriz simetrica ***");
        double[][] matriz = new double[3][3];
        System.out.println("Ingresar valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Double.parseDouble(br.readLine());
            }
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void finPrograma() {
        System.out.println("Gracias por usar el programa de matrices.");
        System.exit(0);
    }
}