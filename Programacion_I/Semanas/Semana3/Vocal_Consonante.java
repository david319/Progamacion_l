package Semana3;

import java.util.Scanner;

public class Vocal_Consonante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Determinar si la letra es vocal o consonante-----");

        System.out.print("ingrese una letra: ");
        char letra = sc.next().charAt(0);


        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

            System.out.println("la letra " + letra + " es una vocal");

        } else {

            System.out.println("la letra " + letra + " es una consonante");

        }

    }

}
