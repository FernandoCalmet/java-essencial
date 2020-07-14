package VentaAutos;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    public ArrayList<Venta> ventas = new ArrayList<>();

    public Cliente(String no, String di, String te) {
        this.nombre = no;
        this.direccion = di;
        this.telefono = te;
    }

    protected ArrayList<Venta> getVentas() {
        return this.ventas;
    }

    protected void agregarVenta(Venta v) {
        this.ventas.add(v);
    }

    @Override
    public String toString() {
        return "\nNombre: " + this.nombre + "\nDireccion: " + this.direccion + "\nTelefono: " + this.telefono;
    }
}