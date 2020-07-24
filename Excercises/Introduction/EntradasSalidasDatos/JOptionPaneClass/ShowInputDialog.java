package EntradasSalidasDatos.JOptionPaneClass;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import javax.swing.*;

public class ShowInputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String age = JOptionPane.showInputDialog("Enter your age: ");

        int parseAge = Integer.parseInt(age);

        System.out.println("Hi " + name + ", next year you will be " + (parseAge + 1));
    }
}
