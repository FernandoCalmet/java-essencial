package Excercises.POO.UPAO.Libros;

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

        Libro libro1 = new Libro();
        System.out.println(libro1.toString() + "\n");

        System.out.println("Ingresar el Titulo: ");
        String titulo = br.readLine();
        System.out.println("Ingresar el Autor: ");
        String autor = br.readLine();
        System.out.println("Ingresar el Editorial: ");
        String editorial = br.readLine();
        System.out.println("Ingresar el numero de paginas: ");
        int nroPag = Integer.parseInt(br.readLine());

        Libro libro2 = new Libro(titulo, autor, editorial, nroPag);
        System.out.println(libro2.toString());

        Libro libro3 = new Libro(titulo, autor, editorial, nroPag);
        System.out.println(libro3.toString());

        libro1.ModificarPaginas(2500);
        System.out.println("\nLa cantidad de paginas se modifico a " + libro1.MostrarPaginas() + " paginas.");

        libro2.ModificarEditorial("Trujillo, 27 Abril del 2019");
        System.out.println("\nLa editorial se modifico por " + libro2.MostrarEditorial());

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
    }
}
