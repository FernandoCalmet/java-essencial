package Logica;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Docente extends Trabajador {
    private String tipo;
    private String nombre;
    private String dni;
    private String dptoAcademico;

    public Docente(String tipo, String nombre, String dni, String dptoAcademico) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dni = dni;
        this.dptoAcademico = dptoAcademico;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDptoAcademico() {
        return dptoAcademico;
    }

    public void setDptoAcademico(String dptoAcademico) {
        this.dptoAcademico = dptoAcademico;
    }

    @Override
    public String toString() {
        return "\nTipo: " + getTipo() + "\nNombre: " + getNombre() + "\nDNI: " + getDni() + "\nDpto. Academico: "
                + getDptoAcademico() + "\nSalario: " + getSalario();
    }

    @Override
    public abstract double getSalario();
}
