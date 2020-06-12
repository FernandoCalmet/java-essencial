package Caso2;

public class Chofer {

    private int dni;
    private String nombres;
    private String nroBrevete;

    public Chofer(int dni, String nombres, String nroBrevete) {
        this.dni = dni;
        this.nombres = nombres;
        this.nroBrevete = nroBrevete;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNroBrevete() {
        return nroBrevete;
    }

    public void setNroBrevete(String nroBrevete) {
        this.nroBrevete = nroBrevete;
    }

    @Override
    public String toString() {
        return "Chofer: " + "\nDNI: " + getDni() + "\nNombres: " + getNombres() + "\nNro. de Brevete: "
                + getNroBrevete();
    }
}
