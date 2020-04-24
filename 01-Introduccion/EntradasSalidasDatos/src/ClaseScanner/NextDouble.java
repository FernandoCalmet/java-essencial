package ClaseScanner;

import java.util.Scanner;

public class NextDouble {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu peso: ");
        double peso = entrada.nextDouble();
        
        System.out.println("Tu peso es "+peso);
        
    }
    
}