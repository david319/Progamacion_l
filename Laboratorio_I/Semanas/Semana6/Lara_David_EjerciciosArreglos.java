package Semana6;

import java.util.Scanner;

public class Lara_David_EjerciciosArreglos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("""
                ----------- Menu Ejercicios -----------
                1- Cadena Alfabética
                2- Calificaciones
                3- Cadena Random y Num Mayor-Menor
                4- Numero Mayor-Menor Ingresado
                Ingrese Una opción:\t""");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("------ Cadena Alfabética ------");

                int posicion = 0;
                String cadena = "";

                do {
                    char[] alfabeto = new char[26];
                    alfabeto[0] = 'A';
                    alfabeto[1] = 'B';
                    alfabeto[2] = 'C';
                    alfabeto[3] = 'D';
                    alfabeto[4] = 'E';
                    alfabeto[5] = 'F';
                    alfabeto[6] = 'G';
                    alfabeto[7] = 'H';
                    alfabeto[8] = 'I';
                    alfabeto[9] = 'J';
                    alfabeto[10] = 'K';
                    alfabeto[11] = 'L';
                    alfabeto[12] = 'M';
                    alfabeto[13] = 'N';
                    alfabeto[14] = 'O';
                    alfabeto[15] = 'P';
                    alfabeto[16] = 'Q';
                    alfabeto[17] = 'R';
                    alfabeto[18] = 'S';
                    alfabeto[19] = 'T';
                    alfabeto[20] = 'U';
                    alfabeto[21] = 'V';
                    alfabeto[22] = 'W';
                    alfabeto[23] = 'X';
                    alfabeto[24] = 'Y';
                    alfabeto[25] = 'Z';

                    System.out.println("Ingrese una posición: ");
                    posicion = leer.nextInt();

                    if (!(posicion >= 0 && posicion < 26)) {
                        System.out.println("Error, Inserte otro número");
                    } else {
                        if (posicion != -1) {
                            cadena += alfabeto[posicion];
                        }
                    }
                } while (posicion != -1);
                System.out.println("Cadena Resultante es: " + cadena);
                break;

            case 2:
                System.out.println("------ Calificaciones ------");
                float[] calificaciones = new float[10];
                String[] nombres = new String[10];

                for (int i = 0; i < calificaciones.length; i++) { // Para llenar el arreglo de calificaciones y nombres
                    System.out.print("Ingrese una calificación: ");
                    calificaciones[i] = leer.nextInt();
                    System.out.print("Ingrese un nombre: ");
                    nombres[i] = leer.next();
                }
                for (int i = 0; i < calificaciones.length; i++) { // for para mostrar las calificaciones
                    if (calificaciones[i] == 0 && calificaciones[i] < 5) { // condicional para mostrar las calificaciones
                        System.out.println("El alumno " + nombres[i] + " tiene una calificación de " + calificaciones[i] + " suspenso");
                    } else if (calificaciones[i] == 5 && calificaciones[i] < 7) { // condicional para mostrar las calificaciones
                        System.out.println("El alumno " + nombres[i] + " tiene una calificación de " + calificaciones[i] + " Bien");
                    } else if (calificaciones[i] == 7 && calificaciones[i] < 9) { // condicional para mostrar las calificaciones
                        System.out.println("El alumno " + nombres[i] + " tiene una calificación de " + calificaciones[i] + " Notable");
                    } else if (calificaciones[i] == 9 && calificaciones[i] < 10) { // condicional para mostrar las calificaciones
                        System.out.println("El alumno " + nombres[i] + " tiene una calificación de " + calificaciones[i] + " Sobresaliente");
                    }
                }
                break;

            case 3:
                System.out.println("------ Cadena Random y Números Mayor-Menor ------");

                int[] numeros = new int[20];

                System.out.println("Cadena Random: ");
                for (int i = 0; i < numeros.length; i++) { // Ciclo para ingresar los numeros
                    int aleatorio = (int) (Math.random() * 100); // Genera un numero aleatorio entre 0 y 100
                    numeros[i] = aleatorio; // Se guarda el numero en el arreglo
                    System.out.print(numeros[i] + " "); // Imprime el numero generado
                }
                // ordenamiento de los numeros
                for (int i = 0; i < numeros.length; i++) { // Ciclo para ordenar los numeros
                    for (int j = i + 1; j < numeros.length; j++) { // Ciclo para comparar los numeros
                        if (numeros[i] > numeros[j]) { //
                            int almacenar = numeros[i]; // Variable para guardar el número
                            numeros[i] = numeros[j]; // Se guarda el número en la posición i
                            numeros[j] = almacenar; // Se guarda el número en la posición j
                        }
                    }
                }
                System.out.println("\nNúmeros ordenados: ");
                for (int i = 0; i < numeros.length; i++) { // Ciclo para mostrar los numerous ordenados
                    System.out.print(numeros[i] + " "); // Imprime los números ordenados

                }
                // numero mayor
                int mayor = numeros[0]; // Variable para guardar el número mayor
                for (int i = 0; i < numeros.length; i++) { // Ciclo para comparar los números
                    if (numeros[i] > mayor) { // Si el número es mayor que el número guardado
                        mayor = numeros[i]; // Se guarda el número
                    }
                }
                System.out.println("\nEl número mayor es: " + mayor);

                // numero menor
                int menor = numeros[0]; // Variable para guardar el número menor
                for (int i = 0; i < numeros.length; i++) { // Ciclo para comparar los números
                    if (numeros[i] < menor) { // Si el número es menor que el número menor
                        menor = numeros[i]; // Se guarda el número en la variable menor
                    }
                }
                System.out.println("El número menor es: " + menor);
                break;

            case 4:
                System.out.println("------ Numero Mayor-Menor Ingresado ------");
                System.out.print("Ingrese el tamaño del arreglo: ");
                int tamaño = leer.nextInt(); // Variable para guardar el tamaño del arreglo

                int[] numeros2 = new int[tamaño]; // Arreglo para guardar los números

                for (int i = 0; i < numeros2.length; i++) { // Ciclo para ingresar los números
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    numeros2[i] = leer.nextInt(); // Se guarda el número en el arreglo
                }
                // mayor y veces que se repite
                int mayor2 = numeros2[0]; // Variable para guardar el número mayor
                int veces = 0; // Variable para guardar la cantidad de veces que se repite el número mayor
                for (int i = 0; i < numeros2.length; i++) { // Ciclo para comparar los números
                    if (numeros2[i] > mayor2) { // Si el número es mayor que el número guardado
                        mayor2 = numeros2[i]; // Se guarda el número
                        veces += 1; // Se guarda la cantidad de veces que se repite el número mayor
                    }
                }
                System.out.println("El número mayor es: " + mayor2 + " y se repite " + veces + " veces");

                // menor y veces que se repite
                int menor2 = numeros2[0]; // Variable para guardar el número menor
                int veces2 = 0; // Variable para guardar la cantidad de veces que se repite el número menor
                for (int i = 0; i < numeros2.length; i++) { // Ciclo para comparar los números
                    if (numeros2[i] < menor2) { // Si el número es menor que el número guardado
                        menor2 = numeros2[i]; // Se guarda el número
                        veces2 += 1; // Se guarda la cantidad de veces que se repite el número menor
                    }
                }
                System.out.println("El número menor es: " + menor2 + " y se repite " + veces2 + " veces");
                break;
        }
    }
}
