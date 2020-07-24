package TrabajadoresUPAO.Logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Universidad {
    // Atributos estaticos
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Universidad() throws IOException {
        // Atributos de objetos
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
        String tipo = "";
        String nombre = "";
        String dni = "";
        String dptoAcademico = "";
        String oficina = "";
        String cargo = "";
        double sueldoBasico = 0;
        int horas = 0;
        int tarifa = 0;
        int opcion = 0;

        // Mantener el switch mientras que la opcion sea menor que ocho
        do {
            // Mostrar opciones del menu
            System.out.println("\nMENU DE TRABAJADOR\n--------------");
            System.out.println("1.- Crear Docente");
            System.out.println("2.- Crear administrativos");
            System.out.println("3.- Crear personal de servicio");
            System.out.println("4.- Calcular salario de trabajador");
            System.out.println("5.- Mostrar Docentes");
            System.out.println("6.- Mostrar Administrativos");
            System.out.println("7.- Mostrar Personal de Servicio");
            System.out.println("8.- Salir");

            // Capturar el valor de la opcion del menu
            System.out.println("Ingresar un numero para escoger una opcion del menu: ");
            opcion = Integer.parseInt(br.readLine());

            // Crear un menu que reciba el valor capturado de la opcion
            switch (opcion) {
                case 1:
                    Docente docente = CrearDocente(tipo, nombre, dni, dptoAcademico, sueldoBasico, horas, tarifa);
                    listaTrabajadores.add(docente);
                    break;
                case 2:
                    Administrativo administrativo = CrearAdministrativo(tipo, nombre, dni, oficina, cargo,
                            sueldoBasico);
                    listaTrabajadores.add(administrativo);
                    break;
                case 3:
                    Servicio servicio = CrearServicio(tipo, nombre, dni, oficina, sueldoBasico);
                    listaTrabajadores.add(servicio);
                    break;
                case 4:
                    CalcularSalario(listaTrabajadores);
                    break;
                case 5:
                    mostrarDocentes(listaTrabajadores);
                    break;
                case 6:
                    mostrarAdministrativos(listaTrabajadores);
                    break;
                case 7:
                    mostrarServicios(listaTrabajadores);
                    break;
            }
        } while (opcion < 8);
    }

    protected static Docente CrearDocente(String tipo, String nombre, String dni, String dptoAcademico,
            double sueldoBasico, int horas, int tarifa) throws IOException {
        Docente temporal = null;

        System.out.println(
                "Ingresar la letra del tipo de docente que desea crear (C = Tiempo completo / P = Tiempo parcial)");
        char tipoDocente = br.readLine().toUpperCase().charAt(0);

        if (tipoDocente == 'C') {
            System.out.println("Ingresar el nombre: ");
            nombre = br.readLine();
            System.out.println("Ingresar el DNI: ");
            dni = br.readLine();
            System.out.println("Ingresar el Departamento Academico: ");
            dptoAcademico = br.readLine();
            System.out.println("Ingresar el sueldo basico: ");
            sueldoBasico = Double.parseDouble(br.readLine());
            tipo = "Docente Tiempo Completo";
            Docente docente = new DocenteTiempoCompleto(tipo, nombre, dni, dptoAcademico, sueldoBasico);
            temporal = docente;
        }

        if (tipoDocente == 'P') {
            System.out.println("Ingresar el nombre: ");
            nombre = br.readLine();
            System.out.println("Ingresar el DNI: ");
            dni = br.readLine();
            System.out.println("Ingresar el Departamento Academico: ");
            dptoAcademico = br.readLine();
            System.out.println("Ingresar las horas: ");
            horas = Integer.parseInt(br.readLine());
            System.out.println("Ingresar la tarifa: ");
            tarifa = Integer.parseInt(br.readLine());
            tipo = "Docente Tiempo Parcial";
            Docente docente = new DocenteTiempoParcial(tipo, nombre, dni, dptoAcademico, horas, tarifa);
            temporal = docente;
        }

        return temporal;
    }

    protected static Administrativo CrearAdministrativo(String tipo, String nombre, String dni, String oficina,
            String cargo, double sueldoBasico) throws IOException {
        Administrativo temporal = null;

        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresar el nombre: ");
            nombre = br.readLine();
            System.out.println("Ingresar el DNI: ");
            dni = br.readLine();
            System.out.println("Ingresar la oficina: ");
            oficina = br.readLine();
            System.out.println("Ingresar el cargo: ");
            cargo = br.readLine();
            System.out.println("Ingresar el sueldo basico: ");
            sueldoBasico = Double.parseDouble(br.readLine());
            tipo = "Administrativo";
            Administrativo administrativo = new Administrativo(tipo, nombre, dni, oficina, cargo, sueldoBasico);
            temporal = administrativo;
        }
        return temporal;
    }

    protected static Servicio CrearServicio(String tipo, String nombre, String dni, String oficina, double sueldoBasico)
            throws IOException {
        Servicio temporal = null;

        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresar el nombre: ");
            nombre = br.readLine();
            System.out.println("Ingresar el DNI: ");
            dni = br.readLine();
            System.out.println("Ingresar la oficina: ");
            oficina = br.readLine();
            System.out.println("Ingresar el sueldo basico: ");
            sueldoBasico = Double.parseDouble(br.readLine());
            tipo = "Servicio";
            Servicio servicio = new Servicio(tipo, nombre, dni, oficina, sueldoBasico);
            temporal = servicio;
        }
        return temporal;
    }

    protected static void CalcularSalario(ArrayList<Trabajador> listaTrabajadores) throws IOException {
        System.out.println("Ingresar el DNI para realizar busqueda: ");
        String dni = br.readLine();

        for (Trabajador lista : listaTrabajadores) {
            if (lista.getDni().equals(dni))
                System.out.println("Resultado de busqueda:\n--------------\n" + lista.toString());
            else
                System.out.println("El DNI ingresado no existe.");
        }
    }

    protected static void mostrarDocentes(ArrayList<Trabajador> listaTrabajadores) throws IOException {
        for (Trabajador lista : listaTrabajadores) {
            if (lista.getTipo().equals("Docente Tiempo Completo") || lista.getTipo().equals("Docente Tiempo Parcial"))
                System.out.println("Resultado de busqueda:\n--------------\n" + lista.toString());
            else
                System.out.println("No existen datos.");
        }
    }

    protected static void mostrarAdministrativos(ArrayList<Trabajador> listaTrabajadores) throws IOException {
        for (Trabajador lista : listaTrabajadores) {
            if (lista.getTipo().equals("Administrativo"))
                System.out.println("Resultado de busqueda:\n--------------\n" + lista.toString());
            else
                System.out.println("No existen datos.");
        }
    }

    protected static void mostrarServicios(ArrayList<Trabajador> listaTrabajadores) throws IOException {
        for (Trabajador lista : listaTrabajadores) {
            if (lista.getTipo().equals("Servicio"))
                System.out.println("Resultado de busqueda:\n--------------\n" + lista.toString());
            else
                System.out.println("No existen datos.");
        }
    }
}
