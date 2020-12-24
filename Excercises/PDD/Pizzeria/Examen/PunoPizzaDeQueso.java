package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaDeQueso extends Pizza {
    public PunoPizzaDeQueso() {
        this.nombre = "Pizza de Queso Puneño";
        this.masa = "Masa de corteza extra gruesa";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso Mozzarella aplastado");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en rebanadas cuadradas");
    }
}