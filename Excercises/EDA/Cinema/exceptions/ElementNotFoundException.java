package Excercises.EDA.Cinema.exceptions;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ElementNotFoundException extends RuntimeException {
   /**
    *
    */
   private static final long serialVersionUID = 1L;

   public ElementNotFoundException(String collection) {
      super("The target element is not in this " + collection);
   }
}