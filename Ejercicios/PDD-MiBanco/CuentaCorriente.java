public class CuentaCorriente extends BaseCuentas implements ICuentaBancaria {
    public CuentaCorriente(int numeroCuenta) {
        super();
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return getBaseNumeroCuenta();
    }

    public int getBalance() {
        return getBaseBalance();
    }

    public void depositar(int monto) {
        baseDepositar(monto);
    }

    public boolean tieneFondosSuficientes(int montoPrestamo) {
        return baseFondos(montoPrestamo);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente";
    }
}