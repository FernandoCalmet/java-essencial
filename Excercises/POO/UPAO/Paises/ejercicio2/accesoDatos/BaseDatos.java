package Excercises.POO.UPAO.Paises.ejercicio2.accesoDatos;

import java.util.ArrayList;

import Excercises.POO.UPAO.Paises.ejercicio2.entidades.Distrito;
import Excercises.POO.UPAO.Paises.ejercicio2.entidades.Pais;
import Excercises.POO.UPAO.Paises.ejercicio2.entidades.Provincia;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BaseDatos {
    // Atributos
    static private Pais pais;
    static private ArrayList<Provincia> provincias;
    static private ArrayList<Distrito> distritos;

    // Constructor
    public BaseDatos() {
        pais = new Pais();
        provincias = new ArrayList<>();
        distritos = new ArrayList<>();
    }

    // Metodos publicos
    public void crearPais(String nombre, int poblacion, String moneda, String capital) {
        pais.setNombre(nombre);
        pais.setPoblacion(poblacion);
        pais.setMoneda(moneda);
        pais.setCapital(capital);
    }

    public void crearProvincia(String nombre, int poblacion) {
        Provincia provincia = new Provincia();
        provincia.setNombre(nombre);
        provincia.setPoblacion(poblacion);
        provincias.add(provincia);
    }

    public void crearDistrito(String nombre, String alcalde) {
        Distrito distrito = new Distrito();
        distrito.setNombre(nombre);
        distrito.setAlcalde(alcalde);
        distritos.add(distrito);
    }

    public String buscarProvinciaPorNombre(String nombre) {
        String busqueda = "";
        for (Provincia provincia : provincias) {
            if (provincia.getNombre().equals(nombre)) {
                busqueda = provincia.toString();
            }
        }
        return busqueda;
    }

    public String buscarAlcadePorNombreDistrito(String nombre) {
        String busqueda = "";
        for (Distrito distrito : distritos) {
            if (distrito.getNombre().equals(nombre)) {
                busqueda = distrito.getAlcalde();
            }
        }
        return busqueda;
    }

    public void eliminarDistrito(String nombre) {
        for (Distrito distrito : distritos) {
            if (distrito.getNombre().equals(nombre)) {
                distritos.remove(distrito);
            }
        }
    }

    public String mostrarPais() {
        return pais.toString();
    }
}
