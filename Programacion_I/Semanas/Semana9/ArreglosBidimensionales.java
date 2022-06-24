package Semana9;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosBidimensionales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] numeros = new int[3][5];

        for (int i = 0; i < numeros.length; i++) { // Filas
            for (int j = 0; j < numeros[i].length; j++) { // Columnas
                System.out.println("Ingrese el valor de la posición [" + i + "][" + j + "]");
                numeros[i][j] = leer.nextInt();
            }
        }

        // imprimir el tablero
        for (int i = 0; i < numeros.length; i++) { // Filas
            int suma = 0; // suma de la fila
            for (int j = 0; j < numeros[i].length; j++) { // Columnas
                System.out.print(numeros[i][j] + "\t"); // Imprimir el valor de la posición
                suma += numeros[i][j];
            }
            System.out.println("= " + suma); // Imprimir la suma de la fila
        }

        // Imprimir la suma de cada fila
        for (int i = 0; i < numeros.length; i++) { // Filas
            int suma = 0; // Suma de la fila
            for (int j = 0; j < numeros[i].length; j++) { // Columnas
                suma += numeros[i][j]; // Sumar el valor de la posición
            }
            System.out.println("Suma de la fila " + i + " = " + suma); // Imprimir la suma de la fila
        }


    }
}
