package TareaClases;

import java.util.Scanner;
import static TareaClases.Empresa.*;

public class Main {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("""
                    1. Agregar empleado
                    2. listar empleados
                    3. Pagar empleado
                    4. Asignar horas
                    5. Salir
                    Ingrese una opción:""");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> agregarEmpleado();
                case 2 -> getEmpleados();
                case 3 -> pagarEmpleado();
                case 4 -> agregarHoras();
                case 5 -> {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
            }
        } while (true);

    }

}

