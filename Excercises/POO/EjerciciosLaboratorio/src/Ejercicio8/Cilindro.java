package Excercises.POO.EjerciciosLaboratorio.src.Ejercicio8;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cilindro {
    private double altura;
    private Circulo base;

    public Cilindro(double altura, Circulo base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

    public double calcularSuperficie() {
        return 2 * Math.PI * base.getRadio() * (altura + base.getRadio());
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(base.getRadio(), 2) * altura;
    }

    public void trasladar(double coordX, double coordY) {
        this.base.trasladar(coordX, coordY);
    }

    @Override
    public String toString() {
        return "Cilindro:(Altura: " + getAltura() + ", Base: " + getBase() + ")";
    }
}
