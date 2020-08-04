package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizza implements IPizza {
    public String nombre;
    public String masa;
    public String salsa;
    public String coverturas;

    public void preparar() {
        System.out.println("Preparando " + this.nombre);
    }

    public void hornear() {
        System.out.println("Horneando " + this.nombre);
    }

    public void cortar() {
        System.out.println("Cortando " + this.nombre);
    }

    public void envasar() {
        System.out.println("Envasando " + this.nombre);
    }

    public String getNombre() {
        return this.nombre;
    }
}