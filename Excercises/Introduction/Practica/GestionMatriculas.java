package Excercises.Introduction.Practica;
/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */

/*
    ============================================================================
    SISTEMA DE GESTION DE MATRICULAS DE ALUMNOS:
    ============================================================================
    1.- Ingresar datos de N cursos de una carrera (se realiza una sola vez)
    Los datos que se van a manejar en los arreglos son: 
    IdCurso (String 7 caracteres), Nombre de curso (String),
    No. de créditos (int), ciclo (int) IdPre-requisito (String 7 caracteres). 
    Si un curso no tiene pre-requisitos, se colocará en blanco. 
    Un alumno puede matricularse en un máximo de 21 créditos. 
    NT (int) es el número total de cursos registrados, inicialmente igual a
    cero.    
    2.- Reportar todos los datos de los cursos (se realiza solo si hay datos
    ingresados).
    3.- Agregar datos.
    4.- Modificar datos de los cursos (se realiza solo si hay datos ingresados). 
    5.- Eliminar datos de los cursos (se realiza solo si hay datos ingresados).     
    6.- Consultar por nombre de curso (se realiza solo si hay datos ingresados).
    7.- Consultar por ciclo (se realiza solo si hay datos ingresados).    
    8.- Finalizar programa. 
 */
import javax.swing.*;

