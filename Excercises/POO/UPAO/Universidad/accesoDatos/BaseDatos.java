package Excercises.POO.UPAO.Universidad.accesoDatos;

import java.util.ArrayList;

import Excercises.POO.UPAO.Universidad.entidades.DocenteContratado;
import Excercises.POO.UPAO.Universidad.entidades.DocenteNombrado;
import Excercises.POO.UPAO.Universidad.entidades.Trabajador;
import Excercises.POO.UPAO.Universidad.entidades.TrabajadorAdministrativo;
import Excercises.POO.UPAO.Universidad.entidades.TrabajadorDirector;
import Excercises.POO.UPAO.Universidad.entidades.TrabajadorDocente;
import Excercises.POO.UPAO.Universidad.entidades.Universidad;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BaseDatos {
    // Atributos
    private Universidad universidad;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<TrabajadorAdministrativo> trabajadoresAdministrativos;
    private ArrayList<TrabajadorDocente> trabajadoresDocentes;
    private TrabajadorDirector director;
    private ArrayList<DocenteContratado> docentesContratados;
    private ArrayList<DocenteNombrado> docentesNombrados;

    // Constructor
    public BaseDatos() {
        universidad = new Universidad();
        trabajadores = new ArrayList<Trabajador>();
        trabajadoresAdministrativos = new ArrayList<TrabajadorAdministrativo>();
        trabajadoresDocentes = new ArrayList<TrabajadorDocente>();
        director = new TrabajadorDirector();
        docentesContratados = new ArrayList<DocenteContratado>();
        docentesNombrados = new ArrayList<DocenteNombrado>();
    }

    // Metodos publicos
    public void crearUniversidad(String nombre, String ciudad) {
        universidad.setNombre(nombre);
        universidad.setCiudad(ciudad);
        universidad.setTrabajadores(trabajadores);
    }

    public void agregarTrabajador(Trabajador trabajador) {
        if (trabajador instanceof TrabajadorAdministrativo) {
            trabajadoresAdministrativos.add((TrabajadorAdministrativo) trabajador);
        } else if (trabajador instanceof TrabajadorDocente) {
            trabajadoresDocentes.add((TrabajadorDocente) trabajador);
        } else if (trabajador instanceof TrabajadorDirector) {
            director = (TrabajadorDirector) trabajador;
        } else if (trabajador instanceof DocenteContratado) {
            docentesContratados.add((DocenteContratado) trabajador);
        } else if (trabajador instanceof DocenteNombrado) {
            docentesNombrados.add((DocenteNombrado) trabajador);
        }
        trabajadores.add(trabajador);
    }

    public String getEdadPromedioDocentes(int edadPromedio) {
        for (TrabajadorDocente trabajadorDocente : trabajadoresDocentes) {
            edadPromedio += trabajadorDocente.getEdad();
        }
        return String.valueOf(edadPromedio / trabajadoresDocentes.size());
    }

    public String getMayorSueldoDocentesContratados() {
        double mayorSueldo = 0;
        for (DocenteContratado docenteContratado : docentesContratados) {
            if (docenteContratado.getSueldo() > mayorSueldo) {
                mayorSueldo = docenteContratado.getSueldo();
            }
        }
        return String.valueOf(mayorSueldo);
    }

    public String buscarTrabajador(String id) {
        String busqueda = "";
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getId() == id) {
                busqueda += trabajador.getNombres() + " tiene un sueldo de " + trabajador.getSueldo() + " s/.";
            }
        }
        return busqueda;
    }

    public boolean eliminarTrabajador(String id) {
        boolean estado = false;
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getId() == id) {
                trabajadores.remove(trabajador);
                return true;
            }
        }
        return estado;
    }

    public String mostrarReporteTrabajadores() {
        return universidad.toString();
    }
}
