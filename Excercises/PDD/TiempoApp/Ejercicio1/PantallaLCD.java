package Excercises.PDD.TiempoApp.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PantallaLCD implements IPantalla {
    public void mostrarEnPantalla(float numero) {
        System.out.println("La temperatura en la Pantalla LCD es: " + numero);
    }
}