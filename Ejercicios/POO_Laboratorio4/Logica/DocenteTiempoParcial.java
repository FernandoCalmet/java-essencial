package Logica;

/**
 *
 * @author fernandocalmet
 */
public class DocenteTiempoParcial extends Docente
{    
    private int horas;
    private double tarifa;
    
    public DocenteTiempoParcial(String tipo, String nombre, String dni, String dptoAcademico, int horas, double tarifa) 
    {
        super(tipo, nombre, dni, dptoAcademico);
        this.horas = horas;
        this.tarifa = tarifa;
    }
        
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }   
    
    @Override
    public double getSalario(){
        return (getHoras() * getTarifa()) * 4;
    }
}
