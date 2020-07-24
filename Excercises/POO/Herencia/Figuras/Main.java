package Herencia.Figuras;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de X"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de Y"));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor del Radio"));

        Circulo circulo1 = new Circulo(x, y, radio);
        JOptionPane.showMessageDialog(null, "\nInformacion del Circulo " + circulo1.toString());
        JOptionPane.showMessageDialog(null,
                "\nArea: " + circulo1.calcularArea() + "\nPerimetro: " + circulo1.calcularPerimetro());

        Rectangulo rectangulo1 = new Rectangulo(x, y, radio, radio);
        JOptionPane.showMessageDialog(null, "\nInformacion del Rectangulo " + rectangulo1.toString());
        JOptionPane.showMessageDialog(null,
                "\nArea: " + rectangulo1.calcularArea() + "\nPerimetro: " + rectangulo1.calcularPerimetro());

    }

}
