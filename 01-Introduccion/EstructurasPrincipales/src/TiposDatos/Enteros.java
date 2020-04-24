/*
    Byte: 1 byte de espacio para almacenamiento. Desde -128 hasta 127
    Short: 2 bytes de espacio para almacenamiento. Desde -32,768 hasta 32,767
    Int: 4 bytes de espacio para almacenamiento. Desde -2,147,483,648 hasta 2,147,483,647
    Long: 8 bytes de espacio para almacenamiento. Muy extensa. Sufijo L
*/

package TiposDatos;

public class Enteros {
    
    public static void main(String[]args){
        
        byte numero1 = 127;
        short numero2 = 32767;
        int numero3 = 2147483647;        
        long numero4 = 2147483647;
              
        System.out.println("byte "+numero1);
        System.out.println("short "+numero2);
        System.out.println("int "+numero3);        
        System.out.println("long "+numero4);
                
    }
    
}
