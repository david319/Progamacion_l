package Semana9;

import java.util.Scanner;

import static Semana9.Class_Player.*;
import static Semana9.Class_X_O.Jugar;

public class Main_Game {

    // Equipo 5
    // Integrantes: David Lara y Luis Mejia

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        String user2 = null;

        do {
            System.out.println("""
                    ------ Menu de TipTap Toe ------
                    1. Login
                    2. Registro
                    3. Salir
                    Seleccione una opción:""");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------ Iniciar sesión ------");
                    System.out.println("Ingrese su nombre de usuario:");
                    String user = leer.next();
                    System.out.println("Ingrese su contraseña:");
                    String pass = leer.next();
                    login_player(user, pass);

                    if (login_player(user, pass)) {
                        System.out.println("Bienvenido " + user);
                        System.out.println("""
                                1. Jugar
                                2. Cerrar sesión
                                Ingrese una opción:""");
                        int opcionL = leer.nextInt();

                        do {
                            switch (opcionL) {
                                case 1 -> {
                                    System.out.println("Ingrese el nombre del jugador 2:");
                                    user2 = leer.next();
                                    v_Player2(user2);
                                    if (v_Player2(user2)) {
                                        Jugar();
                                        return;
                                    } else {
                                        System.out.println("El jugador 2 no existe");
                                        return;
                                    }
                                }
                                case 2 -> System.out.println("Cerrando sesión...");
                            }

                        } while (opcionL != 2 );

                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;

                case 2:
                    System.out.println("------ Registrar usuario ------");
                    System.out.println("Ingrese su nombre de usuario:");
                    String userR = leer.next();
                    verify(userR);
                    if(verify(userR) == false) {
                        register_Player(userR);
                    } else {
                        System.out.println("El usuario ya existe");
                    }
                    break;

                case 3:
                    System.out.println("------ Saliendo ------");
                    break;
            }
        } while (opcion != 3);


    }

}
