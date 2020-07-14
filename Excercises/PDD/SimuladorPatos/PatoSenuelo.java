package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoSenuelo implements IPato {

    public String cuaquear() {
        return "<<silencio>>";
    }

    public String nadar() {
        return "Yo no puedo volar";
    }

    public String mostrar() {
        return "Todos los patos pueden flotar, aun los de goma son un señuelo.";
    }
}