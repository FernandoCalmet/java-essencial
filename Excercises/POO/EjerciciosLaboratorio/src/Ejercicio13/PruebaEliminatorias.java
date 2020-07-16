package Ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaEliminatorias {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* CAPTURAR DATOS DE EQUIPO Y JUGADORES */
        // Pais del equipo
        System.out.println("Ingresar el pais del equipo: ");
        String pais = br.readLine();
        // Lista de jugadores del equipo
        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        // Jugador #1
        System.out.println("* DATOS DEL JUGADOR #1 *");
        System.out.println("Ingresar DNI del jugador: ");
        String dni1 = br.readLine();
        System.out.println("Ingresar nombre del jugador");
        String nombre1 = br.readLine();
        System.out.println("Ingresar el numero de Dorsal del jugador: ");
        int dorsal1 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar en que posicion juega el jugador");
        String posicion1 = br.readLine();
        System.out.println("Ingresar el estado del jugador (Titular o Suplente)");
        String estado1 = br.readLine();
        // Jugador #2
        System.out.println("* DATOS DEL JUGADOR #2 *");
        System.out.println("Ingresar DNI del jugador: ");
        String dni2 = br.readLine();
        System.out.println("Ingresar nombre del jugador");
        String nombre2 = br.readLine();
        System.out.println("Ingresar el numero de Dorsal del jugador: ");
        int dorsal2 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar en que posicion juega el jugador");
        String posicion2 = br.readLine();
        System.out.println("Ingresar el estado del jugador (Titular o Suplente)");
        String estado2 = br.readLine();
        // Jugador #3
        System.out.println("* DATOS DEL JUGADOR #3 *");
        System.out.println("Ingresar DNI del jugador: ");
        String dni3 = br.readLine();
        System.out.println("Ingresar nombre del jugador");
        String nombre3 = br.readLine();
        System.out.println("Ingresar el numero de Dorsal del jugador: ");
        int dorsal3 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar en que posicion juega el jugador");
        String posicion3 = br.readLine();
        System.out.println("Ingresar el estado del jugador (Titular o Suplente)");
        String estado3 = br.readLine();
        /* CREAR OBJETOS JUGADOR PARA ASGINAR SUS DATOS CAPTURADOS */
        Jugador jugador1 = new Jugador(dni1, nombre1, dorsal1, posicion1, estado1);
        Jugador jugador2 = new Jugador(dni2, nombre2, dorsal2, posicion2, estado2);
        Jugador jugador3 = new Jugador(dni3, nombre3, dorsal3, posicion3, estado3);
        /* INSERTAR JUGADORES A LA LISTA DEL EQUIPO */
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        /* CREAR UN EQUIPO PARA INSERTAR LA LISTA DE JUGADORES Y SU PAIS */
        Equipo equipo1 = new Equipo(pais, listaJugadores);
        equipo1.setJugadores(listaJugadores);

        /* B) MOSTRAR LOS DATOS DEL EQUIPO CREADO */
        System.out.println(equipo1.toString());

        /* C) BUSCAR UN JUGADOR DE UN EQUIPO POR DNI Y MOSTRAR SUS DATOS */
        System.out.println("Ingresar el DNI que desea buscar: ");
        String buscarDni = br.readLine();
        System.out.println("\nResultado de busqueda: " + equipo1.buscarPorDni(listaJugadores, buscarDni));

        /* D) LISTAR DATOS DE UN EQUIPO DE JUGADORES TITULARES Y SUPLENTES */
        equipo1.buscarPorEstado(listaJugadores);
    }
}