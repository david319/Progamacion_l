import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el titulo: ");
        var titulo = consola.nextLine();

        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();

        System.out.println(titulo + " Fue escrito por " + autor);

    }

}
