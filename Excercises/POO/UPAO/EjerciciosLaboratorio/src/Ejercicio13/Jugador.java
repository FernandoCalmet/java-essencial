package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio13;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Jugador {

    private String dni;
    private String nombre;
    private int dorsal;
    private String posicion;
    private String estado;

    public Jugador(String dni, String nombre, int dorsal, String posicion, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\n\nDNI: " + getDni() + "\nNombre: " + getNombre() + "\nDorsal: " + getDorsal() + "\nPosicion: "
                + getPosicion() + "\nEstado: " + getEstado();
    }
}