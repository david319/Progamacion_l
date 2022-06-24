package Semana6;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamaño = sc.nextInt();

        int[] arreglo = new int[tamaño]; // Declaración del arreglo uno

        for (int i = 0; i < arreglo.length; i++) { // Ciclo para llenar el arreglo
            System.out.println("Ingrese el valor del arreglo 1[" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }

        int[] arreglo2 = new int[tamaño]; // Declaración del arreglo dos

        for (int i = 0; i < arreglo2.length; i++) { // Ciclo para llenar el arreglo
            System.out.println("Ingrese el valor para el arreglo 2[" + i + "]: ");
            arreglo2[i] = sc.nextInt();
        }

        // Suma de arrays
        int[] suma = new int[tamaño]; // Declaración del arreglo para sumar

        for (int i = 0; i < suma.length; i++) { // Ciclo para sumar los arreglos
            suma[i] = arreglo[i] + arreglo2[i];
            System.out.println("suma de arreglo[" + i + "]: " + suma[i]);
        }
    }
}
