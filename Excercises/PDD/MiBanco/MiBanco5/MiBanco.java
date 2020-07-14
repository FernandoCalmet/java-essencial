package MiBanco.MiBanco5;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class MiBanco {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Integer, CuentaBancaria> cuentas = new HashMap<>();
    private static Banco banco = new Banco(cuentas);
    private static BancoCliente bancoCliente = new BancoCliente(scanner, banco);

    public static void main(String[] args) {
        bancoCliente.run();
    }
}