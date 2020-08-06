package Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pizzeria {
    protected SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = this.factory.createPizza(type);

        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.envasar();

        return pizza;
    }
}