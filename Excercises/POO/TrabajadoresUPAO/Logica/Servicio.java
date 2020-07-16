package Logica;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Servicio extends Trabajador {
    private String tipo;
    private String nombre;
    private String dni;
    private String oficina;
    private double sueldoBasico;

    public Servicio(String tipo, String nombre, String dni, String oficina, double sueldoBasico) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dni = dni;
        this.oficina = oficina;
        this.sueldoBasico = sueldoBasico;
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

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario() {
        return this.sueldoBasico;
    }

    @Override
    public String toString() {
        return "\nTipo: " + getTipo() + "\nNombre: " + getNombre() + "\nDNI: " + getDni() + "\nOficina: " + getOficina()
                + "\nSalario: " + getSalario();
    }
}
