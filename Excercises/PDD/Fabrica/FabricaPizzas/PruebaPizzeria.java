package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaPizzeria {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizzeria store = new Pizzeria(factory);

        IPizza pizza = store.ordenarPizza("queso");
        System.out.println("Orden de una " + pizza.getNombre() + "\n");

        pizza = store.ordenarPizza("vegetariana");
        System.out.println("Orden de una " + pizza.getNombre() + "\n");
    }
}