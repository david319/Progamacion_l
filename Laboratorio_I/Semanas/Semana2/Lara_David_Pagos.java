package Semana2;

import java.util.Scanner;

public class Lara_David_Pagos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("----------------Información del Empleado---------------\n");

        System.out.print("Ingrese código del empleado: ");
        String codigoEmpleado = leer.next();

        System.out.print("Ingrese nombre completo: ");
        String nombreEmpleado = leer.next();

        System.out.print("Ingrese horas trabajadas: ");
        int horasTrabajadas = leer.nextInt();

        System.out.print("""
                Información de Categorías
                Categoría 1 - $40 por hora extra
                Categoría 2 - $50 por hora extra
                Categoría 3 - $85 por hora extra.
                Categoría 4 - $0
                Ingrese Categoría del empleado:\040""");
        int categoriaEmpleado = leer.nextInt();

        int horasExtras = (horasTrabajadas - 40);
        float pHorasExtras = 0; // "sRestantes" Sé al pago de las horas extras
        float salarioBase = (float) ((horasTrabajadas - horasExtras) * 35.99);

        // Comprobamos la categoría del empleado, ya que de esto depende el pago de las horas extras
        if (categoriaEmpleado == 1) {
            pHorasExtras = horasExtras * 40;

        } else if (categoriaEmpleado == 2) {
            pHorasExtras = horasExtras * 50;

        } else if (categoriaEmpleado == 3) {
            pHorasExtras = horasExtras * 85;

        } else if (categoriaEmpleado == 4) {
            pHorasExtras = 0;

        } else { // Si introduce un carácter equivocado mostrara el siguiente mensaje
            System.out.print("¡Categoría indicada inexistente!");

        }

        float salarioNeto = (salarioBase + pHorasExtras); /* Se declara esta variable en esta línea al obtener el valor
                                                             final del pago de las horas extra del empleado */

        System.out.print("\n----------------Boleta de Pago---------------");
        System.out.print("\nCódigo: " + codigoEmpleado + "\nNombre Completo: " + nombreEmpleado + "\nCategoria: " + categoriaEmpleado
                + "\nSalario Base: " + salarioBase + "\nHoras Trabajadas: " + horasTrabajadas + "\nHoras Extra: " + horasExtras
                + "\nSalario Neto: " + salarioNeto);

    }
}
