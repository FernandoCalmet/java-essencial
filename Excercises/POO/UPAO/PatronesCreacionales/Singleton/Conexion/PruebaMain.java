package Excercises.POO.UPAO.PatronesCreacionales.Singleton.Conexion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMain {
    public static void main(String[] args) {
        Conexion c1 = Conexion.getInstancia();
        c1.conectarBD();
        c1.desconectarBD();

        boolean rpta = c1 instanceof Conexion;
        System.out.println(rpta);

        Conexion c2 = Conexion.getInstancia();
        c2.conectarBD();
        c2.desconectarBD();
        rpta = c2 instanceof Conexion;
        System.out.println(rpta);
    }
}
