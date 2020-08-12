package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzeria extends Pizzeria {
    @Override
    public Pizza crearPizza(String tipo) {
        if (tipo.equals("queso")) {
            return new PunoPizzaDeQueso();
        } else if (tipo.equals("pepperoni")) {
            return new PunoPizzaDePepperoni();
        } else if (tipo.equals("almejas")) {
            return new PunoPizzaDeAlmeja();
        } else if (tipo.equals("vegetariana")) {
            return new PunoPizzaVegetariana();
        } else {
            return null;
        }
    }
}