package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaDeAlmeja extends Pizza {
    public PunoPizzaDeAlmeja() {
        this.nombre = "Pizza de Almejas Puneña";
        this.masa = "Masa de corteza extra gruesa";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso mozzarela aplastada");
        this.adicionales.add("Almejas frescas");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en rebanadas cuadradas");
    }
}