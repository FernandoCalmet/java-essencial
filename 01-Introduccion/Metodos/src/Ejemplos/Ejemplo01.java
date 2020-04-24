package Ejemplos;

public class Ejemplo01 {
    
    public static void main(String[] args) {
        
        int numero1 = 20;
        int numero2 = 25;
        
        int resultado = suma(numero1,numero2);
        reporte(resultado);
    }
    
    public static int suma(int numero1,int numero2){
        System.out.print(numero1+" + "+numero2);
        return (numero1+numero2);
    }
    
    public static void reporte(int resultado){
        System.out.println(" = "+resultado);
    }
}
