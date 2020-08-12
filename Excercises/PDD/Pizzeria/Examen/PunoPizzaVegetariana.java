package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PunoPizzaVegetariana extends Pizza {
    public PunoPizzaVegetariana() {
        this.nombre = "Pizza Vegetariana de Puno";
        this.masa = "Masa de corteza gruesa";
        this.salsa = "Salsa de tomate";
        this.adicionales.add("Queso mozzarela aplastado");
        this.adicionales.add("Aceitunas negras");
        this.adicionales.add("Espinaca");
        this.adicionales.add("Berenjena");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en rebanadas cuadradas");
    }
}