package Excercises.POO.UPAO.Universidad.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DocenteContratado extends TrabajadorDocente {
    public DocenteContratado(String id, String nombres, int edad, String especialidad, int nroHorasSemanal,
            double pagoHora, double pagoExtra, double sueldo) {
        super(id, nombres, edad, especialidad, nroHorasSemanal, pagoHora, pagoExtra, sueldo);
    }
}
