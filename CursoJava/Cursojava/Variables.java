public class Variables {

    public static void main(String[] args)
    {
        // Definimos la variable
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);
        // Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);

        // Variable String
        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);
        // Modificamos la variable
        miVariableCadena = "Adios";
        System.out.println("miVariableCadena = " + miVariableCadena);

        // Var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);

        // Usar nuevamente var
        // sout + tab = System.out.println()
        // soutv + tab = System.out.println("Ultima variable = " + la ultima variable)
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        // Valores permitidos en el nombre de las variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; No se permite utilizar caracteres especiales

        
    }


}
