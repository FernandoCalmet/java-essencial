package JOptionPaneClass;

import javax.swing.*;

public class ShowInputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String age = JOptionPane.showInputDialog("Enter your age: ");

        int parseAge = Integer.parseInt(age);

        System.out.println("Hi " + nombre + ", next year you will be " + (parseAge + 1));
    }
}
