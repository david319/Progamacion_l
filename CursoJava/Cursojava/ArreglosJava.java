public class ArreglosJava {

    public static void main(String[] args) {

        int[] edades = new int[3];

        edades[0] = 20;
        System.out.println("edades = " + edades[0]);

        edades[1] = 30;
        System.out.println("edades = " + edades[1]);

        edades[2] = 40;
        System.out.println("edades = " + edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento " + i + ": " + edades[i]);

        }

    }

}
