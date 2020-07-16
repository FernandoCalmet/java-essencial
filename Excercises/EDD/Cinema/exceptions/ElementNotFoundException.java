package exceptions;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ElementNotFoundException extends RuntimeException {
   public ElementNotFoundException(String collection) {
      super("The target element is not in this " + collection);
   }
}