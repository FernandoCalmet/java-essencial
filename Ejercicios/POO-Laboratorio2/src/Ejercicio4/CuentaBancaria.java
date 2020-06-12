package Ejercicio4;
/**
 *
 * @author fernandocalmet
 */
public class CuentaBancaria 
{
    private long nroCuenta;
    private static int contador = 100001;
    private String dni;
    private double saldo;
    private double interesMensual;

    public CuentaBancaria() 
    {
        this.nroCuenta = contador++;
        this.dni = null;
        this.saldo = 0;
        this.interesMensual = 0;
    }

    public CuentaBancaria(String dni, double saldo, double interesMensual) 
    {
        this.nroCuenta = contador++;
        this.dni = dni;
        this.saldo = saldo;
        this.interesMensual = interesMensual;
    }
    
    @Override
    public String toString()
    {
        return "Numero de Cuenta: "+getNroCuenta()+"\nDNI: "+getDni()+"\nSaldo: "+getSaldo()+"\nInteres Mensual: "+getInteresMensual();
    }
    
    public void ActualizarSaldo(double saldo)
    {
        this.saldo = saldo + (this.interesMensual / 30);
    }
    
    public void IngresarSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public void RetirarSaldo(double saldo)
    {
        if(this.saldo>0)
            this.saldo =- saldo;
        else
            System.out.println("La cuenta no tiene saldo.");
    }

    public long getNroCuenta() {
        return nroCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }
        
}
