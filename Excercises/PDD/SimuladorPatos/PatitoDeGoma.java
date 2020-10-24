package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatitoDeGoma implements IPato {

    @Override
    public String descripcion() {
        return "Yo soy un Patito de goma";
    }

    @Override
    public String cuaquear() {
        return "Chirr Chirr";
    }

    @Override
    public String nadar() {
        return "INCAPAZ DE VOLAR";
    }

    @Override
    public String mostrar() {
        return "TODOS LOS PATOS NADAN";
    }
}