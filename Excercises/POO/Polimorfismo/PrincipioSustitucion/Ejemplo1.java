package Excercises.POO.Polimorfismo.PrincipioSustitucion;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejemplo1 {

    public static void main(String[] args) {

        Gerente jefe = new Gerente(1, "Señor gato", 0);
        jefe.setSueldo(5000);

        Empleado[] MisEmpleados = new Empleado[4];
        MisEmpleados[0] = new Empleado(2, "Fernando", 2000);
        MisEmpleados[1] = new Empleado(3, "Enki", 2000);
        MisEmpleados[2] = jefe;
        MisEmpleados[3] = new Empleado(4, "Stefani", 2000);

        for (Empleado lista : MisEmpleados) {
            JOptionPane.showMessageDialog(null,
                    "ID: " + lista.getId() + "\nNombre: " + lista.getNombre() + "\nSueldo: " + lista.getSueldo());
        }

    }

}

class Gerente extends Empleado {

    private int bonificacion;

    public Gerente(int id, String nombre, int sueldo) {
        super(id, nombre, sueldo);
    }

    public void setSueldo(int saldo) {
        bonificacion = saldo;
    }

    public int getSueldo() {
        int saldo = super.getSueldo();
        return saldo + bonificacion;
    }

}

class Empleado {

    private int id;
    private String nombre;
    private int sueldo;

    public Empleado(int id, String nombre, int sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

}