package MiBanco.MiBanco4;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaAhorros implements ICuentaBancaria {
    protected int numeroCuenta;
    protected int balance = 0;
    private double tasa = 0.01;

    public CuentaAhorros(int numeroCuenta) {
        super();
        this.numeroCuenta = numeroCuenta;
    }

    public void agregarInteres() {
        this.balance = (int) (this.balance * (1 + this.tasa));
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public int getBalance() {
        return this.balance;
    }

    public void depositar(int monto) {
        this.balance = monto;
    }

    public boolean tieneFondosSuficientes(int montoPrestamo) {
        return this.balance >= (montoPrestamo / 2);
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorros";
    }
}