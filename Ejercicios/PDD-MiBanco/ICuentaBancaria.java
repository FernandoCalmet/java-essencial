public interface ICuentaBancaria {
    public int getNumeroCuenta();

    public int getBalance();

    public void depositar(int monto);

    public boolean tieneFondosSuficientes(int montoPrestamo);

    public String toString();
}