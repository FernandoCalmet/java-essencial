package Excercises.POO.TrabajadoresUPAO.Logica;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DocenteTiempoCompleto extends Docente {
    private double sueldoBasico;

    public DocenteTiempoCompleto(String tipo, String nombre, String dni, String dptoAcademico, double sueldoBasico) {
        super(tipo, nombre, dni, dptoAcademico);
        this.sueldoBasico = sueldoBasico;
    }

    protected double getSueldoBasico() {
        return sueldoBasico;
    }

    protected void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario() {
        return getSueldoBasico() - ((getSueldoBasico() * 15) / 100);
    }
}
