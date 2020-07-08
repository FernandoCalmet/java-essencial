package ListasEnlazadas;

import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        Lista lista = new Lista();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista\n2. Mostrar los datos de la lista\n3. Salir"));
                switch (opcion) {
                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el elemento: ",
                                    "Insertando al inicio", 3));
                            lista.agregarNodoInicio(elemento);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        lista.mostrarLista();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } while (opcion != 3);
    }
}