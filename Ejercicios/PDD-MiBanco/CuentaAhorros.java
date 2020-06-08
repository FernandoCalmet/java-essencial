public class CuentaAhorros extends BaseCuentas implements ICuentaBancaria {
    private double tasa = 0.01;

    public CuentaAhorros(int numeroCuenta) {
        super();
        this.numeroCuenta = numeroCuenta;
    }

    public void agregarInteres() {
        this.balance = (int) (this.balance * (1 + this.tasa));
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
        return "Cuenta de Ahorros";
    }
}