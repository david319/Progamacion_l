package Semana2;

import java.util.Scanner;

public class Lara_David_Horas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("-----Segundos a Horas, Minutos y Segundos-----");

        System.out.print("Ingrese los segundos: ");
        int segundos = leer.nextInt();

        int horas = (segundos / 3600);
        int minutos = ((segundos / 60) - 60);
        int sRestantes = (segundos % 60); // "sRestantes" Se refiere a los segundos restantes

        if (segundos <= 0) { // Comprobamos que el numero ingresado no sea un negativo y que no sea 0
            System.out.println("¡No se permite ese valor!");

        } else // Si el valor del número es válido se mostrara en pantalla los datos correspondientes
            System.out.printf(">>%d hora(s) >> %d minutos >> %d segundos <<", horas, minutos, sRestantes);

    }

}
