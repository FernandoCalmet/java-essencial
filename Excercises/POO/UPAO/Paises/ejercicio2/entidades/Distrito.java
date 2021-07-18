package Excercises.POO.UPAO.Paises.ejercicio2.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Distrito {
    private String nombre;
    private String alcalde;

    public Distrito() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    @Override
    public String toString() {
        return "Distrito{" + "nombre='" + nombre + '\'' + ", alcalde='" + alcalde + '\'' + '}';
    }
}
