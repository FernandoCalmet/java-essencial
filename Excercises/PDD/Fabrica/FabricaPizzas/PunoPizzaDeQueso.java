package Excercises.PDD.Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaDeQueso extends Pizza {
    public PunoPizzaDeQueso() {
        this.nombre = "Pizza de Queso";
        this.masa = "Corteza regular";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso rallado Mozzarella");
        this.adicionales.add("Queso Parmesano");
    }
}