package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class PatitoDeGoma implements IPato {

    public String cuaquear() {
        return "Chirr Chirr";
    }

    public String nadar() {
        return "Yo no puedo volar";
    }

    public String mostrar() {
        return "Todos los patos pueden flotar, aun los de goma son un señuelo.";
    }
}