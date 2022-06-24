package TareaClases;

public class Empleado {

    private String nombre;
    private int horas;
    private double sueldo;

    public Empleado(String nombre, int horas, double sueldo) {
        this.nombre = nombre;
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nHoras: " + horas + "\nSueldo: " + sueldo;
    }

}