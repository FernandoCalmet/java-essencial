package MiBanco.MiBanco5;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaAhorros extends CuentaBancaria {
    private double tasa = 0.01;

    public CuentaAhorros(int numeroCuenta) {
        super.numeroCuenta = numeroCuenta;
    }

    public void agregarInteres() {
        super.balance = (int) (super.balance * (1 + this.tasa));
    }

    public int getNumeroCuenta() {
        return super.getNumeroCuenta();
    }

    public int getBalance() {
        return super.getBalance();
    }

    public void depositar(int monto) {
        super.depositar(monto);
    }

    public boolean tieneFondosSuficientes(int montoPrestamo) {
        return super.balance >= (montoPrestamo / 2);
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorros";
    }
}