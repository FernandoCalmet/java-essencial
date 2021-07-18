package Excercises.POO.UPAO.Universidad.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Universidad {
    private String nombre;
    private String ciudad;
    private ArrayList<Trabajador> trabajadores;

    public Universidad() {
    }

    public Universidad(String nombre, String ciudad, ArrayList<Trabajador> trabajadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.trabajadores = trabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void addTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public void removeTrabajador(Trabajador trabajador) {
        trabajadores.remove(trabajador);
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre='" + nombre + '\'' + ", ciudad='" + ciudad + '\'' + ", trabajadores="
                + trabajadores + '}';
    }
}
