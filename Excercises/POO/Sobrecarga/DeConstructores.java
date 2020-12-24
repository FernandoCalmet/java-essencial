package Excercises.POO.Sobrecarga;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DeConstructores {
    public static void main(String[] args) {
        Vehiculos descripcion1 = new Vehiculos("Ferrari");
        Vehiculos descripcion2 = new Vehiculos("Ferrari", "Rojo");
        Vehiculos descripcion3 = new Vehiculos("Ferrari", "Rojo", 4);

        System.out.println(descripcion1.getNombre());
        System.out.println(descripcion2.getNombre() + " " + descripcion2.getColor());
        System.out.println(descripcion3.getNombre() + " " + descripcion3.getColor() + " " + descripcion3.getRuedas());
    }
}

class Vehiculos {
    private String nombre;
    private String color;
    private int ruedas;

    public Vehiculos(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculos(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Vehiculos(String nombre, String color, int ruedas) {
        this.nombre = nombre;
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }
}
