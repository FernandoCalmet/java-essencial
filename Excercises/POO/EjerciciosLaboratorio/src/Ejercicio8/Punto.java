package Ejercicio8;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Punto {
    private double coordX;
    private double coordY;

    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Punto{" + "x = " + getCoordX() + ", y = " + getCoordY() + "}";
    }

    public void trasladar(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
}
