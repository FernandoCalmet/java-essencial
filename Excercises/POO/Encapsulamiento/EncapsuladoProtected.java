package Excercises.POO.Encapsulamiento;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
/* Private : Acceso para las clases del paquete */
public class EncapsuladoProtected {

    public static void main(String[] args) {
        Figura figura = new Figura();
        System.out.println(figura.reporte());
    }

}

class Figura {
    protected int x;
    protected int y;

    protected Figura() {
        this.x = 5;
        this.y = 10;
    }

    protected String reporte() {
        return "X = " + x + "\nY = " + y;
    }
}
