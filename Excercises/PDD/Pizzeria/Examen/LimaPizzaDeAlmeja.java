package Excercises.PDD.Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaDeAlmeja extends Pizza {
    public LimaPizzaDeAlmeja() {
        this.nombre = "Pizza de Almejas Limeña";
        this.masa = "Corteza de Masa delgada";
        this.salsa = "Salsa Marinara";
        this.adicionales.add("Queso Reggiano gratinado");
        this.adicionales.add("Almejas frescas de puerto");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en rodajas diagonales");
    }
}