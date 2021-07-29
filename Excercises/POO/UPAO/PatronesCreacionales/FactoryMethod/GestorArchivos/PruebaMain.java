package Excercises.POO.UPAO.PatronesCreacionales.FactoryMethod.GestorArchivos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMain {
    public static void main(String[] args) {
        CreadorAbstracto oCrea = new Creador();

        IArchivo audio = oCrea.crear(Creador.AUDIO);
        audio.reproducir();
        IArchivo video = oCrea.crear(Creador.VIDEO);
        video.reproducir();
    }
}
