package Ejercicio6;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Capturar datos del objeto punto
        System.out.println("Ingresar primera vertice");
        int vertice1 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar segunda vertice");
        int vertice2 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar tercer vertice");
        int vertice3 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar cuartovertice");
        int vertice4 = Integer.parseInt(br.readLine());
        // Crear objetos punto
        Punto punto1 = new Punto(vertice1, vertice2);
        Punto punto2 = new Punto(vertice2, vertice3);
        Punto punto3 = new Punto(vertice3, vertice4);
        Punto punto4 = new Punto(vertice4, vertice1);
        // Calcular distancias entre los objetos puntos
        System.out.println("Distancia entre 2 puntos: " + punto1.calcularDistancia(punto2));
        System.out.println("Distancia entre 2 puntos: " + punto2.calcularDistancia(punto3));
        System.out.println("Distancia entre 2 puntos: " + punto3.calcularDistancia(punto4));
        System.out.println("Distancia entre 2 puntos: " + punto4.calcularDistancia(punto1));
        // Mostrar datos del objeto punto
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(punto3.toString());
        System.out.println(punto4.toString());
        // Comparar si la distancia es igual entre 2 puntos del objeto
        System.out.println(punto1.comparar2Puntos(punto2));
        System.out.println(punto2.comparar2Puntos(punto3));
        System.out.println(punto3.comparar2Puntos(punto4));
        System.out.println(punto4.comparar2Puntos(punto1));
        // Crear objeto rectangulo y insertarle los objetos punto
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        // Calcular las dimensiones del objeto rectangulo
        System.out.println("Ancho: " + rectangulo.calcularAncho());
        System.out.println("Largo: " + rectangulo.calcularLargo());
        System.out.println("Area: " + rectangulo.calcularArea());
        // Ver los datos del objeto rectangulo
        System.out.println(rectangulo.toString());
    }
}
