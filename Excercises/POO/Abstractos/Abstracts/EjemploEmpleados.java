package Abstractos.Abstracts;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EjemploEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        empleado1.setNombre("Fernando");
        empleado1.setDNI("12345678");
        Empleado empleado2 = new Supervisor();
        empleado2.setNombre("Andres");
        empleado2.setDNI("87654321");

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
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getDNI() {
        return super.getDNI();
    }

    public void setDNI(String dni) {
        super.setDNI(dni);
    }

    @Override
    public String toString() {
        return "\nGERENTE:\nNombre: " + super.getNombre() + "\nDNI: " + super.getDNI();
    }
}

class Supervisor extends Empleado {
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getDNI() {
        return super.getDNI();
    }

    public void setDNI(String dni) {
        super.setDNI(dni);
    }

    @Override
    public String toString() {
        return "\nSUPERVISOR:\nNombre: " + super.getNombre() + "\nDNI: " + super.getDNI();
    }
}