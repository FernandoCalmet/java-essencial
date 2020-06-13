public interface ICuentaBancaria {
    public void crear();
    public void seleccionar(int cuenta);
    public void deposito(int monto);
    public void prestamo(int monto);
    public void mostrar();
    public void interes();
}