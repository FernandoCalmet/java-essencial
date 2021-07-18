package Excercises.POO.UPAO.Paises.ejercicio2.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Provincia {
    private String nombre;
    private int poblacion;
    private ArrayList<Distrito> distritos;

    public Provincia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(ArrayList<Distrito> distritos) {
        this.distritos = distritos;
    }

    @Override
    public String toString() {
        return "Provincia: " + nombre + "\nPoblacion: " + poblacion + "\nDistritos: " + distritos;
    }
}
