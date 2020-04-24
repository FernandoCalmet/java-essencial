/*
    While
    Do - While
 */
package Bucles;

public class Indeterminados {
    
    public static void main(String[] args) {
        
        //Ejemplo con While
        char letra = 'a';
        while(letra == 'a'){
            letra = 'b';
        }
        System.out.println("La letra antes era 'a' y ahora es '"+letra+"'");
        
        //Ejemplo con Do - While
        int numero = 1;        
        do{
            System.out.print(numero+" + 1 = ");
            numero++;
            System.out.print(numero+"\n");;
        }
        while(numero<=5);        
        System.out.println("El resultado despues del recorrido es "+numero);
        
    }
    
}
