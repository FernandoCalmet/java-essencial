package Excercises.POO.Abstractos.Abstracts;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EjemploEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente("Andres", "12341234");
        Empleado empleado2 = new Supervisor("Sofia", "43214321", "999888777");

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
    }
}

abstract class Empleado {
    public String nombre;
    public String dni;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return this.dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public abstract String toString();
}

class Gerente extends Empleado {
    public Gerente(String nombre, String dni) {
        super.nombre = nombre;
        super.dni = dni;
    }

    @Override
    public String toString() {
        return "\nGERENTE:\nNombre: " + super.nombre + "\nDNI: " + super.dni;
    }
}

class Supervisor extends Empleado {
    private String nroTelefono;

    public Supervisor(String nombre, String dni, String nroTelefono) {
        super.nombre = nombre;
        super.dni = dni;
        this.nroTelefono = nroTelefono;
    }

    public String getNroTelefono() {
        return this.nroTelefono;
    }

    public void setNroTelefono(String nro) {
        this.nroTelefono = nro;
    }

    @Override
    public String toString() {
        return "\nSUPERVISOR:\nNombre: " + super.nombre + "\nDNI: " + super.dni + "\nNro. Telefono: "
                + this.nroTelefono;
    }
}