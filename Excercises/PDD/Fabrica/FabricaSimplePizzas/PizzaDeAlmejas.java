package Excercises.PDD.Fabrica.FabricaSimplePizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaDeAlmejas extends Pizza {
    public PizzaDeAlmejas() {
        this.nombre = "Pizza de Almejas";
        this.masa = "Corteza delgada";
        this.salsa = "Salsa de ajo";
        this.adicionales.add("Queso Parmesano");
        this.adicionales.add("Almejas");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pieza en rebanadas triangulares " + this.nombre);
    }
}