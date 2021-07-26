package Excercises.PDD.MiBanco.MiBanco3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaBancaria {

    protected int numeroCuenta;
    protected double balance = 0;

    public CuentaBancaria(int a) {
        this.numeroCuenta = a;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amt) {
        this.balance = amt;
    }
}