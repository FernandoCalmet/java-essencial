package Excercises.POO.Herencia.Figuras;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Circulo extends Figura {

    private double radio;
    private final double PI = 3.1415;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.pow(radio, 2) * PI;
    }

    public double calcularPerimetro() {
        return PI * radio * 2;
    }

    @Override
    public String toString() {
        return "\nX: " + super.getX() + "\nY: " + super.getY() + "\nRadio " + radio;
    }

}
