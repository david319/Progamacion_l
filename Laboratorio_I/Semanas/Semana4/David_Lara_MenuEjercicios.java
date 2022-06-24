package Semana4;

import javax.swing.*;
import java.util.Scanner;

public class David_Lara_MenuEjercicios {

    public static void main(String[] args) {

        System.out.println("---- Bienvenido al Menu Interactivo ----");

        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    Que ejercicio desea realizar?
                    1- Ejercicio Ciclo
                    2- Ejercicio Suma
                    3- Ejercicio Vocal
                    4- Salir
                    Seleccione una opción:""");
            int opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println("Introduzca la cantidad de numeros que desee el programa se detendrá cuando " +
                        "introduzca un numero negativo");

                System.out.println("Introduzca un numero: ");
                int numero = leer.nextInt();

                int contador = 0;
                int suma = 0;
                String numerosI = "";

                while (numero > 0) {
                    suma += numero;
                    numerosI += numero + " "; //
                    System.out.print("Introduzca un numero: ");
                    numero = leer.nextInt();
                    contador++;
                    float promedio = (float) suma/contador;

                    if (numero < 0) {
                        contador--;
                        System.out.printf("""
                                La suma de los números introducidos es: %d
                                Los números introducidos son: %s
                                El promedio de los números es: %.2f
                                """, suma, numerosI, promedio);

                        break;

                    }

                }
            } else if (opcion == 2) {

                System.out.println("Introduzca los números que desea sumar *NO se tomara en cuenta los negativos*");
                System.out.print("Introduzca un numero: ");
                int numero = leer.nextInt();
                int suma = 0;
                String numerosI = "";

                while (numero > 0) {
                    suma += numero;
                    numerosI += numero + "+";
                    System.out.print("Introduzca un numero: ");
                    numero = leer.nextInt();
                    if (numero < 0) {
                        System.out.printf("""
                                Las suma de los números introducidos es: %s\b= %d
                                """,numerosI, suma);

                    }
                }
            }else if (opcion == 3) {

                System.out.print("Introduzca una palabra o Oración: ");
                String cadena = leer.nextLine();
                int a = 0, e = 0, i = 0, o = 0, u = 0;

                for (int x = 0; x < cadena.length(); x++) {
                    char actual = cadena.toLowerCase().charAt(x);

                    switch (actual) {
                        case 'a', 'A' -> a++;
                        case 'e', 'E' -> e++;
                        case 'i', 'I' -> i++;
                        case 'o', 'O' -> o++;
                        case 'u', 'U' -> u++;
                        default -> {
                        }
                    }
                }

                System.out.println("***** Vocales ******");
                System.out.println("Cantidad de a: " + a);
                System.out.println("Cantidad de e: " + e);
                System.out.println("Cantidad de i: " + i);
                System.out.println("Cantidad de o: " + o);
                System.out.println("Cantidad de u: " + u);

            }else if (opcion == 4) {
                break;

            }
        }
    }
}