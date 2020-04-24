package Caso3;

/**
 *
 * @author fernandocalmet
 */
public class Triangulo2D 
{
    private Punto2D p1;
    private Punto2D p2;
    private Punto2D p3;

    public Triangulo2D(Punto2D p1, Punto2D p2, Punto2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public double calcularPerimetro()
    {
        return getP1().calcularDistancia(p1) + getP2().calcularDistancia(p2) + getP3().calcularDistancia(p3);
    }
    
    public String devolverTipoTriangulo(Punto2D p1, Punto2D p2, Punto2D p3)
    {
        if(p1 == p2 && p1 == p3 || p2 == p1 && p2 == p3 || p3 == p1 && p3 == p2 ){
            return "Isoceles";
        }
        
        if(p1 == p2 && p2 == p3 && p3 == p1){
            return "Equilatero";
        }        
        else{
            return "Escaleno";
        }        
    }

    public Punto2D getP1() {
        return p1;
    }

    public void setP1(Punto2D p1) {
        this.p1 = p1;
    }

    public Punto2D getP2() {
        return p2;
    }

    public void setP2(Punto2D p2) {
        this.p2 = p2;
    }

    public Punto2D getP3() {
        return p3;
    }

    public void setP3(Punto2D p3) {
        this.p3 = p3;
    }
    
    @Override
    public String toString()
    {
        return "Triangulo: [P1:" +getP1()+ ", P2:" +getP2()+ ", P3:" +getP3()+ "]";
    }
}
