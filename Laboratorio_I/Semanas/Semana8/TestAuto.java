package Semana8;

import java.util.Scanner;

import static Semana8.AutoExel.*;

public class TestAuto {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                    Menu Principal
                    1- Agregar Cliente
                    2. Atender Revisión
                    3. Remover Clientes
                    4- Listar Clientes
                    5- Salir
                    Ingrese una opción:\t""");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el numero de placa: ");
                    int placa = leer.nextInt();
                    buscarPlaca(placa);
                    agregarCliente(placa);
                }
                case 2 -> {
                    System.out.println("Ingrese el numero de placa: ");
                    int placa = leer.nextInt();
                    atenderRevision(placa);
                }
                case 3 -> eliminarClientesCompletos();
                case 4 -> listarClientes();
                case 5 -> System.out.println("Saliendo...");
            }
        } while (opcion != 5);
    }
}
