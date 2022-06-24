package Semana7;

import java.util.Objects;
import java.util.Scanner;

public class Lara_David_JuegoAhorcado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");


        int menuI;
        String menuP;
        String[] usernames = new String[10];
        int[] passwords = new int[10];
        boolean user = false;

        // Juego Ahorcado Palabras
        String[] palabras = new String[10]; // array de palabras
        palabras[0] = "cuidar";
        palabras[1] = "azulejo";
        palabras[2] = "copa";
        palabras[3] = "zapato";
        palabras[4] = "llanta";
        palabras[5] = "mojado";
        palabras[6] = "pintura";
        palabras[7] = "cocina";
        palabras[8] = "chocolate";
        palabras[9] = "arroz";

        do {
            System.out.println("""
                    ------ Menu de Inicio ------
                    1. Iniciar Sesión
                    2. Registrar Usuario
                    3. Salir
                    Ingrese una opción:\t""");
            menuI = leer.nextInt();

            switch (menuI) {
                case 1:
                    System.out.println("Ingrese su nombre de usuario: ");
                    String usuario = leer.next();
                    System.out.println("Ingrese su contraseña: ");
                    int clave = leer.nextInt();
                    for (int i = 0; i < usernames.length; i++) { //Busca el usuario en el arreglo
                        if (Objects.equals(usuario, usernames[i])) { //
                            user = true;
                        } else {
                            user = false;
                        }
                    }
                    for (int i = 0; i < passwords.length; i++) { //Busca la clave en el arreglo
                        if (clave == passwords[i]) {
                            user = true;
                        } else {
                            user = false;
                        }
                    }

                    do {
                        if (user == true) {
                            System.out.println("Bienvenido " + usuario);
                            System.out.println("""
                                    a. Jugar
                                    b. Cambiar Palabras
                                    c. Salir
                                    Ingrese una opción:\t""");
                            menuP = leer.next();

                            switch (menuP) {

                                case "a":
                                    // Juego Ahorcado
                                    char letra; // Variable para almacenar la letra introducida por el usuario

                                    while (true) { // bucle infinito

                                        int intentos = 5; // inicializamos el contador de intentos
                                        System.out.println("Bienvenido al juego del ahorcado");
                                        String palabraOculta = ""; // Variable que almacena la palabra oculta
                                        String palabra = palabras[(int) (Math.random() * palabras.length)]; // Seleccionamos una palabra al azar


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
                                                    System.out.println("¡Le pegaste a un carácter!");
                                                    System.out.println("Intentos restantes: " + intentos);
                                                }

                                            }
                                            if (palabraOculta.indexOf(letra) == -1) { // Si la letra ingresada no está en la palabra
                                                intentos--; // Se resta un intento
                                                System.out.println("La letra ingresada no esta en la palabra");
                                                System.out.println("Te quedan " + intentos + " intentos");
                                            }

                                        } while (palabraOculta.contains("_") && intentos > 0); // Mientras la palabra tenga guiones y el contador de intentos sea mayor a 0

                                        if (intentos == 0) { // Si el contador de intentos es 0
                                            System.out.println("Perdiste");
                                            System.out.println("La palabra era: " + palabra);
                                        } else { // Si el contador de intentos es mayor a 0
                                            System.out.println("¡Felicidades, ganaste!");
                                            System.out.println("La palabra es: " + palabra);
                                            break;
                                        }
                                    }
                                    break;

                                case "b":
                                    System.out.println("Cambiar palabras");
                                    System.out.println("Ingrese la posición de la palabra que desea cambiar:");
                                    int posicion = leer.nextInt();
                                    System.out.println("Ingrese la nueva palabra:");
                                    String nuevaPalabra = leer.next();
                                    palabras[posicion] = nuevaPalabra;
                                    System.out.println("¡Se ha cambiado la palabra con éxito!");
                                    break;

                                case "c":
                                    System.out.println("Cerrando Sesión....");
                                    break;
                            }
                        } else {
                            System.out.println("Usuario o contraseña incorrectos");
                            break;
                        }
                        break;
                    } while (menuP != "c");
                    break;

                case 2:
                    System.out.println("Registro de usuario");
                    System.out.println("Ingrese un nombre de usuario: ");
                    usuario = leer.next();
                    System.out.println("Ingrese una contraseña: ");
                    clave = leer.nextInt();

                    for (int i = 0; i < usernames.length; i++) {
                        if (usernames[i] == null) {
                            usernames[i] = usuario;
                            if (i == 9) {
                                System.out.println("¡Usuario registrado!");
                            }
                        } else if (usernames[i].equals(usuario)) {
                            if (i == 9) {
                                System.out.println("El usuario ya existe");
                            }
                        }
                    }
                    for (int i = 0; i < passwords.length; i++) {
                        if (passwords[i] == 0) {
                            passwords[i] = clave;
                        } else if (passwords[i] != 0) {
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (menuI != 3);

    }
}

