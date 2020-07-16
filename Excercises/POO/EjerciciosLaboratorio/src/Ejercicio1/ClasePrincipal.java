package Ejercicio1;

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
        // Primer objeto
        Teclado teclado1 = new Teclado();
        System.out.println(teclado1.toString());
        System.out.println(teclado1.MostrarTipo());

        // Segundo objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar Marca de teclado: ");
        String marca = br.readLine();
        System.out.println("Ingresar Cantidad de teclas: ");
        int canTeclas = Integer.parseInt(br.readLine());
        System.out.println("Ingresar una configuracion de tipo de teclado: ");
        int tipo = Integer.parseInt(br.readLine());
        Teclado teclado2 = new Teclado(marca, canTeclas, tipo);
        System.out.println(teclado2.toString());
        System.out.println(teclado2.MostrarTipo());
        teclado2.CambiarTipo(2);
        System.out.println(teclado2.MostrarTipo());
    }
}
