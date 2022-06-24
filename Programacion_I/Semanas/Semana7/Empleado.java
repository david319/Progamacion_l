package Semana7;

public class Empleado {

    // Atributos
    int codigo;
    int edad;
    String nombre, puesto;
    float sueldo;
    private float horas;

    // Constructor
    public Empleado() {

        System.out.println("Constructor#1");
        codigo = 12;
        nombre = "Lara";
        edad = 18;
    }

    // Constructor #2
    public Empleado(int codigo, String nombre, int edad, String puesto) {

        System.out.println("Constructor#2");
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        sueldo = 0;
    }

    // Funciones set & get
    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getHoras() {
        return horas;
    }

    public float getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void imprimir() {
        System.out.println("****** Datos del empleado ******");
        System.out.printf("""
                codigo: %d
                nombre: %s
                horas: %.2f
                """, codigo, nombre, horas);
    }

    public float pagar() {
        float sueldoExtra, sueldo = 0, total = 0;
        if (horas > 40) {
            return (40 * 100) + ((horas - 40) * 200);
        } else{
            return horas * 100;
        }
    }
}
