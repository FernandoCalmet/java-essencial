package Logica;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Trabajador {
    public abstract void setTipo(String tipo);

    public abstract String getTipo();

    public abstract void setNombre(String nombre);

    public abstract String getNombre();

    public abstract void setDni(String dni);

    public abstract String getDni();

    public abstract double getSalario();
}