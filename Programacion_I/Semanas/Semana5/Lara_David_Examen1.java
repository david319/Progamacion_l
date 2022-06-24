package Semana5;

import java.util.Scanner;

public class Lara_David_Examen1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.println("------ MENU DE EJERCICIOS ------");
            System.out.print("""
                    1- Tipo V & F
                    2- String Mayor
                    3- Enee
                    4- Salir
                    Ingrese el ejercicio que desea:""");
            int opcionP = leer.nextInt();

            String palabraMayor = "";
            String palabra;
            float subtotal = 0;
            float tasaSeguridad = 0;
            float total = 0;
            String continuar;

            switch (opcionP) {
                case 1:
                    System.out.println("------ TIPO V & F ------");
                    System.out.println("Para responder las preguntas se ingresa V si es verdadero y F si es falso");
                    System.out.println("Si ejecuto “hola”.charAt(1 ) me devolverá el carácter h?");
                    String respuesta1 = leer.next();
                    respuesta1 = respuesta1.toLowerCase();
                    System.out.println("Todas las clausulas a poner dentro de un switch comienzan con la palabra case?");
                    String respuesta2 = leer.next();
                    respuesta2 = respuesta2.toLowerCase();
                    System.out.println("La instrucción continue no hace que un ciclo termine pero ignora el código restante?");
                    String respuesta3 = leer.next();
                    respuesta3 = respuesta3.toLowerCase();
                    System.out.println("Si yo tengo la instrucción n += n * b, de forma extendida esto será n= n + n*b?");
                    String respuesta4 = leer.next();
                    respuesta4 = respuesta4.toLowerCase();
                    System.out.println("Si int a = 10, b= 50; y String c = “Daniel”; si tengo una condición booleana:\n" +
                            "IF((a > 0 && b <= 50) || c.length() >= 6)), su valor resultante es false?");
                    String respuesta5 = leer.next();
                    respuesta5 = respuesta5.toLowerCase();

                    respuesta1 = (respuesta1.equals("v")) ? "Correcto" : (respuesta1.equals("f")) ? "Incorrecto, ya que el carácter que devolverá es O, ya que la H es el carácter 0"
                            : "No es una respuesta válida";
                    respuesta2 = (respuesta2.equals("v")) ? "Correcto" : (respuesta2.equals("f")) ? "Incorrecto, todas las clausulas de un Switch comienzan con Case"
                            : "No es una respuesta válida";
                    respuesta3 = (respuesta3.equals("v")) ? "Correcto" : (respuesta3.equals("f")) ? "Incorrecto, ya que la instrucción continue no hace que un ciclo termine pero ignora el código restante"
                            : "No es una respuesta válida";
                    respuesta4 = (respuesta4.equals("v")) ? "Correcto" : (respuesta4.equals("f")) ? "Incorrecto, ya que si yo tengo la instrucción n += n * b, de forma extendida esto será n= n + n*b"
                            : "No es una respuesta válida";
                    respuesta5 = (respuesta5.equals("v")) ? "Correcto" : (respuesta5.equals("f")) ? "Incorrecto, ya que todos los resultados son true"
                            : "No es una respuesta válida";

                    System.out.printf("""
                            Respuesta 1: %s
                            Respuesta 2: %s
                            Respuesta 3: %s
                            Respuesta 4: %s
                            Respuesta 5: %s
                            """, respuesta1, respuesta2, respuesta3, respuesta4, respuesta5);
                    break;

                case 2:
                    System.out.println("------ STRING MAYOR ------");
                    System.out.print("Cuantas palabras desea introducir: ");
                    int numeroPalabras = leer.nextInt();

                    for (int i = 0; i < numeroPalabras; i++) {
                        System.out.print("Ingrese la palabra " + (i + 1) + ": ");
                        palabra = leer.next();
                        if (palabra.length() > palabraMayor.length()) {
                            palabraMayor = palabra;

                        }
                    }
                    System.out.println("La palabra mayor es: " + palabraMayor);
                    break;

                case 3:

                    do {

                        System.out.println("------ Enee ------");
                        System.out.println("Calculo de Impuesto sobre la renta");
                        System.out.print("""
                                1- MAESTRO
                                2- INGENIERO
                                3- OBRERO
                                Ingrese el tipo de empleado:""");
                        int tipoEmpleado = leer.nextInt();
                        System.out.print("Ingrese el salario anual: ");
                        float salarioAnual = leer.nextFloat();

                        if (tipoEmpleado == 1) {
                           subtotal = (salarioAnual > 50000) ? salarioAnual + 1000 : 0;
                           subtotal = subtotal + salarioAnual;
                            tasaSeguridad = (float) (subtotal * 0.3);
                            total = subtotal + tasaSeguridad;

                        } else if (tipoEmpleado == 2) {
                            subtotal = (salarioAnual <= 12000) ? (float) (salarioAnual * 0.01) : (salarioAnual > 12000) ? (salarioAnual * 0.03f) : (salarioAnual > 50000) ? (salarioAnual + 15000) : 0;
                            subtotal = subtotal + salarioAnual;
                            tasaSeguridad = (float) (subtotal * 0.3);
                            total = subtotal + tasaSeguridad;

                        } else if (tipoEmpleado == 3) {
                            subtotal = (salarioAnual <= 12000) ? (float) (salarioAnual * 0.005) : (float) ((salarioAnual > 12000) ? (salarioAnual * 0.02) : (salarioAnual > 50000) ? (salarioAnual + 10000) : 0);
                            tasaSeguridad = (float) (subtotal * 0.3);
                            total = subtotal + tasaSeguridad;

                        } else {
                            System.out.println("No es una opción válida");
                        }
                        System.out.printf("""
                                Tipo de Empleado: %d
                                Subtotal: %.2f
                                Tasa de seguridad: %.2f
                                Total: %.2f
                                """, tipoEmpleado, subtotal, tasaSeguridad, total);
                        System.out.println("Desea continuar? (s/n)");
                        continuar = leer.next();
                        if (continuar.equals("n")) {
                            break;
                        }

                    } while (continuar.equals("s"));

                case 4:
                    System.exit(0);
            }
        }
    }


}
