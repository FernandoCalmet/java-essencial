package exceptions;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class EmptyCollectionException extends RuntimeException {
   public EmptyCollectionException(String collection) {
      super("The " + collection + " is empty.");
   }
}