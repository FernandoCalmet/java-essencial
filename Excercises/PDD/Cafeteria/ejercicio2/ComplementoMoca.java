package Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoMoca extends CafeDecorator {
    private Cafe wrappedCoffee;

    public ComplementoMoca(Cafe wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.descripcion = this.wrappedCoffee.getDescripcion() + " + Moca";
    }

    @Override
    public double getCosto() {
        return 0.20 + this.wrappedCoffee.getCosto();
    }
}