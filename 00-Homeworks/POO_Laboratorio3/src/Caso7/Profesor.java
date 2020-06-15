package Caso7;

public class Profesor {

    private String nombres;
    private String dni;

    public Profesor(String nombres, String dni) {
        this.nombres = nombres;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\nNombres: " + getNombres() + "\nDNI: " + getDni();
    }
}