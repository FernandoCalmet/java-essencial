package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoReal implements IPato {

    @Override
    public String descripcion(){
        return "Yo soy un verdadero PATO REAL";
    }

    @Override
    public String cuaquear() {
        return "Soy un verdadero pato por eso hago Cuac Cuac";
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