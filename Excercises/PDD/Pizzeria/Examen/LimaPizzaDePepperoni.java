package Pizzeria.Examen;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LimaPizzaDePepperoni extends Pizza {
    public LimaPizzaDePepperoni() {
        this.nombre = "Pizza Pepperoni Limeña";
        this.masa = "Masa de corteza gruesa";
        this.salsa = "Salsa Marinara";
        this.adicionales.add("Queso Reggiano gratinado");
        this.adicionales.add("Pepperoni en rodajas");
        this.adicionales.add("Ajos");
        this.adicionales.add("Cebolla");
        this.adicionales.add("Champiñones");
        this.adicionales.add("Pimenton Rojo");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la Pizza en rodajas diagonales");
    }
}