package Semana9;

import java.util.Objects;
import java.util.Scanner;

import static Semana9.Class_Player.*;

public class Class_X_O {

    private static final Scanner leer = new Scanner(System.in);
    // Variables
    private static int fila, columna;
    private static int contador = 0;
    private static String[][] tablero = new String[3][3];

    public static void Jugar() {

        // Inicializar tablero
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "[ ]";
                System.out.print(tablero[i][j] + " ");
            }
        }

        // Jugar
        int turno = 0;
        while (true) { // Mientras no se gane
            if (turno % 2 == 0) { // Turno de X
                System.out.println("\nTurno de " + obtener_player1());
            } else { // Turno de O
                System.out.println("\nTurno de " + obtener_player2());
            }

            System.out.println("Ingrese fila: ");
            fila = leer.nextInt();
            System.out.println("Ingrese columna: ");
            columna = leer.nextInt();

            if (Objects.equals(tablero[fila][columna], "[ ]")) { // Si la casilla esta vaciá
                if (turno % 2 == 0) { // Turno de X
                    tablero[fila][columna] = " X ";
                    contador++;
                } else { // Turno de O
                    tablero[fila][columna] = " 0 ";
                    contador++;
                }
                System.out.println("contador = " + contador);
                turno++; // Sumar turnos
            } else { // Si la casilla no esta vaciá
                System.out.println("Esa casilla ya está ocupada");
            }

            for (int i = 0; i < tablero.length; i++) { // Recorrer tablero
                System.out.println("");
                for (int j = 0; j < tablero[i].length; j++) { // Recorrer fila
                    System.out.print(tablero[i][j] + " "); // Imprimir casilla
                }
            }

            // Verificar si gano
            if (contador >= 5) { // Si ya hay 5 turnos
                if (Objects.equals(tablero[0][0], " X ") && Objects.equals(tablero[0][1], " X ") && Objects.equals(tablero[0][2], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[1][0], " X ") && Objects.equals(tablero[1][1], " X ") && Objects.equals(tablero[1][2], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[2][0], " X ") && Objects.equals(tablero[2][1], " X ") && Objects.equals(tablero[2][2], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[0][0], " X ") && Objects.equals(tablero[1][0], " X ") && Objects.equals(tablero[2][0], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[0][1], " X ") && Objects.equals(tablero[1][1], " X ") && Objects.equals(tablero[2][1], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[0][2], " X ") && Objects.equals(tablero[1][2], " X ") && Objects.equals(tablero[2][2], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[0][0], " X ") && Objects.equals(tablero[1][1], " X ") && Objects.equals(tablero[2][2], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                } else if (Objects.equals(tablero[0][2], " X ") && Objects.equals(tablero[1][1], " X ") && Objects.equals(tablero[2][0], " X ")) { // Si gano X
                    System.out.println("\nGanó " + obtener_player1());
                    return;
                }
                if (Objects.equals(tablero[0][0], " 0 ") && Objects.equals(tablero[0][1], " 0 ") && Objects.equals(tablero[0][2], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[1][0], " 0 ") && Objects.equals(tablero[1][1], " 0 ") && Objects.equals(tablero[1][2], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[2][0], " 0 ") && Objects.equals(tablero[2][1], " 0 ") && Objects.equals(tablero[2][2], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[0][0], " 0 ") && Objects.equals(tablero[1][0], " 0 ") && Objects.equals(tablero[2][0], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[0][1], " 0 ") && Objects.equals(tablero[1][1], " 0 ") && Objects.equals(tablero[2][1], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[0][2], " 0 ") && Objects.equals(tablero[1][2], " 0 ") && Objects.equals(tablero[2][2], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[0][0], " 0 ") && Objects.equals(tablero[1][1], " 0 ") && Objects.equals(tablero[2][2], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                } else if (Objects.equals(tablero[0][2], " 0 ") && Objects.equals(tablero[1][1], " 0 ") && Objects.equals(tablero[2][0], " 0 ")) { // Si gano O
                    System.out.println("\nGanó " + obtener_player2());
                    return;
                }

                if (contador == 9) {
                    System.out.println("\nEmpate");
                    return;
                }
            }
        }
    }
}

