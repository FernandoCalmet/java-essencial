package Ejemplos;
/* Private : Acceso solo para la misma clase */
import javax.swing.JOptionPane;

public class EncapsuladoPrivate {
    public static void main(String[] args) {
        Primaria alumno1 = new Primaria();
        alumno1.setNombre();
        alumno1.setGrado();
        JOptionPane.showMessageDialog(null,"ALUMNO DE PRIMARIA\nNombre: "+alumno1.getNombre()+"\nGrado: "+alumno1.getGrado());
        
        Secundaria alumno2 = new Secundaria();   
        alumno2.setNombre();
        alumno2.setGrado();
        JOptionPane.showMessageDialog(null,"ALUMNO DE SECUNDARIA\nNombre: "+alumno2.getNombre()+"\nGrado: "+alumno2.getGrado());
    }
}

class Primaria{
    private String nombre;
    private int grado;
    public Primaria(){
        nombre = null;
        grado = 0;
    }
    
    public void setNombre(){
        nombre = "Fernando";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setGrado(){
        grado = 3;
    }
    
    public int getGrado(){
        return grado;
    }
}

class Secundaria{
    private String nombre;
    private int grado;
    public Secundaria(){
        nombre = null;
        grado = 0;
    }
    
    public void setNombre(){
        nombre = "Andres";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setGrado(){
        grado = 5;
    }
    
    public int getGrado(){
        return grado;
    }
}
