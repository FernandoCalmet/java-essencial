package VentaAutos;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Venta {
    public String marcaYModelo;
    public float precio;

    protected Venta(String m, float p) {
        this.marcaYModelo = m;
        this.precio = p;
    }

    protected abstract int getAnioDelModelo();

    public String getMarcaYModelo() {
        return this.marcaYModelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "\nMarca y Modelo: " + getMarcaYModelo() + "\nPrecio: " + getPrecio();
    }
}