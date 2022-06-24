package Semana3;

import java.util.Scanner;

public class David_Lara_BoletaPago {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("----------------Información del Empleado---------------\n");

        System.out.print("Ingrese código del empleado: ");
        String codigoEmpleado = leer.next();

        System.out.print("Ingrese nombre completo del empleado: ");
        String nombreEmpleado = leer.next();

        System.out.print("Ingrese horas trabajadas: ");
        int horasTrabajadas = leer.nextInt();

        int horasExtras = 0;
        float salarioBase = 0;
        float pHorasDobles = 0; // "pHorasDobles" Sé al pago de las horas extras de forma doble.
        float pHorasTriples = 0; // "pHorasTriples" Sé al pago de las horas extras de forma triple.

        if (horasTrabajadas > 0 && horasTrabajadas <= 40) {
            salarioBase = (float) (horasTrabajadas * 51.53);

        }else if (horasTrabajadas > 40 && horasTrabajadas <= 48) {
            pHorasDobles = (float) ((horasTrabajadas - 40) * 103.06);
            horasExtras = horasTrabajadas - 40;
            salarioBase = (float) ((horasTrabajadas - horasExtras) * 51.53);

        }else if (horasTrabajadas > 48) {
            pHorasDobles = (float) (8 * 103.06);
            pHorasTriples = (float) ((horasTrabajadas - 48) * 154.59);
            horasExtras = horasTrabajadas - 40;
            salarioBase = (float) ((horasTrabajadas - horasExtras) * 51.53);

        } else{
            System.out.println("Valor introducido invalido");

        }

        float salarioNeto = salarioBase + pHorasDobles + pHorasTriples;

        System.out.println("\n----------------Boleta de Pago----------------");
        System.out.printf("""
                Código del empleado: %s
                Nombre Completo del Empleado: %s
                Tiempo Trabajado: %d Horas
                Sueldo Base: %.2f Lps.
                Horas Extras: %d Horas.
                Pago de Doble Horas: %.2f Lps
                Pago de Triple Horas: %.2f Lps
                Sueldo Neto: %.2f Lps""", codigoEmpleado, nombreEmpleado, horasTrabajadas, salarioBase, horasExtras, pHorasDobles,
                pHorasTriples, salarioNeto);

    }
}
