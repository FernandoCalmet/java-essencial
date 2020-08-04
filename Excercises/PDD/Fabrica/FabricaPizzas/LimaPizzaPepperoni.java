package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaPepperoni extends Pizza {
    public LimaPizzaPepperoni() {
        this.nombre = "Pizza de Pepperoni";
        this.masa = "Corteza regular";
        this.salsa = "Salsa de barbacoa";
        this.adicionales.add("Rodajas de Pepperoni");
        this.adicionales.add("Queso Parmesano");
        this.adicionales.add("Rodajas de Ajo");
    }
}