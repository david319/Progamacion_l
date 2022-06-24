package Semana1;

import java.util.Scanner;

public class PracticaS1 {
    public static void main(String[] args) {

        //System.out.println("Hola Mundo");

        //comentario en linea
        /*
        comentario en bloque
         */

        /*
        Tipos de Datos
        1-String - Texto            - ? texto.cantidad x 2 bytes
        2-Char - Caracter           - 1 o 2 bytes
        3-Int - Entero Corto        - 4 byte
        4-Long - Entero Largo       - 8 byte
        5-Float - Decimal           - 8 byte
        6-Double - Decimal          - 8 byte
        7-Boolean - Lógico          - 1 byte
        8-Object - Objecto          - ?

        ++Variables
        Sintaxis: 1 - Tipo Dato IdVariable = "Texto o Palabras";
                  2 - Tipo Dato IdVariable;
                  2.1 IdVariable = 12.34;
         */

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();

        System.out.print("Ingrese el nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = leer.nextLine();

        System.out.print("Ingrese la carrera: ");
        String carrera = leer.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();

        System.out.print("Ingrese el promedio: ");
        double promedio = leer.nextFloat();

        System.out.print("Ingrese el estado: ");
        boolean estado = leer.nextBoolean();

        System.out.println("****Datos de Alumnos****");
        System.out.printf("""
                Numero de cuenta: %d
                Nombre: %s
                Apellido: %s
                Carrera: %s
                Edad: %d
                Promedio: %.2f
                Estado: %b
                """, numeroCuenta, nombre, apellido, carrera, edad, promedio, estado);

    }
}

