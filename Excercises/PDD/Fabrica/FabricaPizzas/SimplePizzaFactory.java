package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class SimplePizzaFactory {
    public Pizza crearPizza(String type) {
        Pizza pizza = null;

        if (type.equals("queso")) {
            pizza = new PizzaDeQueso();
        } else if (type.equals("pepperoni")) {
            pizza = new PizzaPepperoni();
        } else if (type.equals("almejas")) {
            pizza = new PizzaDeAlmejas();
        } else if (type.equals("vegetariana")) {
            pizza = new PizzaVegetariana();
        }
        return pizza;
    }
}