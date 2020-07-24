package Arreglos.Bidimensional;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        String[][] empleados = { { "Fernando", "Andres", "Jose", "Mario" }, { "Maria", "Juliana", "Rocio", "Stefani" },
                { "Fredy", "Javier", "Karen", "Kevin" } };

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(empleados[i][j] + ", ");
            }
        }
    }
}
