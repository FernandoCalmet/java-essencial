package Excercises.POO.Excepciones.Finally;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int resultado = 0;

        try {
            resultado = num1 / num2;
        } catch (Exception ex) {
            System.out.println("Error de tipo: " + ex);
        } finally {
            System.out.println("El resultado es " + resultado);
        }
    }
}
