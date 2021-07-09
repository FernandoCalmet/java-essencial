package Excercises.POO.UPAO.Figuras.Ejercicio4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cilindro extends Figuras {

    public Cilindro(double r, double h) {
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
    }

    protected double getAltura() {
        return this.altura;
    }

    protected void setAltura(double h) {
        this.altura = h;
    }

    @Override
    protected double getArea() {
        return 2 * Math.PI * getRadio() * (getAltura() + getRadio());
    }

    @Override
    protected double getVolumen() {
        return Math.PI * Math.pow(getRadio(), 2) * getAltura();
    }

    @Override
    public String toString() {
        return "CILINDRO: \nArea: " + getArea() + "\nVolumen: " + getVolumen();
    }
}