package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaDeQueso extends Pizza {
    public LimaPizzaDeQueso() {
        this.nombre = "Pizza Limeña de Queso";
        this.masa = "Corteza de masa delgada";
        this.salsa = "Salsa Masrinara";
        this.adicionales.add("Queso Reggiano gratinado");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en rodajas diagonales");
    }
}