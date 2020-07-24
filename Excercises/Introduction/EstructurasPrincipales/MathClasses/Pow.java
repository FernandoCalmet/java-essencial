package EstructurasPrincipales.MathClasses;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pow {
  public static void main(String[] args) {
    int base = 8;
    int exponente = 2;
    /*
     * Math.pow(base, exponente) : Potencia de un numero. La base y el exponente son
     * Double.
     */
    double resultado = (double) Math.pow(base, exponente);
    System.out.println("La potencia del numero " + base + " con exponente " + exponente + " es " + resultado);
  }
}