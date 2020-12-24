package Excercises.PDD.Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("queso")) {
            return new PizzaDeQueso();
        } else if (type.equals("pepperoni")) {
            return new PizzaPepperoni();
        } else if (type.equals("almejas")) {
            return new PizzaDeAlmejas();
        } else if (type.equals("vegetariana")) {
            return new PizzaVegetariana();
        } else {
            return null;
        }
    }
}