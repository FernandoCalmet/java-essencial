package Excercises.PDD.Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana() {
        this.nombre = "Pizza Vegetariana";
        this.masa = "Masa de corteza regular";
        this.salsa = "Salsa roja de pizza";
        this.adicionales.add("Mozzarella triturada");
        this.adicionales.add("Parmesano gratinado");
        this.adicionales.add("Cebolla picada");
        this.adicionales.add("Champiñones picados");
        this.adicionales.add("Pimenton picado");
        this.adicionales.add("Aceitunas picadas");
    }
}