package Semana10;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        try {
            System.out.println("Ingrese un numero: ");
            int numero = leer.nextInt();
            System.out.println("El numero es: " + numero);
        } catch (Exception e) {
            System.out.println("Error: Tiene que ingresar un numero");
        }


    }

}
