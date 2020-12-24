package Excercises.PDD.Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizza {
    protected String descripcion;
    protected String size;

    public String getDescripcion() {
        return this.descripcion + ", Tamaño " + this.size;
    }

    public abstract double getCosto();

    public double getSize() {
        double result = 0;
        switch (this.size.toLowerCase()) {
            case "personal":
                this.size = "Personal";
                result = 10;
                break;
            case "grande":
                this.size = "Grande";
                result = 20;
                break;
            case "familiar":
                this.size = "Familiar";
                result = 35;
                break;
        }
        return result;
    }
}