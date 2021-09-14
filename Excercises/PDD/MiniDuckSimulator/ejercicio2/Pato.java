package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pato {

    protected IVuelo vuelo;
    protected ISonido sonido;

    public Pato() {
    }

    public void setVuelo(IVuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setSonido(ISonido sonido) {
        this.sonido = sonido;
    }

    public abstract void mostrar();

    public void realizarVuelo() {
        this.vuelo.obtenerVuelo();
    }

    public void realizarSonido() {
        this.sonido.obtenerSonido();
    }

    public void nadar() {
        System.out.println("Puedo flotar en el agua");
    }
}