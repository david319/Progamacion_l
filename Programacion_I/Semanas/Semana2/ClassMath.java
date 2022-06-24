package Semana2;


import java.util.Scanner;

public class ClassMath {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe un numero decimal: ");
        double numero= leer.nextDouble();

        System.out.println("Originalmente el número es: " + numero);

        /*Redondeo Normal si el decimal es 1.5 pasa a 2
         * si el decimal es 1.4 se redondea hacia abajo es decir pasa a 1 */
        System.out.println("Con round: " + Math.round(numero));

        /* Forzar que el decimal 1.9 como 1.1
         se convierten en 1 (Hacia abajo) */
        System.out.println("Con floor: " + Math.floor(numero));

        /* Lo contrario de floor. Forzar hacia arriba. Tanto
         1.1 como 1.9 suben a 2 */
        System.out.println("Con ceil: " + Math.ceil(numero));

    }
}

