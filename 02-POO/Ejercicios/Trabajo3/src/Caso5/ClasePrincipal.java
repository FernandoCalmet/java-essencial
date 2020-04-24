package Caso5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author fernandocalmet
 */
public class ClasePrincipal 
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
        
        //Capturar datos de un objeto equipo
        System.out.println("Ingresar el pais del equipo: ");
        String pais = br.readLine();
        
        //Crear lista de jugadores
        ArrayList<Jugador> listaJugadores = new ArrayList();
                        
        //Capturar datos de un objeto jugador
        System.out.println("Ingresar DNI del jugador: ");
        int dni = Integer.parseInt(br.readLine());
        System.out.println("Ingresar nombre del jugador");
        String nombre = br.readLine();
        System.out.println("Ingresar el numero de Dorsal del jugador: ");
        int dorsal = Integer.parseInt(br.readLine());
        System.out.println("Ingresar en que posicion juega el jugador");
        String posicion = br.readLine();
        System.out.println("Ingresar el estado del jugador");
        String estado = br.readLine();
                        
        //Crear objetos jugador
        Jugador jugador1 = new Jugador(dni, nombre, dorsal, posicion, estado);
        Jugador jugador2 = new Jugador(12345678, "Fernando", 10, "Delantero", "Titular"); 
                             
        //Añadir objetos jugador al arreglo de la lista del objeto jugador
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        
        //Crear objeto equipo
        Equipo equipo1 = new Equipo(pais, listaJugadores);
        
        //Añadir lista de jugadores al objeto equipo
        equipo1.setJugadores(listaJugadores);                             
        
        //Mostrar datos del objeto equipo
        System.out.println(equipo1.toString());
        
        //Buscar un objeto jugador por su atributo dni en el objeto equipo
        System.out.println("\nResultado de busqueda: "+equipo1.buscarPorDni(jugador1, 12341234));
        
        //Mostrar objetos jugador con atributos titulares y suplentes
        System.out.println("\nLista jugadores titulares y suplentes:\n"+equipo1.buscarPorEstado(listaJugadores));
    }
}
