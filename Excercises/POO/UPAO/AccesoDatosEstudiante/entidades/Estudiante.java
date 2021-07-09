package Excercises.POO.UPAO.AccesoDatosEstudiante.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Estudiante {
    // Variables instancia
    private int codigo;
    private String id;
    private String nombres;

    // Variable de referencia
    private Carrera car;

    // Constructor vacio
    public Estudiante() {
    }

    // Constructor con parametros
    public Estudiante(String id, String nombres, Carrera car) {
        this.id = id;
        this.nombres = nombres;
        this.car = car;
    }

    // Metodos get y set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Carrera getCar() {
        return car;
    }

    public void setCar(Carrera car) {
        this.car = car;
    }

    // Reporte
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", id=" + id + ", nombres=" + nombres + ", car=" + car + '}';
    }
}
