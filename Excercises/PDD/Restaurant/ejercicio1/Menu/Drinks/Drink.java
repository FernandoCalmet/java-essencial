package Restaurant.ejercicio1.Menu.Drinks;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Drink {
    protected String description;
    protected String size;

    public String getDescription() {
        return this.description;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        if (size.toLowerCase() == "single") {
            this.size = "Single ";
        } else if (size.toLowerCase() == "familiar") {
            this.size = "Jug of ";
        } else {
            this.size = null;
            System.out.println("Sorry there is no such drink size.");
            System.exit(0);
        }
    }

    public double getSizeCost() {
        double result = 0;
        switch (this.size.toLowerCase()) {
            case "single":
                result = 3;
                break;
            case "familiar":
                result = 9.50;
                break;
        }
        return result;
    }

    public abstract double getCost();
}