package Excercises.POO.UPAO.CuentaBancaria.ejercicio2.presentacion;

import Excercises.POO.UPAO.CuentaBancaria.ejercicio2.accesoDatos.BaseDatosCuenta;
import Excercises.POO.UPAO.CuentaBancaria.ejercicio2.entidades.Cuenta;
import Excercises.POO.UPAO.CuentaBancaria.ejercicio2.entidades.Cliente;
import java.io.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaClienteCuenta {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n = 0;
    static long nro;
    static Cuenta oCta;
    static Cliente oCli;
    static BaseDatosCuenta cuentas = new BaseDatosCuenta();

    public static void main(String[] args) throws IOException {
        int opc;
        String dni, nom;

        System.out.println("Ingreso de datos Cliente");
        System.out.println("Dni: ");
        dni = br.readLine();
        System.out.println("Nombres: ");
        nom = br.readLine();

        oCli = new Cliente(dni, nom);

        do {
            opc = menu();
            switch (opc) {
                case 1:
                    n = leerN();
                    ingresar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    reportar();
                    break;
                case 6:
                    terminar();
                    break;
            }
        } while (opc != 6);
    }

    static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n*****MENU OPCIONES CUENTAS*****");
            System.out.println("1. Ingresar cuentas");
            System.out.println("2. Consultar Cuenta por Nro");
            System.out.println("3. Depoistar en Cuenta");
            System.out.println("4. Eliminar Cuenta");
            System.out.println("5. Reportar Cuentas");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 6);

        return opc;
    }

    static int leerN() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N Cuentas a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    static void ingresar() throws IOException {
        double sal;
        String mon;
        System.out.println("\nIngreso datos cuenta");
        for (int i = 0; i < n; i++) {
            System.out.println("Saldo: ");
            sal = Double.parseDouble(br.readLine());
            System.out.println("Moneda: ");
            mon = br.readLine();
            oCta = new Cuenta(sal, mon, oCli);
            nro = cuentas.agregarCuenta(oCta);
            System.out.println("-->Nro Cuenta creada: " + nro + "\n");
        }
    }

    static void consultar() throws IOException {
        System.out.println("\nNro Cuenta: ");
        nro = Long.parseLong(br.readLine());
        oCta = cuentas.buscarCuentaxNro(nro);
        if (oCta != null) {
            System.out.println(oCta.toString());
        } else {
            System.out.println("Cuenta no existe!");
        }
    }

    static void depositar() throws IOException {
        double mon;
        boolean resp;

        consultar();

        if (oCta != null) {
            System.out.println("Monto a depositar: ");
            mon = Double.parseDouble(br.readLine());
            resp = oCta.depositar(mon);
            if (resp == true) {
                System.out.println("Nuevo Saldo -> " + oCta.getSaldo());
            } else {
                System.out.println("Operacion no exitosa.");
            }
        }
    }

    static void eliminar() throws IOException {
        consultar();
        if (oCta != null) {
            cuentas.eliminarCuenta(oCta);
            System.out.println("Cuenta eliminada!");
        }
    }

    static void reportar() {
        System.out.println("\nReporte");
        System.out.println(cuentas.listarCuentas());
    }

    static void terminar() {
        System.out.println("Fin de la aplicación banco.");
    }
}
