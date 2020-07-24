package EjerciciosLaboratorio.src.Ejercicio8;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Circulo {
    private double radio;
    private Punto centro;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double calcularArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

    public void trasladar(double coordX, double coordY) {
        this.centro.setCoordX(coordX);
        this.centro.setCoordY(coordY);
    }

    @Override
    public String toString() {
        return "Circulo(" + this.centro.getCoordX() + "," + this.centro.getCoordY() + ")";
    }
}
