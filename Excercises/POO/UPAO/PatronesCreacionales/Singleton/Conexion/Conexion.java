package Excercises.POO.UPAO.PatronesCreacionales.Singleton.Conexion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Conexion {
    private static Conexion instancia;

    private Conexion() {
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
            System.out.println("El objeto ha sido creado...");
        } else {
            System.out.println("El objeto ya existe...");
        }
        return instancia;
    }

    public void conectarBD() {
        System.out.println("Conectando a la base de datos...");
    }

    public void desconectarBD() {
        System.out.println("Desconectando de la base de datos...");
    }
}
