package Restaurant.ejercicio1;
/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Cafe {
    protected String description = "Aromatic drink.";
    protected double costo;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return this.costo;
    }

    public void setCost(double price) {
        this.costo = price;
    }
}