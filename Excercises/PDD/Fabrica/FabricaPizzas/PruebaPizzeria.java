package Excercises.PDD.Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaPizzeria {
    public static void main(String[] args) {
        Pizzeria lima = new LimaPizzeria();
        Pizzeria puno = new PunoPizzeria();

        IPizza pizzaLimaQueso = lima.ordenarPizza("queso");
        System.out.println("Orden completada de " + pizzaLimaQueso.getNombre());
        System.out.println();
        IPizza pizzaLimaVegetariana = lima.ordenarPizza("vegetariana");
        System.out.println("Orden completada de " + pizzaLimaVegetariana.getNombre());
        System.out.println();
        IPizza pizzaLimaAlmejas = lima.ordenarPizza("almejas");
        System.out.println("Orden completada de " + pizzaLimaAlmejas.getNombre());
        System.out.println();
        IPizza pizzaLimaPepperoni = lima.ordenarPizza("pepperoni");
        System.out.println("Orden completada de " + pizzaLimaPepperoni.getNombre());
        System.out.println();
        IPizza pizzaPunoQueso = puno.ordenarPizza("queso");
        System.out.println("Orden completada de " + pizzaPunoQueso.getNombre());
        System.out.println();
        IPizza pizzaPunoVegetariana = puno.ordenarPizza("vegetariana");
        System.out.println("Orden completada de " + pizzaPunoVegetariana.getNombre());
        System.out.println();
        IPizza pizzaPunoAlmejas = puno.ordenarPizza("almejas");
        System.out.println("Orden completada de " + pizzaPunoAlmejas.getNombre());
        System.out.println();
        IPizza pizzaPunoPepperoni = puno.ordenarPizza("pepperoni");
        System.out.println("Orden completada de " + pizzaPunoPepperoni.getNombre());
    }
}