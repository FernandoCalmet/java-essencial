package Excercises.POO.UPAO.AccesoDatosEstudiante.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Carrera {
    // Variables instancia
    private int codigo;
    private String nombre;

    // Constructor vacio
    public Carrera() {
    }

    // Constructor con parametros
    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Metodos get y set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Reporte
    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}