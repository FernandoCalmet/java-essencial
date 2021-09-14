package Excercises.PDD.MiniDuckSimulator.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pato {

    protected Volable volable;
    protected Cuaqueable cuaqueable;

    public Pato() {

    }

    public void setVolable(Volable fb) {
        this.volable = fb;
    }

    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = qb;
    }

    public abstract void mostrar();

    public void realizarVuelo() {
        this.volable.volar();
    }

    public void realizarCuaqueo() {
        this.cuaqueable.cuaquear();
    }

    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }
}
