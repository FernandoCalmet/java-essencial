package MiBanco.MiBanco4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface ICuentaBancaria {
    public int getNumeroCuenta();

    public int getBalance();

    public void depositar(int monto);

    public boolean tieneFondosSuficientes(int montoPrestamo);

    public String toString();
}