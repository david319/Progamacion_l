package Semana4;

import java.util.Objects;
import java.util.Scanner;

public class Lara_David_Prueba2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("---------Clasificador de Videojuegos---------");
        System.out.print("Ingrese la cantidad de juegos que tiene: ");
        int cJuegos = leer.nextInt(); // Cantidad de juegos
        int jPs5 = 0, jXbox = 0, jWii = 0; //juegos de PS5, Xbox, Wii

        int contador = 0;

        do{ // ciclo para ingresar los juegos
            contador++; // contador para saber en qué juego estoy
            System.out.print("Ingrese el tipo del juego " + contador + ": ");
            String tipo = leer.next(); // Se almacena la cantidad de juegos de cada tipo

            if (Objects.equals(tipo, "ps5") || Objects.equals(tipo,"PS5")){ // si el tipo es PS5
                jPs5++; // aumento en 1 el contador de PS5

            } else if (Objects.equals(tipo, "xbox") || Objects.equals(tipo,"Xbox")) { // si el tipo es Xbox
                jXbox++; // aumento en 1 el contador de Xbox

            } else if (Objects.equals(tipo, "wii") || Objects.equals(tipo,"Wii")) { // si el tipo es Wii
                jWii++; // aumento en 1 el contador de Wii

            } else { // si no es ninguno de los anteriores marca error Y vuelve a preguntar
                System.out.println("El tipo de juego ingresado no es valido");
                contador--; // resta uno al contador para que no se sume el juego que no es válido
            }

        } while (contador < cJuegos); // mientras el contador sea menor a la cantidad de juegos


        System.out.printf("""
                La Cantidad de Juegos de PS5 son: %d
                La Cantidad de Juegos de XBOX son: %d
                La Cantidad de Juegos de WII son: %d""", jPs5, jXbox, jWii); // imprime los resultados

    }

}
