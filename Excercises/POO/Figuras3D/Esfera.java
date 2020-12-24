package Excercises.POO.Figuras3D;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Esfera extends Figuras {

    public Esfera(double r) {
        if (r > 0) {
            this.radio = r;
        } else {
            this.radio = 0.0;
        }
    }

    protected double getCircunferencia() {
        return (Math.PI * getDiametro());
    }

    protected double getDiametro() {
        return (this.radio * 2);
    }

    @Override
    protected double getArea() {
        return (4 * Math.PI * Math.pow(getRadio(), 2));
    }

    @Override
    protected double getVolumen() {
        return (4 * Math.PI * Math.pow(getRadio(), 3) / 3);
    }

    @Override
    public String toString() {
        return "ESFERA: \nCircunferencia: " + getCircunferencia() + "\nDiametro: " + getDiametro() + "\nArea: "
                + getArea() + "\nVolumen: " + getVolumen();
    }
}