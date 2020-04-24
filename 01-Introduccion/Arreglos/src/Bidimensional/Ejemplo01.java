package Bidimensional;

public class Ejemplo01 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[2][3];

           matriz[0][0] = 5;
           matriz[0][1] = 10;           
           matriz[0][2] = 15;
           
           matriz[1][0] = 20;
           matriz[1][1] = 25;           
           matriz[1][2] = 30;   

           for(int[] i : matriz){
               for(int j : i){
                   System.out.println(j);
               }
               System.out.println();
           }   
        
    }
    
}
