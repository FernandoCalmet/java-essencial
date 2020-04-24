package ClaseScanner;

import java.util.Scanner;

public class NextInt {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();
        
        System.out.println("Tu edad actual es "+edad+" y el proximo año tendras "+(edad+1));
        
    }
    
}