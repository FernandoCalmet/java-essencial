package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizzeria {
    protected abstract Pizza crearPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = crearPizza(type);

        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.envolver();

        return pizza;
    }
}