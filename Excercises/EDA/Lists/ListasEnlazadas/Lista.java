package Excercises.EDA.Lists.ListasEnlazadas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Lista {
    // Punteros
    protected Nodo punteroInicial, punteroFinal;

    public Lista() {
        this.punteroInicial = null;
        this.punteroFinal = null;
    }

    // Agregar nodo al inicio de la lista
    public void agregarNodoInicio(int elemento) {
        this.punteroInicial = new Nodo(elemento, this.punteroInicial);
        if (this.punteroFinal == null) {
            this.punteroFinal = this.punteroInicial;
        }
    }

    // Mostras datos
    public void mostrarLista() {
        Nodo nodoRecorrer = this.punteroInicial;
        System.out.println();
        while (nodoRecorrer != null) {
            System.out.print("[" + nodoRecorrer.dato + "]-->");
            nodoRecorrer = nodoRecorrer.siguiente;
        }
    }
}