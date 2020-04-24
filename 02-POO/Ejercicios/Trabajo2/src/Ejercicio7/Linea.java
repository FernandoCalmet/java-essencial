package Ejercicio7;
/**
 *
 * @author fernandocalmet
 */
public class Linea 
{
    private Punto ptoA;
    private Punto ptoB;
    
    public Linea()
    {
        this.ptoA = new Punto();
        this.ptoB = new Punto();
    }
    
    public Linea(Punto ptoA, Punto ptoB) {
        this.ptoA = ptoA;
        this.ptoB = ptoB;
    }
    
    public void mueveDerecha(double posicion)
    {
        this.ptoA.setCoordX(posicion);
        this.ptoB.setCoordX(posicion);
    }
    
    public void mueveIzquierda(double posicion)
    {
        this.ptoA.setCoordX(posicion * (-1));
        this.ptoB.setCoordX(posicion * (-1));
    }
    
    public void mueveArriba(double posicion)
    {
        this.ptoA.setCoordY(posicion);
        this.ptoB.setCoordY(posicion);
    }
    
    public void mueveAbajo(double posicion)
    {
        this.ptoA.setCoordY(posicion * (-1));
        this.ptoB.setCoordY(posicion * (-1));
    }
        
    public String toString()
    {
        return "[("+this.ptoA.getCoordX()+","+this.ptoA.getCoordY()+"),("+this.ptoB.getCoordX()+","+this.ptoB.getCoordY()+")]";
    }
}
