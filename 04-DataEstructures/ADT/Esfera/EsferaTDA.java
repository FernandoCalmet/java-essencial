package Esfera;

public class EsferaTDA {
    private double radio;

    public EsferaTDA(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }

    public double getRadio() {
        return this.radio;
    }

    public double getDiametro() {
        return (this.radio * 2);
    }

    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }

    public double getArea() {
        return (4 * Math.PI * Math.pow(getRadio(), 2));
    }

    public double getVolumen() {
        return (4 * Math.PI * Math.pow(getRadio(), 3) / 3);
    }
}