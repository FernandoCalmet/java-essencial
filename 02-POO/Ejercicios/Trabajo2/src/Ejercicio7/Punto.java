package Ejercicio7;
/**
 *
 * @author fernandocalmet
 */
public class Punto 
{
    private double coordX;
    private double coordY;
    
    public Punto()
    {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Punto(double coordX, double coordY) 
    {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    @Override
    public String toString()
    {
        return "Punto{"+"x = "+getCoordX()+", y = "+getCoordY()+"}";
    }
    
    public String comparar2Puntos(Punto punto)
    {
        String respuesta;
        if(this.coordX == punto.coordX && this.coordY == punto.coordY)
            respuesta = "si son iguales";
        else
            respuesta = "no son iguales";
        return respuesta;
    }
    
    public double calcularDistancia(Punto punto)
    {
        return Math.sqrt(Math.pow((punto.coordX-this.coordX),2)+ Math.pow((punto.coordY-this.coordY),2));
    }
    
    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
}
