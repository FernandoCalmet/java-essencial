/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class CuentaBancaria {
    protected int numeroCuenta;
    protected int balance = 0;

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public int getBalance() {
        return this.balance;
    }

    public void depositar(int monto) {
        this.balance = monto;
    }

    public abstract boolean tieneFondosSuficientes(int monto);

    public abstract String toString();
}