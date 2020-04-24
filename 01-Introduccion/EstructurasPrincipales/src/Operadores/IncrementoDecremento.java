/*
    ++ : Incremento
    -- : Decremento
    += n° : Incremento por rango numerico
    -= n° : Decremento por rango numerico
 */
package Operadores;

public class IncrementoDecremento {
    
    public static void main(String[]args){
    
        int incrementoSimple = 1;
        int decrementoSimple = 10;
        int incrementoRango = 10;
        int decrementoRango = 100;
        
        System.out.print(incrementoSimple);
        incrementoSimple++;
        incrementoSimple++;
        incrementoSimple++;
        System.out.print(" + 3 = "+incrementoSimple);
        
        System.out.println();
        
        System.out.print(decrementoSimple);
        decrementoSimple--;
        decrementoSimple--;
        decrementoSimple--;
        System.out.print(" - 3 = "+decrementoSimple);
        
        System.out.println();
        
        System.out.print(incrementoRango);
        incrementoRango+=10;
        incrementoRango+=10;
        incrementoRango+=10;
        System.out.print(" + 30 = "+incrementoRango);
        
        System.out.println();
        
        System.out.print(decrementoRango);
        decrementoRango-=10;
        decrementoRango-=10;
        decrementoRango-=10;
        System.out.print(" - 30 = "+decrementoRango);
        
        System.out.println();
        
    }
    
}
