/*
    > : Mayor que
    < : Menor que
    != : Diferente que
    == : Igual que
    && : y logico (AND)
    || : o logico (OR)
 */
package Operadores;

public class Logicos {
    
    public static void main(String[]args){
    
        int numero1 = 10;
        int numero2 = 5;
        
        if(numero1 > numero2)
            {System.out.println(numero1+" es mayor que "+numero2);}
        else
            {System.out.println(numero1+" no es mayor que "+numero2);}
            
        if(numero1 < numero2)
            {System.out.println(numero1+" es menor que "+numero2);}
        else
            {System.out.println(numero1+" no es menor que "+numero2);}
        
        if(numero1 != numero2)
            {System.out.println(numero1+" es diferente que "+numero2);}
        else
            {System.out.println(numero1+" no es diferente que "+numero2);}
        
        if(numero1 == numero2)
            {System.out.println(numero1+" es igual que "+numero2);}
        else
            {System.out.println(numero1+" no es igual que "+numero2);}
        
        if(numero1 == 10 && numero2 == 5)
            {System.out.println(numero1+" es igual a 10 y el "+numero2+" es igual a 5");}
        else
            {System.out.println(numero1+" no es igual a 10 y el "+numero2+" no es igual a 5");}
        
        if(numero1 != 10 || numero2 != 5)
            {System.out.println(numero1+" es diferente a 10 o el "+numero2+" es diferente a 5");}
        else
            {System.out.println(numero1+" no es diferente a 10 o el "+numero2+" no es diferente a 5");}
        
    }
    
}
