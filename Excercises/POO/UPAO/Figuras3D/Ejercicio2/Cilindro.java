package Excercises.POO.UPAO.Figuras3D.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cilindro extends Figura3D {

    private double h;

    public Cilindro(String tipo, int x, int y, int z, double h) {
        super(tipo, x, y, z, h);
        this.h = h;
    }

    protected double getH() {
        return this.h;
    }

    protected void setH(double h) {
        this.h = h;
    }

    @Override
    protected double calcularArea() {
        return 2 * Math.PI * getRadio() * (getH() + getRadio());
    }

    @Override
    protected double calcularVolumen() {
        return Math.PI * Math.pow(getRadio(), 2) * getH();
    }

    @Override
    public String toString() {
        return "\n" + getTipo() + ": \nArea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }
}
