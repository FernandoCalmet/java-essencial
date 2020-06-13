public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(int numeroCuenta) {   
        super.numeroCuenta = numeroCuenta;
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
        return super.balance >= ((montoPrestamo * 2) / 3);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente";
    }
}