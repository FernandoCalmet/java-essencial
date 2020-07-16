package Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Primer objeto
        Libro libro1 = new Libro();
        System.out.println(libro1.toString() + "\n");

        // Datos de objetos
        System.out.println("Ingresar el Titulo: ");
        String titulo = br.readLine();
        System.out.println("Ingresar el Autor: ");
        String autor = br.readLine();
        System.out.println("Ingresar el Editorial: ");
        String editorial = br.readLine();
        System.out.println("Ingresar el numero de paginas: ");
        int nroPag = Integer.parseInt(br.readLine());

        // Segundo objeto
        Libro libro2 = new Libro(titulo, autor, editorial, nroPag);
        System.out.println(libro2.toString());

        // Tercer objeto
        Libro libro3 = new Libro(titulo, autor, editorial, nroPag);
        System.out.println(libro3.toString());

        // Modificar primer objeto
        libro1.ModificarPaginas(2500);
        System.out.println("\nLa cantidad de paginas se modifico a " + libro1.MostrarPaginas() + " paginas.");

        // Modificar segundo objeto
        libro2.ModificarEditorial("Trujillo, 27 Abril del 2019");
        System.out.println("\nLa editorial se modifico por " + libro2.MostrarEditorial());

        // Mostrar todos los libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
    }
}
