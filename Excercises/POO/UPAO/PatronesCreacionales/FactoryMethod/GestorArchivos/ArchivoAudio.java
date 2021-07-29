package Excercises.POO.UPAO.PatronesCreacionales.FactoryMethod.GestorArchivos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ArchivoAudio implements IArchivo {
    public ArchivoAudio() {
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}
