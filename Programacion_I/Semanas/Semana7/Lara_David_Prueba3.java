package Semana7;

import java.util.Scanner;

public class Lara_David_Prueba3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Declaración de variables
        int[] numeros = new int[10];
        int[] par = new int[10];
        int[] impar = new int[10];
        int pares = 0;
        int impares = 0;

        System.out.println("------ Ejercicio #1 ------");
        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i < numeros.length; i++) { // Pide los números al usuario
            System.out.println("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }

        System.out.println("\n Numeros ingresados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero[" + i + "] = " + numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) { // Para cada número
            if (numeros[i] % 2 == 0) { // Si el numero es par
                par[pares++] = numeros[i]; // Agregarlo al arreglo de números pares
            } else { // Si el numero es impar
                impar[impares++] = numeros[i]; // Agregarlo al arreglo de números impares
            }
        }

        for (int i = 0; i < pares; i++) {  //
            numeros[i] = par[i]; // Copiar los números pares al arreglo de números
        }

        for (int i = 0; i < impares; i++) { // Verificar los números impares
            numeros[i + pares] = impar[i]; // Copiar los números impares al arreglo de números
        }

        System.out.println("\nNúmeros ordenados en pares e impares: ");
        for (int i = 0; i < numeros.length; i++) { // Imprimir los números ordenados
            System.out.println("Numero[" + i + "] = " + numeros[i]);
        }

        System.out.println("\n------ Ejercicio #2 ------");
        System.out.println("Ingrese el tamaño de los arreglos: ");
        int tam = leer.nextInt();

        // Declaración de variables
        int[] arregloA = new int[tam]; // Arreglo A
        int[] arregloB = new int[tam]; // Arreglo B
        int[] arregloC = new int[tam]; // Arreglo C para almacenar el resultado

        System.out.println("\nIngrese los valores del primer arreglo: ");
        for (int i = 0; i < arregloA.length; i++) { // Pide los números al usuario
            System.out.println("Ingrese el valor del arreglo 1: ");
            arregloA[i] = leer.nextInt();
        }

        System.out.println("\nIngrese los valores del segundo arreglo: ");
        for (int i = 0; i < arregloB.length; i++) { // Pide los números al usuario
            System.out.println("Ingrese el valor del arreglo 2: ");
            arregloB[i] = leer.nextInt();
        }

        for (int i = 0; i < arregloA.length; i++) { // Para cada número
            for (int j = 0; j < arregloB.length; j++) { // Para cada número del segundo arreglo
                if (arregloA[i] != arregloB[j]) { // Si los números son diferentes
                    arregloC[i] = arregloA[i]; // Copiar los números que no están en el arregloB al arregloC
                }
            }
        }

        for (int i = 0; i < arregloC.length; i++) { // Para cada número
            if (arregloC[i] != 0) { // Si el número no es 0
                System.out.println("El número " + arregloC[i] + " no está en el arreglo B");
            }
        }
    }
}
