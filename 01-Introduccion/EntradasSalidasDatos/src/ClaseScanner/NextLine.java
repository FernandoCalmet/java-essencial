package ClaseScanner;

import java.util.Scanner;

public class NextLine {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Hola "+nombre+", bienvenido!");
        
    }
    
}

