package Excercises.POO.Figuras3D.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Figuras {

    protected double lado;
    protected double radio;
    protected double altura;

    protected double getRadio() {
        return this.radio;
    }

    protected void setRadio(double r) {
        this.radio = r;
    }

    protected abstract double getArea();

    protected abstract double getVolumen();

    @Override
    public abstract String toString();
}