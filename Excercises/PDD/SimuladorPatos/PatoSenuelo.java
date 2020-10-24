package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoSenuelo implements IPato {

    @Override
    public String descripcion() {
        return "Yo soy Pato señuelo";
    }

    @Override
    public String cuaquear() {
        return "<<silencio>>";
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