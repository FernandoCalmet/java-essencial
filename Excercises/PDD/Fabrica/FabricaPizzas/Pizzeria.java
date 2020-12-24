package Excercises.PDD.Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizzeria {
    protected abstract Pizza crearPizza(String tipo);

    public Pizza ordenarPizza(String tipo) {
        Pizza pizza = crearPizza(tipo);

        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.envasar();

        return pizza;
    }
}