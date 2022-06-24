package Semana5;

import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Juego del ahorcado

        char letra; //

        while (true) {

            int intentos = 5; // inicializamos el contador de intentos

            System.out.println("Bienvenido al juego del ahorcado");

            String[] palabras = new String[7];
            palabras[0] = "cuidar";
            palabras[1] = "azulejo";
            palabras[2] = "copa";
            palabras[3] = "zapato";
            palabras[4] = "llanta";
            palabras[5] = "mojado";
            palabras[6] = "pintura";


            String palabraOculta = "";

            String palabra = palabras[(int) (Math.random() * palabras.length)];


            for (int i = 0; i <= palabra.length() - 1; i++) { // Ocultamos la palabra
                palabraOculta += "_"; // con guiones
            }

            do { // bucle do-while para que se repita el juego
                System.out.println(palabraOculta);
                System.out.print("Ingrese una letra: ");
                letra = leer.next().toLowerCase().charAt(0); // leemos la letra

                for (int i = 0; i < palabra.length(); i++) { // Recorro la palabra
                    if (palabra.charAt(i) == letra) { // Si la letra ingresada es igual a la letra de la palabra
                        palabraOculta = palabraOculta.substring(0, i) + letra + palabraOculta.substring(i + 1); // Se reemplaza la letra por la letra ingresada
                    }

                }
                if (palabraOculta.indexOf(letra) == -1) { // Si la letra ingresada no está en la palabra
                    intentos--; // Se resta un intento
                    System.out.println("La letra ingresada no esta en la palabra");
                    System.out.println("Te quedan " + intentos + " intentos");
                }

            } while (palabraOculta.contains("_") && intentos > 0) ; // Mientras la palabra tenga guiones y el contador de intentos sea mayor a 0

            if (intentos == 0) { // Si el contador de intentos es 0
                System.out.println("Perdiste");
                    System.out.println("La palabra era: " + palabra);
            } else { // Si el contador de intentos es mayor a 0
                System.out.println("¡Felicidades, ganaste!");
                System.out.println("La palabra es: " + palabra);
            }

            System.out.println("¿Desea jugar de nuevo? (s/n)");
            String respuesta = leer.next();
            if (respuesta.equals("n")) {
                System.out.println("¡Gracias por jugar!");
                for (String i :palabras) {
                    System.out.println("Palabras ocultas posibles: "+ i);
                }
                break;
            } else{
                palabra = palabras[(int) (Math.random() * palabras.length)];
            }
        }
    }
}
