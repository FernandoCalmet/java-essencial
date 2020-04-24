/*
    + : Suma
    - : Resta
    * : Multiplicacion
    / : Division
 */
package Operadores;

public class Aritmeticos {
    
    public static void main(String[]args){
    
        int numero1 = 40;
        int numero2 = 20;
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        
        System.out.println(numero1+" + "+numero2+" = "+suma);
        System.out.println(numero1+" - "+numero2+" = "+resta);
        System.out.println(numero1+" * "+numero2+" = "+multiplicacion);
        System.out.println(numero1+" / "+numero2+" = "+division);
    
    }
    
}
