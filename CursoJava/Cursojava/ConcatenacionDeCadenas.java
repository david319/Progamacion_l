public class ConcatenacionDeCadenas {

    public static void main(String[] args) {
        var usuario = "David";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);// Suma de numeros
        System.out.println(i + j + usuario);// Evaluacion de izq a derecha, realiza suma
        System.out.println(usuario + i + j);// Contexto cadenta, todo es una cadena
        System.out.println(usuario + (i + j));// Uso de parentesis modifica la prioridad de la evaluacion
    }

}
