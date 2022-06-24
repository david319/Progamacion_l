public class TiposPrimitivos {

    public static void main(String[] args) {

    //Tipos primitivos enteros: byte, short, char, int, long

    byte numeroByte = (byte)127; //El valor máximo de un byte es 127
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short)32767; //El valor máximo de un short es 32767
        System.out.println("Valor short: " + numeroShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = 2147483647; //El valor máximo de un int es 2147483647
        System.out.println("Valor int: " + numeroInt);
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L; //El valor máximo de un long es 9223372036854775807
        System.out.println("Valor long: " + numeroLong);
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        // Tipos primitivos decimales: float, double

        float numeroFloat = 3.4028235E38f; //El valor máximo de un float es 3.4028235E38
        System.out.println("Valor float: " + numeroFloat);
        System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308; //El valor máximo de un double es 1.7976931348623157E308
        System.out.println("Valor double: " + numeroDouble);
        System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);

    }

}
