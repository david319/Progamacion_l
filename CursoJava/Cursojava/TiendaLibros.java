import java.util.Scanner;

public class TiendaLibros {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Proporciona el nombre: ");
        String  nombre = leer.nextLine();

        System.out.print("Proporciona el id: ");
        int id = leer.nextInt();

        System.out.print("Proporciona el precio: ");
        int precio = leer.nextInt();

        System.out.println("""
                Proporciona el envío gratuito
                true/false:""");
        boolean envio = leer.nextBoolean();

        System.out.printf("""
                %s #%d
                Precio: %d
                Envío Gratuito: %b""", nombre, id, precio, envio);

    }

}
