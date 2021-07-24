package Excercises.POO.UPAO.Matrices.ejercicio2.logica;

import java.io.*;
import java.util.*;

public class MatrizControlador {
    private Matriz matriz;
    private Matriz arregloMatrices[];

    // CONSTRUCTOR
    public MatrizControlador() {
        arregloMatrices = new Matriz[2];
    }

    // METODOS
    public void abrirArchivo(String rutaArchivo) {
        String linea = "";
        Integer filas = 0;
        Integer columnas = 0;
        Integer valor = 0;
        Integer indice = 0;
        try {
            FileReader fr = new FileReader("" + rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, "/");
                filas = Integer.parseInt(st.nextToken().trim());
                columnas = Integer.parseInt(st.nextToken().trim());

                matriz = new Matriz(filas, columnas);
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        valor = Integer.parseInt(st.nextToken().trim());
                        matriz.setValor(i, j, valor);
                    }
                }
                this.setMatriz(indice, matriz);
                indice++;
                linea = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    // METODO GET
    public Matriz getMatriz(int i) {
        return arregloMatrices[i];
    }

    // METODO SET
    public void setMatriz(int i, Matriz m) {
        arregloMatrices[i] = m;
    }

    //
    public void guardarArchivo(String nombreArchivo, Matriz matrizA, Matriz matrizB) {
        String cadenaInsertar = "";
        try {
            FileWriter fw = new FileWriter("" + nombreArchivo, true);
            PrintWriter pw = new PrintWriter(fw);
            // INSERTANDO CADENA DE MATRIZ A
            cadenaInsertar = matrizA.getNroFilas() + "/" + matrizA.getNroColumnas() + "/";
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizA.getNroColumnas(); j++) {
                    cadenaInsertar += matrizA.getValor(i, j) + "/";
                    if (i == matrizA.getNroFilas() && j == matrizA.getNroColumnas()) {
                        cadenaInsertar += matrizA.getValor(i, j);
                    }
                }
            }
            pw.println(cadenaInsertar);
            // INSERTANDO CADENA DE MATRIZ B
            cadenaInsertar = matrizB.getNroFilas() + "/" + matrizB.getNroColumnas() + "/";
            for (int i = 0; i < matrizB.getNroFilas(); i++) {
                for (int j = 0; j < matrizB.getNroColumnas(); j++) {
                    cadenaInsertar += matrizB.getValor(i, j) + "/";
                    if (i == matrizB.getNroFilas() && j == matrizB.getNroColumnas()) {
                        cadenaInsertar += matrizB.getValor(i, j);
                    }
                }
            }
            pw.println(cadenaInsertar);
            pw.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}