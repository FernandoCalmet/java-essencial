package Excercises.POO.Encapsulamiento;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class ConstruccionObjetos {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingresar tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        Usuario usuario = new Usuario(nombre, edad);
        JOptionPane.showMessageDialog(null, usuario.getDatos());

        Usuario usuario2 = new Usuario("Fernando", 29);
        JOptionPane.showMessageDialog(null, usuario2.getDatos());
    }
}

class Usuario {
    private String nombre;
    private int edad;
    private Date registro;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        GregorianCalendar calendario = new GregorianCalendar(2019, 2, 5);
        registro = calendario.getTime();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDatos() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nFecha de registro: " + registro;
    }
}
