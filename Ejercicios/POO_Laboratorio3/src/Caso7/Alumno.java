package Caso7;

public class Alumno {

    private String nombres;

    public Alumno(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombres();
    }
}