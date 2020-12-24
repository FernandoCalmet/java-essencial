package Excercises.EDA.Cinema.exceptions;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EmptyCollectionException extends RuntimeException {
   /**
    *
    */
   private static final long serialVersionUID = 1L;

   public EmptyCollectionException(String collection) {
      super("The " + collection + " is empty.");
   }
}