package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaDePepperoni extends Pizza {
    public PunoPizzaDePepperoni() {
        this.nombre = "Pizza de Pepperoni Puneña";
        this.masa = "Masa de corteza extra gruesa";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso Mozzarela aplastada");
        this.adicionales.add("Aceitunas Negras");
        this.adicionales.add("Espinaca");
        this.adicionales.add("Berenjena");
        this.adicionales.add("Pepperoni en rodajas");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en rebanadas cuadradas");
    }
}