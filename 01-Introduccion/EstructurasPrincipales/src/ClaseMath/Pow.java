/*
  Math.pow(base, exponente) : Potencia de un numero. La base y el exponente son Double. 
*/
package ClaseMath;

public class Pow {
    
    public static void main(String[] args) {
        
        int base = 8;
        int exponente = 2;
        
        double resultado = (double) Math.pow(base,exponente);
        
        System.out.println("La potencia del numero "+base+" con exponente "+exponente+" es "+resultado);
    }
    
}