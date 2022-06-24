package Semana7;

public class Empresa {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        System.out.printf("""
                Código: %d
                Nombre: %s
                Edad: %d
                """, empleado1.codigo, empleado1.nombre, empleado1.edad);

        Empleado empleado2 = new Empleado(14, "David", 18, "Programador");
        empleado2.sueldo = 1000;
        System.out.println("Datos del empleado 2: " + empleado2.nombre + " " + empleado2.puesto + " " + empleado2.sueldo + "$");
    }

}
