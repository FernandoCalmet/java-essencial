package Excercises.POO.UPAO.PatronesCreacionales.FactoryMethod.GestorArchivos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ArchivoVideo implements IArchivo {
    public ArchivoVideo() {
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de video...");
    }
}
