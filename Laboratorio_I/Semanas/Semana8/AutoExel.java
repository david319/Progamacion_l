package Semana8;

import java.util.Scanner;

public class AutoExel {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Atributos
    private static boolean verificarP = false; // Booleano que me dice si existe la placa en el array
    private static ClienteAuto[] clienteauto = new ClienteAuto[50]; // Array de clientes

    // Funciones
    public static int posVacia() { // Función para saber la posición vacía
        for (int i = 0; i < clienteauto.length; i++) { // Recorre el arreglo
            if (clienteauto[i] == null) { // Si la posición está vacía
                return i; // Regresa la posición vacía
            }
        }
        return -1; // Regresa -1 si no hay posición vacía
    }

    public static void agregarCliente(int numPlaca) { // Función para agregar un cliente
        if (verificarP == true) {
            return;
        } else {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = leer.next();
            System.out.println("Ingrese el modelo del auto: ");
            String modelo = leer.next();
            ClienteAuto cliente = new ClienteAuto(numPlaca, nombre, modelo); // Crea un cliente
            int pos = posVacia(); // Llama a la función para saber la posición vacía
            clienteauto[pos] = cliente; // Agrega el cliente en la posición vacía
        }
    }

    public static void atenderRevision(int numPlaca) { // Función para atender la revisión
        for (ClienteAuto clienteAuto : clienteauto) { // Recorre el arreglo
            if (clienteAuto != null && clienteAuto.getPlacaAuto() == numPlaca) { // Si el cliente no esta vació y el número de placa es igual al número de placa ingresado
                System.out.println("Atendiendo la revisión " + clienteAuto.getProximaRevision() + " del cliente " + clienteAuto.getNombre()); // Imprime los datos del cliente
                System.out.println("Ingrese el monto a pagar para esta revisión: ");
                int monto = leer.nextInt();
                clienteAuto.incrementarMonto(monto); // Incrementa el monto actual
                clienteAuto.setProximaRevision(clienteAuto.getProximaRevision() + 5000); // Incrementa el monto para la próxima revisión
            }
        }
    }

    public static void eliminarClientesCompletos() { // Función para eliminar los clientes que no tienen monto
        for (int i = 0; i < clienteauto.length; i++) { // Recorre el arreglo
            if (clienteauto[i] != null && clienteauto[i].getProximaRevision() >= 100000) { // Si el cliente no esta vació y el monto es mayor o igual a 100000
                clienteauto[i] = null; // Elimina el cliente
            }
        }
    }

    public static void listarClientes() { // Función para listar los clientes
        for (int i = 0; i < clienteauto.length; i++) { // Recorre el arreglo
            if (clienteauto[i] != null) { // Si la posición no está vacía
                System.out.println(clienteauto[i].toString()); // Imprime el cliente
            }
        }
    }

    public static void buscarPlaca(int numPlaca) { // Función para buscar un cliente
        for (ClienteAuto clienteAuto : clienteauto) { // Recorre el arreglo
            if (clienteAuto != null && clienteAuto.getPlacaAuto() == numPlaca) { // Si el cliente no esta vació y el número de placa es igual al número de placa ingresado
                System.out.println("Ya esta registrada la placa");
                verificarP = true;
            }
        }
    }
}
