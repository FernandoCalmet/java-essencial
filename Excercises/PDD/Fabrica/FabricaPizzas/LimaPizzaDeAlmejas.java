package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaDeAlmejas extends Pizza {
    public LimaPizzaDeAlmejas() {
        this.nombre = "Pizza de Almejas";
        this.masa = "Corteza delgada";
        this.salsa = "Salsa de ajo";
        this.adicionales.add("Queso Parmesano");
        this.adicionales.add("Almejas");
    }
}