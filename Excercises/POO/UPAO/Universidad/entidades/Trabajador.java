package Excercises.POO.UPAO.Universidad.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Trabajador {
    private double sueldo;
    private double descuento; // AFP
    private ArrayList<TrabajadorAdministrativo> administrativos;
    private ArrayList<TrabajadorDocente> docentes;
    private TrabajadorDirector director;

    public Trabajador() {
    }

    public Trabajador(double sueldo, double descuento, ArrayList<TrabajadorAdministrativo> administrativos,
            ArrayList<TrabajadorDocente> docentes, TrabajadorDirector director) {
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.administrativos = administrativos;
        this.docentes = docentes;
        this.director = director;
    }

    public abstract String getId();

    public abstract String getNombres();

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public ArrayList<TrabajadorAdministrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(ArrayList<TrabajadorAdministrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public ArrayList<TrabajadorDocente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<TrabajadorDocente> docentes) {
        this.docentes = docentes;
    }

    public TrabajadorDirector getDirector() {
        return director;
    }

    public void setDirector(TrabajadorDirector director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "descuento=" + descuento + ", administrativos=" + administrativos + ", docentes="
                + docentes + ", director=" + director + '}';
    }
}
