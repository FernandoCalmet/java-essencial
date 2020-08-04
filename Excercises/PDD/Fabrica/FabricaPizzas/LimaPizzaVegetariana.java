package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaVegetariana extends Pizza {
    public LimaPizzaVegetariana() {
        this.nombre = "Pizza Vegetariana";
        this.masa = "Corteza delgada";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Mozzarella rallada");
        this.adicionales.add("Cebolla picada");
        this.adicionales.add("Rodajas redondas de champiñones");
        this.adicionales.add("Rodajas redondas de pimiento rojo");
        this.adicionales.add("Aceitunas");
    }
}