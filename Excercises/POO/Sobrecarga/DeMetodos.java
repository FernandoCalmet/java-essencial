package Sobrecarga;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DeMetodos {

    public static void main(String[] args) {

        boolean estado1 = true;
        boolean estado2 = false;
        String color = "azul";

        ColorLed led1 = new ColorLed(estado1);
        ColorLed led2 = new ColorLed(estado2);

        led1.cambiarColor(color);
        led2.cambiarColor();

        System.out.println(led1.mostrarEstado());
        System.out.println(led2.mostrarEstado());
    }

}

class ColorLed {

    private boolean estado;
    private String color;

    public ColorLed(boolean estado) {
        this.estado = estado;
    }

    public String cambiarColor() {
        return "No se puede cambiar de color del LED porque esta apagado.";
    }

    public String cambiarColor(String color) {
        if (estado) {
            if (color.compareTo("rojo") == 0) {
                this.color = "rojo";
                return color;
            }
            if (color.compareTo("azul") == 0) {
                this.color = "azul";
                return color;
            }
            if (color.compareTo("verde") == 0) {
                this.color = "verde";
                return color;
            }
        } else {
            System.out.println("El led esta apagado.");
        }
        return "Ese color no esta disponible.";
    }

    public String mostrarEstado() {
        if (estado == true) {
            return "El LED esta encendido y su luz es de color " + color;
        } else {
            return "El LED esta apagado.";
        }
    }

}
