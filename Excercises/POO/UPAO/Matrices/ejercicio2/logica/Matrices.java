package Excercises.POO.UPAO.Matrices.ejercicio2.logica;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Matrices {
    public Matrices() {
    }

    public double[][] CalcularEliminacionGaussiana(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j, k;
        double[][] matrizAux = new double[filas][columnas];
        double[][] matrizResultado = new double[filas][columnas];
        double[] vector = new double[columnas];
        double suma;
        // Calcular la matriz auxiliar
        double[][] matrizTranspuesta = new double[columnas][filas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizAux[i][j] = matriz[i][j];
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizAux[i][j];
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
                matrizResultado[i][j] = suma;
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matriz[i][j] = matrizResultado[i][j];
            }
        }

        return matriz;
    }

    public double[][] CalcularSumaMatrices(double[][] matrizA, double[][] matrizB) {
        int filas1 = matrizA.length;
        int columnas1 = matrizA[0].length;
        int i, j;

        double[][] resultado = new double[filas1][columnas1];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public double[][] CalcularRestaMatrices(double[][] matrizA, double[][] matrizB) {
        int filas1 = matrizA.length;
        int columnas1 = matrizA[0].length;
        int i, j;

        double[][] resultado = new double[filas1][columnas1];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas1; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    public double[][] CalcularMultiplicacionMatrices(double[][] matrizA, double[][] matrizB) {
        int filas1 = matrizA.length;
        int columnas1 = matrizA[0].length;
        int columnas2 = matrizB[0].length;
        int i, j, k;

        double[][] resultado = new double[filas1][columnas2];
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas2; j++) {
                for (k = 0; k < columnas1; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public boolean CalcularSiEsMatrizIdentidad(double[][] matriz) {
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

    public double[][] CalcularMultiplicacionMatrizIdentidad(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j, k;

        double[][] resultado = new double[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                for (k = 0; k < columnas; k++) {
                    if (i == k) {
                        resultado[i][j] = matriz[i][k];
                    }
                }
            }
        }

        return resultado;
    }

    public double[][] CalcularMatrizTranspuesta(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int i, j;

        double[][] resultado = new double[columnas][filas];
        for (i = 0; i < columnas; i++) {
            for (j = 0; j < filas; j++) {
                resultado[i][j] = matriz[j][i];
            }
        }

        return resultado;
    }

    public boolean CalcularMatrizSiEsSimetrica(double[][] matriz) {
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
}
