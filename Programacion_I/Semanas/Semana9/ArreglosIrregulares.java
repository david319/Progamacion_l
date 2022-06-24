package Semana9;

import java.util.Scanner;

public class ArreglosIrregulares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas que desea:");
        int filas = leer.nextInt();
        int numeros [] [] = new int [filas] [];

        for (int i = 0; i < filas; i++) {
            System.out.println("Ingrese el numero de columnas que desea en la fila [" + i + "]:");
            int columnas = leer.nextInt();
            numeros[i] = new int [columnas];
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingrese el numero que desea en la posición [" + i + "][" + j + "]:");
                numeros[i][j] = leer.nextInt();
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println("");
            for(int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + "\t");
            }
        }
    }
}
