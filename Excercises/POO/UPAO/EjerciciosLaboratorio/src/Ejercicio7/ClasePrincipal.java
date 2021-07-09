package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Capturar datos del objeto
        System.out.println("Ingresar el valor de la coordenada X del Punto A");
        double coordXA = Double.parseDouble(br.readLine());
        System.out.println("Ingresar el valor de la coordenada Y del Punto A");
        double coordYA = Double.parseDouble(br.readLine());
        System.out.println("Ingresar el valor de la coordenada X del Punto B");
        double coordXB = Double.parseDouble(br.readLine());
        System.out.println("Ingresar el valor de la coordenada Y del Punto B");
        double coordYB = Double.parseDouble(br.readLine());
        // Crear objeto punto
        Punto ptoA = new Punto(coordXA, coordYA);
        Punto ptoB = new Punto(coordXB, coordYB);
        // Crear objeto Linea con parametros
        Linea linea1 = new Linea(ptoA, ptoB);
        // Mostrar posicion actual del objeto
        System.out.println("\nPosicion Inicial: " + linea1.toString());
        // Mover la posicion del objeto
        linea1.mueveAbajo(20);
        linea1.mueveDerecha(60);
        linea1.mueveArriba(15);
        linea1.mueveIzquierda(120);
        // Mostrar posicion actual del objeto
        System.out.println("\nPosicion Actual: " + linea1.toString());
        // Crear objeto Linea sin parametros
        Linea linea2 = new Linea();
        System.out.println("\nLinea vacia: " + linea2.toString());
    }
}
