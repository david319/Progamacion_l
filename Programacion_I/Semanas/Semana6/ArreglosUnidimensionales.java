package Semana6;

public class ArreglosUnidimensionales {

    public static void main(String[] args) {

        int numeros[] = new int[5];

        System.out.println("Array[3] = " + numeros[3]);
        numeros[3] = 10;
        System.out.println("Array[3] = " + numeros[3]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Array[" + i + "] = " + numeros[i]);

        }

    }

}
