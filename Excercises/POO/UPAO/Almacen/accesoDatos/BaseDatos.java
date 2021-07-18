package Excercises.POO.UPAO.Almacen.accesoDatos;

import java.util.ArrayList;

import Excercises.POO.UPAO.Almacen.entidades.Almacen;
import Excercises.POO.UPAO.Almacen.entidades.Producto;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BaseDatos {
    private Almacen almacen;
    private ArrayList<Producto> productos;

    public BaseDatos() {
        this.almacen = new Almacen();
        this.productos = new ArrayList<Producto>();
    }

    public void agregarAlmacen(String nombre, String ubicacion) {
        this.almacen.setNombre(nombre);
        this.almacen.setUbicacion(ubicacion);
    }

    public void agregarProducto(String codigo, String nombre, String categoria, double precio, int stock) {
        Producto producto = new Producto(codigo, nombre, categoria, precio, stock);
        this.productos.add(producto);
    }

    public String buscarProducto(String valor) {
        String busqueda = "";
        for (Producto producto : this.productos) {
            if (producto.getCodigo().equals(valor)) {
                busqueda = producto.toString();
            }
        }
        return busqueda;
    }

    public void modificarPrecioProducto(String codigo, double precio) {
        for (Producto producto : this.productos) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setPrecio(precio);
            }
        }
    }

    public void eliminarProducto(String codigo) {
        for (Producto producto : this.productos) {
            if (producto.getCodigo().equals(codigo)) {
                this.productos.remove(producto);
            }
        }
    }

    public String mostrarStockMinimoProductos() {
        String stockMinimo = "";
        for (Producto producto : this.productos) {
            if (producto.getStock() > 0 && producto.getStock() < 10) {
                stockMinimo = producto.getNombre();
            }
        }

        return stockMinimo;
    }

    public String mostrarProductosPorCategoria(String categoria) {
        String productosPorCategoria = "";
        for (Producto producto : this.productos) {
            if (producto.getCategoria().equals(categoria)) {
                productosPorCategoria += producto.toString() + "\n";
            }
        }

        return "Almacen{ " + "Nombre: " + almacen.getNombre() + " Ubicación: " + almacen.getUbicacion() + " [ "
                + productosPorCategoria + "] }";
    }
}
