package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaFactoryMethod {
    public static void main(String[] args) {
        Pizzeria pizzaDeLima = new LimaPizzeria();
        Pizzeria pizzaDePuno = new PunoPizzeria();

        Pizza pizzaLimaQueso = pizzaDeLima.orderPizza("queso");
        System.out.println("Juan ordeno una " + pizzaLimaQueso.getNombre() + "\n");

        Pizza pizzaPunoQueso = pizzaDePuno.orderPizza("queso");
        System.out.println("Jose ordeno una " + pizzaPunoQueso.getNombre() + "\n");

        Pizza pizzaLimaAlmeja = pizzaDeLima.orderPizza("almejas");
        System.out.println("Juan ordeno una " + pizzaLimaAlmeja.getNombre() + "\n");

        Pizza pizzaPunoAlmeja = pizzaDePuno.orderPizza("almejas");
        System.out.println("Jose ordeno una " + pizzaPunoAlmeja.getNombre() + "\n");

        Pizza pizzaLimaPepperoni = pizzaDeLima.orderPizza("pepperoni");
        System.out.println("Juan ordeno una " + pizzaLimaPepperoni.getNombre() + "\n");

        Pizza pizzaPunoPepperoni = pizzaDePuno.orderPizza("pepperoni");
        System.out.println("Jose ordeno una " + pizzaPunoPepperoni.getNombre() + "\n");

        Pizza pizzaLimaVegetariana = pizzaDeLima.orderPizza("vegetariana");
        System.out.println("Juan ordeno una " + pizzaLimaVegetariana.getNombre() + "\n");

        Pizza pizzaPunoVegetariana = pizzaDePuno.orderPizza("vegetariana");
        System.out.println("Jose ordeno una " + pizzaPunoVegetariana.getNombre() + "\n");
    }
}