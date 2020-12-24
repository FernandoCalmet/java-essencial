package Excercises.PDD.VentaAutos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class VentaAutoUsado extends Venta {
    private int anioDelModelo;
    private String descripcion;

    protected VentaAutoUsado(String mm, float p, int am, String d) {
        super(mm, p);
        this.anioDelModelo = am;
        this.descripcion = d;
    }

    @Override
    protected int getAnioDelModelo() {
        return this.anioDelModelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDescripcion: " + this.descripcion;
    }
}