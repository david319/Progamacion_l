import java.util.Scanner;

public class MayorDeDosNumeros {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = leer.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = leer.nextInt();

        System.out.print("El mayor es: " + (Math.max(num1, num2)));

    }

}
