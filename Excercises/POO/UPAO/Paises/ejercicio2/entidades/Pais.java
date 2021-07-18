package Excercises.POO.UPAO.Paises.ejercicio2.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pais {
    private String nombre;
    private int poblacion;
    private String moneda;
    private String capital;
    private ArrayList<Provincia> provincias;

    public Pais() {
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public String toString() {
        return "País{" + "nombre='" + nombre + '\'' + ", poblacion=" + poblacion + ", moneda='" + moneda + '\''
                + ", capital='" + capital + '\'' + ", provincias=" + provincias + '}';
    }
}
