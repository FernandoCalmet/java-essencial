package Excercises.POO.Herencia.Figuras;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(int x, int y, double largo, double ancho) {
        super(x, y);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return "\nX: " + super.getX() + "\nY: " + super.getY() + "\nAncho: " + ancho + "\nLargo: " + largo;
    }
}
