package DinamicMemory;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arraylist {
    public static void main(String[] args) {
        String respuesta, palabras;
        ArrayList<String> lista = new ArrayList<String>();

        do {
            palabras = JOptionPane.showInputDialog(null, "Ingresar una palabra a la lista");
            lista.add(palabras);
            respuesta = JOptionPane.showInputDialog(null, "¿Deseas agregar otra palabra?");
            respuesta = respuesta.toLowerCase();
        } while (!respuesta.equals("no"));

        System.out.println("\nLista entera: " + lista);

        System.out.println("\nRecorrido de elemento por elemento: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}