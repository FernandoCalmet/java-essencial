package Excercises.POO.Encapsulamiento;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import javax.swing.JOptionPane;

public class PasarParametros {
    public static void main(String[] args) {
        Colores color1 = new Colores();
        color1.setColor("Rojo", "Encendido");
        JOptionPane.showMessageDialog(null, color1.getColor());

        Colores color2 = new Colores();
        color2.setColor("Azul", "Claro");
        JOptionPane.showMessageDialog(null, color2.getColor());

        Colores color3 = new Colores();
        color3.setColor("Verde", "Oscuro");
        JOptionPane.showMessageDialog(null, color3.getColor());
    }
}

class Colores {
    String nombre;
    String tono;

    public Colores() {
        nombre = "No hay ningun color seleccionado.";
        tono = "No hay ningun tono seleccionado.";
    }

    public void setColor(String nombre, String tono) {
        this.nombre = nombre;
        this.tono = tono;
    }

    public String getColor() {
        return "El color seleccionado es " + nombre + " y su tono es " + tono;
    }
}
