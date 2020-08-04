package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaDeAlmejas extends Pizza {
    public PunoPizzaDeAlmejas() {
        this.nombre = "Pizza de Almejas";
        this.masa = "Corteza delgada";
        this.salsa = "Salsa de ajo";
        this.adicionales.add("Queso Parmesano");
        this.adicionales.add("Almejas");
    }

    @Override
    public void cortar(){
        System.out.println("Cortar la pieza en rebanadas triangulares " + this.nombre);
    }
}