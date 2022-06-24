package Semana4;

import java.util.Scanner;

public class Lara_David_Prueba_Lab1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;


        while (true) {
            System.out.println("------Menu Interactivo------");
            System.out.print("""
                    1- Tabla de Multiplicación
                    2- Palíndroma y Vocal
                    3- Mayor y menor Ingresados
                    4- Numero Al revés
                    5- Salir
                    Ingrese una Opción:""");
            int opcion = leer.nextInt();

            if (opcion == 1) {

                menu1++;
                System.out.println("-----Tabla de Multiplicación-----");
                System.out.print("Ingrese un número: ");
                int numero = leer.nextInt();

                for (int i = 1; i <= 10; i++) { //for para imprimir la tabla de multiplicación
                    System.out.println(numero + " x " + i + " = " + (numero * i));

                }

            } else if (opcion == 2) {
                menu2++;
                System.out.println("-----Palíndroma y Vocal-----");
                System.out.print("Ingrese una palabra: ");
                String palabra = leer.next();
                String invertir = "";
                int contador;
                int a = 0, e = 0, i = 0, o = 0, u = 0;
                String palabra2 = palabra.toLowerCase(); //Para que no sean mayúsculas

                for (contador = palabra2.length() - 1; contador >= 0; contador--) { //for para invertir la palabra
                    invertir += palabra2.charAt(contador);

                }

                if (invertir.equals(palabra2)) { //if para verificar si es palíndroma
                    System.out.println("La palabra " + palabra2 + " es palíndroma");

                } else {
                    System.out.println("La palabra " + palabra2 + " no es palíndroma");

                }

                for (int x = 0; x < palabra2.length(); x++) { // for para verificar si tiene vocal
                    char cVocales = palabra2.charAt(x);

                    switch (cVocales) { // switch para contar las vocales
                        case 'a' -> a++;
                        case 'e' -> e++;
                        case 'i' -> i++;
                        case 'o' -> o++;
                        case 'u' -> u++;
                        default -> {
                        }
                    }
                }
                System.out.printf("""
                        Cantidad de a: %d
                        Cnatidad de e: %d
                        Cantidad de i: %d
                        Cantidad de o: %d
                        Cantidad de u: %d
                        """, a, e, i, o, u);

            } else if (opcion == 3) {
                menu3++;
                System.out.println("-----Mayor y Menor Ingresados-----");
                System.out.print("¿Cuantos números desea ingresar?: ");
                int numero = leer.nextInt();

                int[] array = new int[numero]; // array para ingresar los números

                for (int i = 0; i < array.length; i++) { // for para ingresar los números
                    System.out.print("Ingrese dato " + (i + 1) + ": ");
                    array[i] = leer.nextInt();
                }

                int mayor, menor; // variables para guardar el mayor y menor
                mayor = menor = array[0];// inicializar el mayor y menor con el primer valor del array

                for (int i = 0; i < array.length; i++) { // for para verificar el mayor y menor
                    if (array[i] > mayor) {
                        mayor = array[i];
                    }
                    if (array[i] < menor) { // si el valor del array es menor al menor, se guarda en el menor
                        menor = array[i];
                    }
                }
                System.out.println("El mayor valor es: " + mayor);
                System.out.println("El menor valor es: " + menor);

            } else if (opcion == 4) {
                menu4++;
                System.out.println("-----Numero Al revés-----");
                System.out.print("Ingrese un número: ");
                int numero = leer.nextInt();

                int invertido = 0, resto; // variables para guardar el número al revés y el resto

                while (numero > 0) {
                    resto = numero % 10;
                    invertido = invertido * 10 + resto;
                    numero /= 10;
                }

                System.out.println("Número invertido: " + invertido);

            } else if (opcion == 5) {
                System.out.printf("""
                        Se ingreso: %d vez al menu 1
                        Se ingreso: %d vez al menu 2
                        Se ingreso: %d vez al menu 3
                        Se ingreso: %d vez al menu 4
                        """, menu1, menu2, menu3, menu4);
                break;

            }

        }

    }

}
