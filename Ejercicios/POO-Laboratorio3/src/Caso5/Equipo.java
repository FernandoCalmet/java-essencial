package Caso5;

import java.util.ArrayList;

public class Equipo {

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

    public String buscarPorDni(ArrayList<Jugador> jugador, String dni) {
        String resultado = "";
        for (Jugador item : jugador) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                resultado = "\nDNI: " + item.getDni() + "\nNombre: " + item.getNombre() + "\nDorsal: "
                        + item.getDorsal() + "\nPosicion: " + item.getPosicion() + "\nEstado: " + item.getEstado();
            }
        }

        if (resultado.isEmpty()) {
            resultado = "No existe un jugador con ese numero de DNI.";
        }

        return resultado;
    }

    public void buscarPorEstado(ArrayList<Jugador> jugadores) {
        for (Jugador item : jugadores) {
            if (item.getEstado().equalsIgnoreCase("Titular")) {
                System.out.println("\nTITULARES: " + item.toString());
            }
        }
        for (Jugador item2 : jugadores) {
            if (item2.getEstado().equalsIgnoreCase("Suplente")) {
                System.out.println("\nSUPLENTES: " + item2.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "\nJugadores del equipo de " + getPais() + ":" + "\n" + getJugadores();
    }
}