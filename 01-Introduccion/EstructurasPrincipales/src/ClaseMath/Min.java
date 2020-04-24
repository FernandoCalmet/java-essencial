/*
    Math.min(numero1,numero2) : Regresa el valor minimo entre dos numeros.
*/
package ClaseMath;

public class Min {
    
    public static void main(String[] args) {
        
        int numero1 = 100;
        int numero2 = 50;
            
        int numeroMenor = Math.min(numero1,numero2);        
        System.out.println("El numero menor entre "+numero1+" y "+numero2+" es "+numeroMenor);
    }
    
}