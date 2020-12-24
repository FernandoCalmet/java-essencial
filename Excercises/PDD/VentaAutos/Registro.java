package Excercises.PDD.VentaAutos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class Registro {
    protected ArrayList<Cliente> clientes = new ArrayList<>();

    public int getNoDeClientes(int index) {
        return this.clientes.size();
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public ArrayList<Venta> getVenta(int index) {
        return this.clientes.get(index).getVentas();
    }

    public double getVentaTotal(int index) {
        int n = 0;
        int resultado = 0;
        while (this.clientes.get(index).ventas.size() != n) {
            resultado = resultado + (int) (this.clientes.get(index).ventas.get(n).precio);
            n = n + 1;
        }
        return resultado;
    }

    public double getEdadPromedio(int index) {
        int n = 0;
        int resultado = 0;
        while (this.clientes.get(index).ventas.size() != n) {
            resultado = resultado + (int) (this.clientes.get(index).ventas.get(n).getAnioDelModelo());
            n = n + 1;
        }
        resultado = resultado / this.clientes.get(index).ventas.size();
        return resultado;
    }

    public boolean ponerCliente(int index, Cliente cliente) {
        if (clientes.set(index, cliente) == null) {
            return false;
        } else {
            return true;
        }
    }

    public void nuevoCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void nuevaVenta(int index, Venta venta) {
        this.clientes.get(index).agregarVenta(venta);
    }
}