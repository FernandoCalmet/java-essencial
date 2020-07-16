/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cubo extends Figuras {

    public Cubo(double l) {
        if (l > 0) {
            this.lado = l;
        } else {
            this.lado = 0.0;
        }
    }

    protected double getLado() {
        return this.lado;
    }

    protected void setLado(double l) {
        this.lado = l;
    }

    @Override
    protected double getArea() {
        return 6 * Math.pow(getLado(), 2);
    }

    @Override
    protected double getVolumen() {
        return Math.pow(getLado(), 3);
    }

    @Override
    public String toString() {
        return "CUBO: \nArea: " + getArea() + "\nVolumen: " + getVolumen();
    }
}