package Throws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fernandocalmet
 */
public class Ejemplo1 
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        //Crear instancia del objeto de la clase
        Ejemplo1 objeto = new Ejemplo1();
        
        //Ingresar datos al objeto instanciado
        System.out.println("Ingresar nombre de curso");
        String curso = br.readLine();
        System.out.println("Ingresar turno del curso");
        char turno = br.readLine().charAt(0);
        
        //Intento de sentencia
        try{
            objeto.Reporte(curso, turno);
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }  
    
    public void Reporte(String curso, char turno)throws Exception
    {
        if(curso == null || curso.length() == 0)
            throw new Exception("Curso no valido");
        if(turno != 'M' && turno != 'T')
            throw new Exception("Turno no valido");
        System.out.println("Curso: "+curso);
        System.out.println("Turno: "+turno);
    }
}
