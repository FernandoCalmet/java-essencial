package Excercises.POO.UPAO.Cafeteria;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cafetera {
    private int capacMax;
    private int cantActual;

    public Cafetera() {
        this.capacMax = 1000;
        this.cantActual = 0;
    }

    public Cafetera(int capacMax) {
        this.capacMax = capacMax;
        this.cantActual = capacMax;
    }

    public Cafetera(int capacMax, int cantActual) {
        if (cantActual > capacMax) {
            this.capacMax = capacMax;
            this.cantActual = capacMax;
        } else {
            this.capacMax = capacMax;
            this.cantActual = cantActual;
        }
    }

    public void llenarCafetera() {
        this.cantActual = this.capacMax;
    }

    public void servirTaza(int cantidad) {
        if (this.cantActual < cantidad)
            System.out.println("No alcanza!");
        else
            this.cantActual = this.cantActual - cantidad;
    }

    public void vaciarCafetera() {
        this.cantActual = 0;
    }

    public void agregarCafe(int cantidad) {
        this.cantActual = +cantidad;
    }

    @Override
    public String toString() {
        return "Cantidad actual: " + getCantActual() + "\nCapacidad maxima: " + getCapacMax();
    }

    public int getCapacMax() {
        return capacMax;
    }

    public void setCapacMax(int capacMax) {
        this.capacMax = capacMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
}
