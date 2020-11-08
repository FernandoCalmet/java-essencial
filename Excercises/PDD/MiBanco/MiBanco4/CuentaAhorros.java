package miBanco.miBanco4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaAhorros implements CuentaBancaria {

    private double tasa = 0.01;
    protected int numeroCuenta;
    protected int balance = 0;

    public CuentaAhorros(int numeroCuenta) {
        super();
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
        return this.balance >= (montoPrestamo / 2);
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorros";
    }

    public void agregarInteres() {
        this.balance = (int) (this.balance * (1 + this.tasa));
    }
}
