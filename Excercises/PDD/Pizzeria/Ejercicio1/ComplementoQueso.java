package Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoQueso extends PizzaDecorator {
    private Pizza wrappedPizza;
    
    public ComplementoQueso(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
        this.descripcion = this.wrappedPizza.getDescripcion() + " + Queso";
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getCosto() {
        return 0.50 + this.wrappedPizza.getCosto();
    }
}