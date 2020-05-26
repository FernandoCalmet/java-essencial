package Caso5;

import java.util.ArrayList;

/**
 *
 * @author fernandocalmet
 */
public class Equipo 
{
    private String pais;
    private static ArrayList<Jugador> jugadores;
   
    public Equipo(String pais, ArrayList<Jugador> jugadores) {
        this.pais = pais;
        this.jugadores = jugadores;
    } 

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public String buscarPorDni(Jugador jugador, int dni)
    {
        if(jugador.getDni() == dni)
        {
            return "\nDNI: "+jugador.getDni()+"\nNombre: "+jugador.getNombre()+"\nDorsal: "+jugador.getDorsal()+"\nPosicion: "+jugador.getPosicion()+"\nEstado: "+jugador.getEstado();
        }
        else
        {
            return "No existe un jugador con ese numero de DNI.";
        }
    }
    
    public String buscarPorEstado(ArrayList<Jugador> listaJugadores)
    {
        return "Falta implementar";
    }
    
    @Override
    public String toString()
    {
        return "Jugadores del equipo de "+getPais()+":"+"\n"+getJugadores();
    }
}
