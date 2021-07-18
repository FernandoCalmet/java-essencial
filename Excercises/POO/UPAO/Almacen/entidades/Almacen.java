package Excercises.POO.UPAO.Almacen.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Almacen {
    private String nombre;
    private String ubicacion;
    private ArrayList<Producto> productos;

    public Almacen() {
    }

    public Almacen(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
