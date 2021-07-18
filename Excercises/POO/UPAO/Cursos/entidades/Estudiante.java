package Excercises.POO.UPAO.Cursos.entidades;

public class Estudiante {
    private int id;
    private String nombres;
    private int edad;
    private int ciclo;

    public Estudiante() {
    }

    public Estudiante(int id, String nombres, int edad, int ciclo) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.ciclo = ciclo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombres=" + nombres + ", edad=" + edad + ", ciclo=" + ciclo + '}';
    }
}
