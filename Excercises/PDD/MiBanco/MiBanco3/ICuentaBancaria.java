package MiBanco.MiBanco3;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public interface ICuentaBancaria {
    public void crear();

    public void seleccionar(int cuenta);

    public void deposito(int monto);

    public void prestamo(int monto);

    public void mostrar();

    public void interes();
}