public class GestionMatriculas {
    public static void main(String[] args) {
        String[] idCurso = new String[50];
        String[] nombreCurso = new String[50];
        int[] numeroCreditos = new int[50];
        int[] ciclo = new int[50];
        String[] idPreRequisito = new String[50];
        int nt = 0; // acumulador total de cursos registrados
        int capacidadCursos = 0;
        int menu;

        JOptionPane.showMessageDialog(null,
                "Bienvenido! Para iniciar el sistema de matriculas requiere que ingrese la cantidad de cursos de la carrera que va a gestionar.");

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Esta carrera tiene " + nt + "/" + capacidadCursos + " cursos registrados.\n\n"
                            + "1: Ingresar cantidad de cursos\n" + "2: Reportar datos del curso\n"
                            + "3: Agregar datos del curso\n" + "4: Modificar datos del curso\n"
                            + "5: Eliminar datos del curso\n" + "6: Consultar por nombre del curso\n"
                            + "7: Consultar por ciclo\n" + "8: Finalizar el programa"));

            switch (menu) {
                case 1:
                    capacidadCursos = ingresarDatos(capacidadCursos);
                    break;
                case 2:
                    if (capacidadCursos > 0) {
                        reportarDatos(nt, capacidadCursos, idCurso, nombreCurso, numeroCreditos, ciclo, idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
                case 3:
                    if (capacidadCursos > 0) {
                        nt = agregarDatos(nt, capacidadCursos, idCurso, nombreCurso, numeroCreditos, ciclo,
                                idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
                case 4:
                    if (capacidadCursos > 0) {
                        modificarDatos(capacidadCursos, idCurso, nombreCurso, numeroCreditos, ciclo, idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
                case 5:
                    if (capacidadCursos > 0) {
                        nt = eliminarDatos(nt, idCurso, nombreCurso, numeroCreditos, ciclo, idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
                case 6:
                    if (capacidadCursos > 0) {
                        consultarNombre(nt, idCurso, nombreCurso, numeroCreditos, ciclo, idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
                case 7:
                    if (capacidadCursos > 0) {
                        consultarCiclo(nt, idCurso, nombreCurso, numeroCreditos, ciclo, idPreRequisito);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Esta accion no esta permitida. Primero debe ingresar la cantidad de cursos.");
                    }
                    break;
            }
        } while (menu < 8);
        JOptionPane.showMessageDialog(null, "El programa a finalizado con exito.");
    }

    public static int ingresarDatos(int capacidadCursos) {
        if (capacidadCursos == 0) {
            do {
                capacidadCursos = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingresar la cantidad de cursos que se van a poder registrar."));
            } while (capacidadCursos <= 0 || capacidadCursos > 50);
        } else {
            JOptionPane.showMessageDialog(null, "Solo esta permitido ingresar la cantidad de cursos una sola vez.");
        }
        return capacidadCursos;
    }

    public static void reportarDatos(int nt, int capacidadCursos, String idCurso[], String nombreCurso[],
            int numeroCreditos[], int ciclo[], String idPreRequisito[]) {
        for (int i = 0; i < capacidadCursos; i++) {
            JOptionPane.showMessageDialog(null,
                    "Capacidad de Cursos: " + nt + "/" + capacidadCursos + "\n" + "ID Curso: " + idCurso[i] + "\n"
                            + "Nombre Curso: " + nombreCurso[i] + "\n" + "Numero Creditos: " + numeroCreditos[i] + "\n"
                            + "Ciclo: " + ciclo[i] + "\n" + "Id pre-requisito: " + idPreRequisito[i]);
        }
    }

    public static int agregarDatos(int nt, int capacidadCursos, String idCurso[], String nombreCurso[],
            int numeroCreditos[], int ciclo[], String idPreRequisito[]) {
        if (nt < capacidadCursos) {
            for (int i = 0; i < 1; i++) {
                do {
                    idCurso[i] = JOptionPane
                            .showInputDialog("Ingresar el ID del Curso\n(Longitud de 7 caracteres obligatorio!)");
                } while (idCurso[i].length() != 7);// Validar el ingreso unicamente de una cadena de 7 caracteres
                do {
                    nombreCurso[i] = JOptionPane.showInputDialog("Ingresar el Nombre del Curso");
                } while (nombreCurso[i].length() > 50);// Validar longitud maxima de una cadena de 50 caracteres
                do {
                    numeroCreditos[i] = Integer
                            .parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de creditos del Curso"));
                } while (numeroCreditos[i] == 0);// Validar que el curso tenga por lo menos un credito
                do {
                    ciclo[i] = Integer
                            .parseInt(JOptionPane.showInputDialog("Ingresar el ciclo al que pertenece el curso"));
                } while (ciclo[i] == 0);// Validar que el curso pertenesca a un ciclo
                idPreRequisito[i] = JOptionPane
                        .showInputDialog("Ingresar el ID de pre requisito. Si no tiene dejar en blanco.");
                if (idPreRequisito[i].isEmpty())
                    idPreRequisito[i] = "No tiene pre-requisitos";
                nt++;
                JOptionPane.showMessageDialog(null, "Se registraron los datos con exito. Ahora existen " + nt + "/"
                        + capacidadCursos + " cursos registrados");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ya no puede registrar mas datos. Existen " + nt + "/" + capacidadCursos + " cursos registrados.");
        }
        return nt;
    }

    public static void modificarDatos(int capacidadCursos, String idCurso[], String nombreCurso[], int numeroCreditos[],
            int ciclo[], String idPreRequisito[]) {
        int posicionBusqueda = -1;
        String valorBusqueda = JOptionPane.showInputDialog("Ingresar el ID del curso que desea modificar.");
        valorBusqueda = valorBusqueda.toUpperCase();
        for (int i = 0; i < capacidadCursos; i++) {
            if (idCurso[i].compareTo(valorBusqueda) == 0) {
                posicionBusqueda = i;
                i = capacidadCursos;
            }
        }
        if (posicionBusqueda == -1) {
            JOptionPane.showMessageDialog(null, "El ID del curso ingresado no existe.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Se ha encontrado el ID del curso ingresado. Aceptar para modificar los datos del curso.");
            do {
                nombreCurso[posicionBusqueda] = JOptionPane.showInputDialog("Ingresar el Nombre del Curso");
            } while (nombreCurso[posicionBusqueda].length() > 50);
            do {
                numeroCreditos[posicionBusqueda] = Integer
                        .parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de creditos del Curso"));
            } while (numeroCreditos[posicionBusqueda] == 0);
            do {
                ciclo[posicionBusqueda] = Integer
                        .parseInt(JOptionPane.showInputDialog("Ingresar el ciclo al que pertenece el curso"));
            } while (ciclo[posicionBusqueda] == 0);
            idPreRequisito[posicionBusqueda] = JOptionPane
                    .showInputDialog("Ingresar el ID de pre requisito. Si no tiene dejar en blanco.");
            if (idPreRequisito[posicionBusqueda].isEmpty())
                idPreRequisito[posicionBusqueda] = "No tiene pre-requisitos";
            JOptionPane.showMessageDialog(null, "Se modificaron los datos del curso con exito.");
        }
    }

    public static int eliminarDatos(int nt, String idCurso[], String nombreCurso[], int numeroCreditos[], int ciclo[],
            String idPreRequisito[]) {
        int posicionBusqueda = -1;
        String idBusqueda = JOptionPane.showInputDialog("Ingresar el ID del curso que desea eliminar.");
        for (int i = 0; i < nt; i++) {
            if (idCurso[i].compareTo(idBusqueda) == 0) {
                posicionBusqueda = i;
                i = nt;
            }
        }
        if (posicionBusqueda == -1) {
            JOptionPane.showMessageDialog(null, "El ID del curso ingresado no existe.");
        } else {
            idCurso[posicionBusqueda] = idCurso[nt - 1];
            nombreCurso[posicionBusqueda] = nombreCurso[nt - 1];
            numeroCreditos[posicionBusqueda] = numeroCreditos[nt - 1];
            ciclo[posicionBusqueda] = ciclo[nt - 1];
            idPreRequisito[posicionBusqueda] = idPreRequisito[nt - 1];
            nt--;
            JOptionPane.showMessageDialog(null, "Se elimino los datos del curso con exito.");
        }
        return nt;
    }

    public static void consultarNombre(int nt, String idCurso[], String nombreCurso[], int numeroCreditos[],
            int ciclo[], String idPreRequisito[]) {
        int posicionBusqueda = -1;
        String nombreBusqueda = JOptionPane.showInputDialog("Ingresar el Nombre del curso que desea buscar.");
        for (int i = 0; i < nt; i++) {
            if (nombreCurso[i].compareTo(nombreBusqueda) == 0) {
                posicionBusqueda = i;
                i = nt;
            }
        }
        if (posicionBusqueda == -1) {
            JOptionPane.showMessageDialog(null, "El Nombre del curso ingresado no existe.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nombre: " + nombreCurso[posicionBusqueda] + "\n" + "ID: " + idCurso[posicionBusqueda] + "\n"
                            + "Numero de creditos: " + numeroCreditos[posicionBusqueda] + "\n" + "Ciclo: "
                            + ciclo[posicionBusqueda] + "\n" + "Id Pre-requisitos: "
                            + idPreRequisito[posicionBusqueda]);
        }
    }

    public static void consultarCiclo(int nt, String idCurso[], String nombreCurso[], int numeroCreditos[], int ciclo[],
            String idPreRequisito[]) {
        int posicionBusqueda = -1;
        int cicloBusqueda = Integer
                .parseInt(JOptionPane.showInputDialog("Ingresar el Nombre del curso que desea buscar."));
        for (int i = 0; i < nt; i++) {
            if (ciclo[i] == cicloBusqueda) {
                posicionBusqueda = i;
                i = nt;
            }
        }
        if (posicionBusqueda == -1) {
            JOptionPane.showMessageDialog(null, "El Ciclo del curso ingresado no existe.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ciclo: " + ciclo[posicionBusqueda] + "\n" + "ID: " + idCurso[posicionBusqueda] + "\n" + "Nombre: "
                            + nombreCurso[posicionBusqueda] + "\n" + "Numero de creditos: "
                            + numeroCreditos[posicionBusqueda] + "\n" + "Id Pre-requisitos: "
                            + idPreRequisito[posicionBusqueda]);
        }
    }
}
