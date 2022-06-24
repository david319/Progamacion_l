package CoderByte;

import java.util.Scanner;

public class FirstFactorial {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

    }

}
