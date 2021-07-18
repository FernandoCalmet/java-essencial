package Excercises.POO.UPAO.Universidad.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DocenteNombrado extends TrabajadorDocente {
    private double comision; // tutoria, investigacion, calidad, etc.

    public DocenteNombrado(String id, String nombres, int edad, String especialidad, double sueldo, double comision) {
        super(id, nombres, edad, especialidad);
        super.setSueldo(sueldo);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "DocenteNombrado{" + "sueldo=" + super.getSueldo() + ", comision=" + comision + '}';
    }
}
