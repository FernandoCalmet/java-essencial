package ClaseJOptionPane;

import javax.swing.*;

public class ShowInputDialog {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String edad = JOptionPane.showInputDialog("Ingresa tu edad");
        
        int parseEdad = Integer.parseInt(edad);
        
        System.out.println("Hola "+nombre+", el proximo año cumpliras "+(parseEdad+1));
        
    }
    
}
