package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoCabezaRoja implements IPato {

    @Override
    public String descripcion() {
        return "Yo soy un real PATO CABEZA ROJA";
    }

    @Override
    public String cuaquear() {
        return "Soy un verdadero pato por eso hago CUAC CUAC";
    }

    @Override
    public String nadar() {
        return "Puedo volar con mis alas";
    }

    @Override
    public String mostrar() {
        return "TODOS LOS PATOS NADAN";
    }
}