package Semana6;

import java.util.Scanner;

public class AlfabetoArrays {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }

        String cadena = "";
        int eleccion = -1;

        do {
            System.out.println("Elija un indice entre 0 y " + (mayusculas.length - 1));
            eleccion = leer.nextInt();

            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }
        } while (eleccion != -1);

        System.out.println(cadena);

    }

}
