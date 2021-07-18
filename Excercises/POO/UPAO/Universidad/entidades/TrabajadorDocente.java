package Excercises.POO.UPAO.Universidad.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class TrabajadorDocente extends Trabajador {
    private String id;
    private String nombres;
    private int edad;
    private String especialidad;
    private int nroHorasSemanal;
    private double pagoHora;
    private double pagoExtra; // por asesor, buen docente, etc
    private ArrayList<DocenteContratado> contratados;
    private ArrayList<DocenteNombrado> nombrados;

    public TrabajadorDocente() {
    }

    public TrabajadorDocente(String id, String nombres, int edad, String especialidad, int nroHorasSemanal,
            double pagoHora, double pagoExtra, double sueldo) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.especialidad = especialidad;
        this.nroHorasSemanal = nroHorasSemanal;
        this.pagoHora = pagoHora;
        this.pagoExtra = pagoExtra;
        super.setSueldo(sueldo);
    }

    public TrabajadorDocente(String id, String nombres, int edad, String especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.especialidad = especialidad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNroHorasSemanal() {
        return nroHorasSemanal;
    }

    public void setNroHorasSemanal(int nroHorasSemanal) {
        this.nroHorasSemanal = nroHorasSemanal;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getPagoExtra() {
        return pagoExtra;
    }

    public void setPagoExtra(double pagoExtra) {
        this.pagoExtra = pagoExtra;
    }

    public ArrayList<DocenteContratado> getContratados() {
        return contratados;
    }

    public void setContratados(ArrayList<DocenteContratado> contratados) {
        this.contratados = contratados;
    }

    public ArrayList<DocenteNombrado> getNombrados() {
        return nombrados;
    }

    public void setNombrados(ArrayList<DocenteNombrado> nombrados) {
        this.nombrados = nombrados;
    }

    @Override
    public String toString() {
        return "TrabajadorDocente{" + "contratados=" + contratados + ", nombrados=" + nombrados + '}';
    }
}
