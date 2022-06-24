import java.util.Scanner;

public class AreaPerimetroRectangulo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("-----Calcular el área y perimetro de un Rectángulo-----");
        System.out.println("Ingrese la altura del rectángulo: ");
        int altura = leer.nextInt();
        System.out.println("Ingrese el ancho del rectángulo: ");
        int ancho = leer.nextInt();

        int area = altura * ancho;
        int perimetro = (altura + ancho) * 2;

        System.out.printf("""
                El área es de: %d
                El perimetro es de: %d""", area, perimetro);

    }
}
