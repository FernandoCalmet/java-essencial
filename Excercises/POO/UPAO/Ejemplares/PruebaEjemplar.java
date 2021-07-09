package Excercises.POO.UPAO.Ejemplares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaEjemplar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. Crear 2 Ejemplares, un objeto debe ser ingresado por teclado.
        System.out.println("Datos del Ejemplar 1:");
        System.out.println("Ingresar el Titulo: ");
        String titulo1 = br.readLine();
        System.out.println("Ingresar el numero de paginas: ");
        int nroPag1 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar el Autor: ");
        String autor1 = br.readLine();
        Ejemplar ejemplar1 = new Ejemplar(titulo1, nroPag1, autor1);
        System.out.println("Ejemplar 1 creado exitosamente.");

        System.out.println("Datos del Ejemplar 2:");
        System.out.println("Ingresar el Titulo: ");
        String titulo2 = br.readLine();
        System.out.println("Ingresar el numero de paginas: ");
        int nroPag2 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar el Autor: ");
        String autor2 = br.readLine();
        Ejemplar ejemplar2 = new Ejemplar(titulo2, nroPag2, autor2);
        System.out.println("Ejemplar 2 creado exitosamente.");

        // 2. Mostrar los ejemplares creados.
        System.out.println(ejemplar1.MostrarDatos());
        System.out.println(ejemplar2.MostrarDatos());

        // 3. Modificar el nro de paginas del 2° Ejemplar.
        System.out.println("Modificar el numero de paginas del ejemplar 2: ");
        int nroPag = Integer.parseInt(br.readLine());
        ejemplar2.ModificarPaginas(nroPag);

        // 4. Prestar el 1° Ejemplar.
        System.out.println("Estado del ejemplar" + ejemplar1.ObtenerCodigo() + " " + ejemplar1.Prestar());

        // 5. Mostrar datos del 1° Ejemplar.
        System.out.println(ejemplar1.MostrarDatos());

        // 6. Devolver el 1° Ejemplar.
        System.out.println("Estado del ejemplar" + ejemplar1.ObtenerCodigo() + " " + ejemplar1.Devolver());

        // 7. Verificar si 2 ejemplares son idénticos y si son iguales.
        System.out.println(VerificarSimilitud(ejemplar1, ejemplar2));
    }

    public static String VerificarSimilitud(Ejemplar ejemplar1, Ejemplar ejemplar2) {
        String resultado = "No son iguales";

        if (ejemplar1 == ejemplar2) {
            resultado = "Son iguales";
        }

        return resultado;
    }
}
