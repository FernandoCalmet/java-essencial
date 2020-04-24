package ClaseBufferedReader;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLine {
    
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = br.readLine();
        
        System.out.println("Hola "+nombre+", bienvenido!");
        
    }
    
}
