package Excercises.POO.UPAO.Matrices.ejercicio3.logica;

import javax.swing.JOptionPane;

public class Operacion {
    public static Matriz matrizC;

    // METODO DE SUMA
    public static Matriz suma(Matriz matrizA, Matriz matrizB) {
        matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());
        Integer suma = 0;
        if ((matrizA.getNroFilas() == matrizB.getNroFilas())
                && (matrizA.getNroColumnas() == matrizB.getNroColumnas())) {
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizA.getNroColumnas(); j++) {
                    suma = matrizA.getValor(i, j) + matrizB.getValor(i, j);
                    matrizC.setValor(i, j, suma);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return matrizC;
    }

    // METODO DE MULTIPLICACION
    public static Matriz multiplicacion(Matriz matrizA, Matriz matrizB) {
        Integer suma = 0;
        if (matrizA.getNroColumnas() == matrizB.getNroFilas()) {
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizB.getNroColumnas(); j++) {
                    for (int k = 0; k < matrizB.getNroColumnas(); k++) {
                        suma += matrizA.getValor(i, k) * matrizB.getValor(k, j);
                        matrizC.setValor(i, j, suma);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return matrizC;
    }

    // METODO DE LA DETERMINANTE
    public static String determinante(Matriz matrizA) {
        Integer nroFilas = matrizA.getNroFilas();
        float copiaMatrizA[][] = new float[nroFilas][nroFilas];
        float deter = 1;
        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroFilas; j++) {
                copiaMatrizA[i][j] = matrizA.getValor(i, j);
            }
        }
        for (int k = 0; k < (nroFilas - 1); k++) {
            for (int i = (k + 1); i < nroFilas; i++) {
                for (int j = (k + 1); j < nroFilas; j++) {
                    copiaMatrizA[i][j] -= copiaMatrizA[i][k] * copiaMatrizA[k][j] / copiaMatrizA[k][k];
                }
            }
        }
        for (int i = 0; i < nroFilas; i++) {
            deter *= copiaMatrizA[i][i];
        }
        String CAD = "";
        CAD = "" + deter;
        return CAD;
    }
}