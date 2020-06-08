public abstract class BaseCuentas {
    protected int numeroCuenta;
    protected int balance = 0;

    protected int getBaseNumeroCuenta() {
        return this.numeroCuenta;
    }

    protected int getBaseBalance() {
        return this.balance;
    }

    protected void baseDepositar(int monto) {
        this.balance = monto;
    }

    protected boolean baseFondos(int montoPrestamo) {
        return this.balance >= montoPrestamo / 2;
    }
}