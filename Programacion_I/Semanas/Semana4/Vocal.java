package Semana4;

import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");

        System.out.println("Palabra: ");
        String palabra = leer.next();

        //Do While
        int i = 0;
        do {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                System.out.println("La letra " + palabra.charAt(i) + " es una vocal");
            }

        } while (i < palabra.length());

    }

}
