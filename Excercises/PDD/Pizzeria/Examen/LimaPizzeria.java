package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzeria extends Pizzeria {
    @Override
    public Pizza crearPizza(String tipo) {
        if (tipo.equals("queso")) {
            return new LimaPizzaDeQueso();
        } else if (tipo.equals("pepperoni")) {
            return new LimaPizzaDePepperoni();
        } else if (tipo.equals("almejas")) {
            return new LimaPizzaDeAlmeja();
        } else if (tipo.equals("vegetariana")) {
            return new LimaPizzaVegetariana();
        } else {
            return null;
        }
    }
}