package miBanco.miBanco4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaCorriente implements CuentaBancaria {

    protected int numeroCuenta;
    protected int balance = 0;

    public CuentaCorriente(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void depositar(int monto) {
        this.balance = monto;
    }

    @Override
    public boolean tieneFondosSuficientes(int montoPrestamo) {
        return this.balance >= ((montoPrestamo * 2) / 3);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente";
    }
}
