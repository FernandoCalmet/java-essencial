package Excercises.POO.Figuras3D.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Figura3D {

    private String tipo;
    private int x;
    private int y;
    private int z;
    private double radio;

    public Figura3D(String tipo, int x, int y, int z, double radio) {
        this.tipo = tipo;
        if (x > 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
        if (y > 0) {
            this.y = y;
        } else {
            this.y = 0;
        }
        if (z > 0) {
            this.z = z;
        } else {
            this.z = 0;
        }
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }

    protected abstract double calcularArea();

    protected abstract double calcularVolumen();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    protected double getRadio() {
        return this.radio;
    }

    protected void setRadio(double r) {
        this.radio = r;
    }

    @Override
    public abstract String toString();
}
