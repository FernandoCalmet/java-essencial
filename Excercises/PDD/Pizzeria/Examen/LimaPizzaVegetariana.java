package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaVegetariana extends Pizza {
    public LimaPizzaVegetariana() {
        this.nombre = "Pizza Vegetariana al estilo limeño";
        this.masa = "Masa de corteza delgada";
        this.salsa = "Salsa Marinara";
        this.adicionales.add("Queso Reggiano gratinado");
        this.adicionales.add("Cebolla");
        this.adicionales.add("Champiñones");
        this.adicionales.add("Pimenton amarillo");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en rodajas diagonales");
    }
}