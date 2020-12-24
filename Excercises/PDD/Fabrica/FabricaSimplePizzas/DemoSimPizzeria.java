package Excercises.PDD.Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DemoSimPizzeria {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizzeria pizzeria = new Pizzeria(factory);

        System.out.println("BIENVENIDOS A LA PIZZERIA\n");

        Pizza pizza = pizzeria.orderPizza("queso");
        System.out.println("Su orden es: " + pizza.getNombre());
        System.out.println(pizza.toString());

        pizza = pizzeria.orderPizza("vegetariana");
        System.out.println("Su orden es: " + pizza.getNombre());
        System.out.println(pizza.toString());
    }
}