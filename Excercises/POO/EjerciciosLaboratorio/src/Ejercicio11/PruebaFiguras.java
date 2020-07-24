package EjerciciosLaboratorio.src.Ejercicio11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaFiguras {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* A) CAPTURAR DATOS DE 2 TRIANGULOS */
        System.out.println("\n*Datos del primer triangulo*");
        System.out.println("Ingresar primera vertice");
        int vertice1 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar segunda vertice");
        int vertice2 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar tercer vertice");
        int vertice3 = Integer.parseInt(br.readLine());
        System.out.println("\n*Datos del segundo triangulo*");
        System.out.println("Ingresar primera vertice");
        int vertice4 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar segunda vertice");
        int vertice5 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar tercer vertice");
        int vertice6 = Integer.parseInt(br.readLine());
        /* ASIGNAR DATOS DE TRIANGULO A PUNTO2D */
        Punto2D punto1 = new Punto2D(vertice1, vertice2);
        Punto2D punto2 = new Punto2D(vertice2, vertice3);
        Punto2D punto3 = new Punto2D(vertice3, vertice1);
        Punto2D punto4 = new Punto2D(vertice4, vertice5);
        Punto2D punto5 = new Punto2D(vertice5, vertice6);
        Punto2D punto6 = new Punto2D(vertice6, vertice4);
        /* CREAR TRIANGULOS CON LOS PUNTOS2D */
        Triangulo2D triangulo1 = new Triangulo2D(punto1, punto2, punto3);
        Triangulo2D triangulo2 = new Triangulo2D(punto4, punto5, punto6);

        /* B) MOSTRAR EL PERIMTRO DE CADA TRIANGULO */
        System.out.println(triangulo1.calcularPerimetro());
        System.out.println(triangulo2.calcularPerimetro());

        /* C) MOSTRAR TIPOS DE TRIANGULOS CREADOS */
        System.out.println(triangulo1.devolverTipoTriangulo(punto1, punto2, punto3));
        System.out.println(triangulo2.devolverTipoTriangulo(punto4, punto5, punto6));

        /* D) MOSTRAR COORDENADAS DE TRIANGULOS CREADOS */
        System.out.println(triangulo1.toString());
        System.out.println(triangulo2.toString());
    }
}