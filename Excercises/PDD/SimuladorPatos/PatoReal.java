package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoReal implements IPato {

    public String cuaquear() {
        return "Cuac Cuac";
    }

    public String nadar() {
        return "Yo no puedo volar";
    }

    public String mostrar() {
        return "Todos los patos pueden flotar, aun los de goma son un señuelo.";
    }
}