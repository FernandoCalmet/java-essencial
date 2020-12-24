package Excercises.POO.RecomendacionProductos;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Recomendaciones {

    public Producto crearCervezaNegra() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Stella Aris");
        marca.add("Malta Polar");
        marca.add("Cuzquena");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Negra");

        return producto;
    }

    public Producto crearCervezaRubia() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Corona");
        marca.add("Heineken");
        marca.add("Pilsen");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Rubia");

        return producto;
    }

    public Producto crearCervezaRoja() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Red Luger");
        marca.add("Blue Moon");
        marca.add("Pilsen");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Roja");

        return producto;
    }

    public Producto crearRopaPantalon() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Pierre Cardin");
        marca.add("Polo");
        marca.add("Malabar");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Pantalon");

        return producto;
    }

    public Producto crearRopaCamisa() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Van Heusen");
        marca.add("University Club");
        marca.add("Givenchy");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Camisa");

        return producto;
    }

    public Producto crearRopaZapatos() {
        // Crear objeto producto
        Producto producto = new Producto();
        // Crear lista de marcas
        List<String> marca = new ArrayList<String>();
        marca.add("Calimod");
        marca.add("Rego");
        marca.add("Dauss");
        // Setear atributos al objeto
        producto.setMarca(marca);
        producto.setColor("Zapatos");

        return producto;
    }
}