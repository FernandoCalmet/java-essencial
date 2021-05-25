package Excercises.POO.Figuras3D.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Esfera extends Figura3D {

    public Esfera(String tipo, int x, int y, int z, double h) {
        super(tipo, x, y, z, h);
    }

    protected double getCircunferencia() {
        return (Math.PI * getDiametro());
    }

    protected double getDiametro() {
        return (getRadio() * 2);
    }

    @Override
    protected double calcularArea() {
        return (4 * Math.PI * Math.pow(getRadio(), 2));
    }

    @Override
    protected double calcularVolumen() {
        return (4 * Math.PI * Math.pow(getRadio(), 3) / 3);
    }

    @Override
    public String toString() {
        return "\n" + getTipo() + " \nCircunferencia: " + getCircunferencia() + "\nDiametro: " + getDiametro()
                + "\nArea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }
}
