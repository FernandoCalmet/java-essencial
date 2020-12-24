package Excercises.POO.EjerciciosLaboratorio.src.Ejercicio8;

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
        // Capturar datos de objetos
        System.out.println("Ingresar coordenada para X");
        double coordX = Double.parseDouble(br.readLine());
        System.out.println("Ingresar coordenada para Y");
        double coordY = Double.parseDouble(br.readLine());
        System.out.println("Ingresar un valor para el radio");
        double radio = Double.parseDouble(br.readLine());
        System.out.println("Ingresar un valor para la altura");
        double altura = Double.parseDouble(br.readLine());
        // Crear objeto Punto
        Punto punto = new Punto(coordX, coordY);
        // Mostrar objeto Punto
        System.out.println(punto.toString());
        // Trasladar objeto Punto
        punto.trasladar(150, 85);
        // Mostrar objeto Punto luego de la traslacion
        System.out.println(punto.toString());
        // Crear objeto Circulo
        Circulo circulo = new Circulo(radio, punto);
        // Mostrar objeto Circulo
        System.out.println(circulo.toString());
        // Operaciones del objeto Circulo
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        // Trasladar objeto Circulo
        circulo.trasladar(300, 100);
        // Mostrar objeto Circulo luego de la traslacion
        System.out.println(circulo.toString());
        // Crear objeto Cilindro
        Cilindro cilindro = new Cilindro(altura, circulo);
        // Mostrar objeto Cilindro
        System.out.println(cilindro.toString());
        // Operaciones del objeto Cilindro
        System.out.println("Superficie: " + cilindro.calcularSuperficie());
        System.out.println("Volumen: " + cilindro.calcularVolumen());
        // Trasladar objeto Cilindro
        cilindro.trasladar(1200, 800);
        // Mostrar objeto Cilindro luego de la traslacion
        System.out.println(cilindro.toString());
    }
}
