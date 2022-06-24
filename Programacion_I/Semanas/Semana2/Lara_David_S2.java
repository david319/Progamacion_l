package Semana2;

import java.util.Scanner;

public class Lara_David_S2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("**** P R O M E D I O   A L U M N O ****\n");

        System.out.print("Introduzca el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();

        System.out.print("Introduzca nombre completo: ");
        String nombre = leer.next();

        System.out.print("Introduzca la carrera: ");
        String carrera = leer.next();

        System.out.print("Introduzca nota 1: ");
        float nota1 = leer.nextFloat();

        System.out.print("Introduzca nota 2: ");
        float nota2 = leer.nextFloat();

        System.out.print("Introduzca nota 3: ");
        float nota3 = leer.nextFloat();

        float promedioAlumno = (nota1 + nota2 + nota3) / 3;

        System.out.print("\n**** D A T O S   P R O M E D I O   A L U M N O ****");

        System.out.print("\nNumero de cuenta: " + numeroCuenta + "\nNombre completo: " + nombre +  "\nCarrera: " + carrera
        + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\nPromedio Final: " + promedioAlumno + "%"
              +  "\n");


        System.out.print("\n**** C U E S T I O N A R I O  V I R T U A L ****\n");

        System.out.print("Ingrese nombre del postulante: ");
        String nombrePostulante = leer.next();

        System.out.print("Ingrese respuestas correctas: ");
        int respuestasCorrectas = leer.nextInt();

        System.out.print("Ingrese respuestas Incorrectas: ");
        int respuestasIncorrectas = leer.nextInt();

        System.out.print("Ingrese respuestas en blanco: ");
        int respuestasBlanco = leer.nextInt();

        int tRespuestasC = respuestasCorrectas * 5;
        int puntajeFinal = tRespuestasC - respuestasIncorrectas;

        System.out.print("\n**** R E S U L T A D O  C U E S T I O N A R I O  V I R T U A L ****");


        System.out.print("\nNombre del Postulante: " + nombrePostulante + "\nRespuestas correctas: " + respuestasCorrectas
        + "\nRespuestas incorrectas: " + respuestasIncorrectas + "\nRespuestas en blanco: " + respuestasBlanco + "\nPuntaje Final: "
        + puntajeFinal);

    }

}
