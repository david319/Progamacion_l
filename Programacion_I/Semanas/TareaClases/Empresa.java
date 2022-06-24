package TareaClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static final ArrayList<Empleado> empleados =new ArrayList<>();

    public static void agregarEmpleado(){
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = leer.next();
        int horas = 0;
        double sueldo = 0.00;
        Empleado empleado = new Empleado(nombre, horas, sueldo);
        empleados.add(empleado);
    }

    public static void getEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public static void agregarHoras() {
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = leer.next();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                System.out.println("Ingrese las horas trabajadas: ");
                int horas = leer.nextInt();
                empleado.setHoras(horas);
            } else {
                System.out.println("El empleado no existe");
            }
        }
    }

    public static boolean pagarEmpleado () {
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = leer.next();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                int sueldo = empleado.getHoras() * 100;
                empleado.setSueldo(sueldo);
                return true;
            }
        }
        return false;
    }


}


