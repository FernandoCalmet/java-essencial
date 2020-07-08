/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Cono extends Figuras {

    private double generatriz;

    public Cono(double r, double h, double g) {
        if (r > 0) {
            this.radio = r;
        } else {
            this.radio = 0.0;
        }
        if (h > 0) {
            this.altura = h;
        } else {
            this.altura = 0.0;
        }
        if (g > 0) {
            this.generatriz = h;
        } else {
            this.generatriz = 0.0;
        }
    }

    protected double getGeneratriz() {
        return this.generatriz;
    }

    protected void setGeneratriz(double g) {
        this.generatriz = g;
    }

    protected double getAltura() {
        return this.altura;
    }

    protected void setAltura(double h) {
        this.altura = h;
    }

    @Override
    protected double getArea() {
        return Math.PI * getRadio() * getGeneratriz();
    }

    @Override
    protected double getVolumen() {
        return (Math.PI * Math.pow(getRadio(), 2) * getAltura()) / 3;
    }

    @Override
    public String toString() {
        return "CONO: \nArea: " + getArea() + "\nVolumen: " + getVolumen();
    }
}