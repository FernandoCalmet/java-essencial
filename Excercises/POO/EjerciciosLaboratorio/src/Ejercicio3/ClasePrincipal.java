package Ejercicio3;

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

        // Primer objeto con constructor vacio
        VideoJuego juego1 = new VideoJuego();
        System.out.println(juego1.toString());

        // Segundo objeto con constructor con titulo y horasEstimadas
        System.out.println("\nIngresar un titulo: ");
        String titulo = br.readLine();
        System.out.println("Ingresar las  horas estimadas: ");
        int horasEstimadas = Integer.parseInt(br.readLine());
        System.out.println("Ingresar un genero: ");
        String genero = br.readLine();
        System.out.println("Ingresar la compañia: ");
        String compania = br.readLine();
        VideoJuego juego2 = new VideoJuego(titulo, horasEstimadas, genero, compania);
        System.out.println(juego2.toString());

        // Modificar los atributos del primer objeto
        juego1.setTitulo("Starcraft");
        juego1.setHorasEstimadas(12);
        juego1.setGenero("Estrategia");
        juego1.setCompania("Blizzard");
        System.out.println("\nLos datos modificados del primer VideoJuego son:\n" + juego1.toString());

        // Modificar las horas estimadas del segundo objeto
        juego2.setHorasEstimadas(24);
        System.out.println("\nLas horas estimadas fue modificada a " + juego2.getHorasEstimadas());

        // Mostrar todos los atributos de los objetos creados
        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
    }
}
