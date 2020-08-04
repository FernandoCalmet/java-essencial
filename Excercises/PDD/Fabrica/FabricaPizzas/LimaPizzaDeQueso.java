package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaDeQueso extends Pizza {
    public LimaPizzaDeQueso() {
        this.nombre = "Pizza de Queso";
        this.masa = "Corteza regular";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso Mozzarella");
        this.adicionales.add("Queso rallado Parmesano");
    }
}