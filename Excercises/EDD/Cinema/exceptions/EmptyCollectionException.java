package Cinema.exceptions;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EmptyCollectionException extends RuntimeException {
   public EmptyCollectionException(String collection) {
      super("The " + collection + " is empty.");
   }
}