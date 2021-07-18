package Excercises.POO.UPAO.Productos;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Producto {
    private String color;
    private List<String> marcas = new ArrayList<String>();

    public Producto() {
    }

    public Producto(List<String> marcas, String color) {
        this.marcas = marcas;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setMarca(List<String> marcas) {
        this.marcas = marcas;
    }

    public List<String> getMarca() {
        return this.marcas;
    }

    @Override
    public String toString() {
        return "\nColor: " + getColor() + "\nMarcas: " + getMarca();
    }
}