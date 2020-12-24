package Excercises.EDA.Lists.ListasEnlazadas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Nodo {
    public int dato;
    public Nodo siguiente; // Puntero

    // Para insertar al final
    public Nodo(int dato) {
        this.dato = dato;
    }

    // Para insertar al inicio
    public Nodo(int dato, Nodo nodo) {
        this.dato = dato;
        this.siguiente = nodo;
    }
}