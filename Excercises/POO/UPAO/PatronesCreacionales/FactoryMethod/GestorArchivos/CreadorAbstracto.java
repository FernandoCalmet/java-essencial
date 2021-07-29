package Excercises.POO.UPAO.PatronesCreacionales.FactoryMethod.GestorArchivos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class CreadorAbstracto {
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    public abstract IArchivo crear(int tipo); // Metodo de fabricacion
}
