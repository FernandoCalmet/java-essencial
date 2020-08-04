package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaVegetariana extends Pizza {
    public PunoPizzaVegetariana() {
        this.nombre = "Pizza Vegetariana";
        this.masa = "Corteza delgada";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Parmesano rallada");
        this.adicionales.add("Cebolla picada");
        this.adicionales.add("Rodajas redondas de champiñones");
        this.adicionales.add("Rodajas redondas de pimiento rojo");
        this.adicionales.add("Rodajas de cebolla");
    }
}