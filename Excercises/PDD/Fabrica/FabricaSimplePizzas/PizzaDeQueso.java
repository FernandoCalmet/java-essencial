package Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaDeQueso extends Pizza {
    public PizzaDeQueso() {
        this.nombre = "Pizza de Queso";
        this.masa = "Masa de corteza delgada";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso Mozarella fresca");
        this.adicionales.add("Queso parmesano");
    }
}