package Excercises.POO.UPAO.Figuras.Ejercicio6;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cono extends Figura3D {

    private double h;

    public Cono(String tipo, int x, int y, int z, double h) {
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
        return Math.PI * getRadio() * getZ();
    }

    @Override
    protected double calcularVolumen() {
        return (Math.PI * Math.pow(getRadio(), 2) * getH()) / 3;
    }

    @Override
    public String toString() {
        return "\n" + getTipo() + " \nArea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }
}
