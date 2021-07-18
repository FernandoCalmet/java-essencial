package Excercises.POO.UPAO.Universidad.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class TrabajadorAdministrativo extends Trabajador {
    private String id;
    private String nombres;
    private String escuela;
    private String labor;
    private String tipo;

    public TrabajadorAdministrativo() {
    }

    public TrabajadorAdministrativo(String id, String nombres, String escuela, String labor, String tipo,
            double sueldo) {
        this.id = id;
        this.nombres = nombres;
        this.escuela = escuela;
        this.labor = labor;
        this.tipo = tipo;
        super.setSueldo(sueldo);
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TrabajadorAdministrativo{" + "id=" + id + ", nombres=" + nombres + ", escuela=" + escuela + ", labor="
                + labor + ", tipo=" + tipo + ", sueldo=" + super.getSueldo() + '}';
    }
}
