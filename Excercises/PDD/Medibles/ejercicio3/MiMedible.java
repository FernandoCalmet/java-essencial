package Excercises.PDD.Medibles.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class MiMedible {

    private ArrayList<Medible> medibles;

    public MiMedible() {
        this.medibles = new ArrayList<>();
    }

    void agregarMedibles(Medible medible) {
        this.medibles.add(medible);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Medible medible : this.medibles) {
            suma = +medible.obtenerMedida();
        }

        return suma / medibles.size();
    }

    public double calcularMaximo() {
        double max = 0;
        for (Medible medible : this.medibles) {
            if (medible.obtenerMedida() > max) {
                max = medible.obtenerMedida();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        for (Medible medible : this.medibles) {
            display.append((String) medible.obtenerReporte() + "\n");
        }
        return display.toString();
    }
}
