package Semana2;

import java.util.Scanner;

public class PracticaCondicional {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

     /*
     Operadores Condicionales
     1- If - Else
     2- Switch . Case
     Los resultados lógicos
     1- Verdadero - True
     2- Falso - False

     Pruebas lógicas o condiciones
     IF (prueba lógica){
     Bloque de código True
     }else{
     Bloque de código False
     }
     1- Simple
     2- Varios - And = && / Or = ||
     3- Anidadas - If - else If - else

      */

        //IF - Simple - Varios

       // Declarar
        int numero;

        System.out.print("Ingresar número: ");

        numero = leer.nextInt();

        // Evaluar o tomar desición
        if(numero <= 9 && numero >= 0) {
            System.out.println(numero + " es de un digito");

        }else if(numero >= 10 && numero <= 99) {
            System.out.println(numero + " es de dos digitos");

        }else if(numero >= 100 && numero <= 999) {
            System.out.println(numero + " es de tres digitos");

        }else
            System.out.println(numero + " Error!");


    }

}
