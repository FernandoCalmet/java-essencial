package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pizzeria {
    SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza ordenarPizza(String tipo) {
        Pizza pizza;
        pizza = factory.crearPizza(tipo);
        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.envasar();

        return pizza;
    }
}