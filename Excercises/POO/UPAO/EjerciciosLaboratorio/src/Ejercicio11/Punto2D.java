package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio11;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Punto2D {

    private double coordX;
    private double coordY;

    public Punto2D() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Punto2D(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Punto{" + "x = " + getCoordX() + ", y = " + getCoordY() + "}";
    }

    public double calcularDistancia(Punto2D punto) {
        return Math.sqrt(Math.pow((punto.coordX - this.coordX), 2) + Math.pow((punto.coordY - this.coordY), 2));
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
