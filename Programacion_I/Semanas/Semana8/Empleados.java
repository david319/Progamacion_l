package Semana8;

public class Empleados {

    // Atributos
    private int codigo;
    private static String nombre;
    private float horas;

    public Empleados(int code, String name) {
        this.codigo = code;
        this.nombre = name;
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

    public static String getNombre() {
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

