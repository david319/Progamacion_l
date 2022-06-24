package Semana4;

import java.util.Objects;
import java.util.Scanner;

public class Lara_David_Ciclos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (true) { // Ciclo infinito
            System.out.println("----- Menu Interactivo -----");
            System.out.print("""
                    1- ENEE
                    2- Cuadrado Perfecto
                    3- El Primo
                    4- Palabra Vocal-Lista
                    5- Salir
                    Ingrese el ejercicio que desea:\t""");
            int opcion = leer.nextInt();

            if (opcion == 1) { // Ejercicio 1
                System.out.println("----- Ejercicio ENEE -----");
                System.out.print("Ingrese el Nombre del Cliente: ");
                String nombreCliente = leer.next();

                System.out.print("""
                        Zona A - Zona B - Zona C
                        Ingrese la Zona Residencial:\t""");
                String zonaResidencial = leer.next();
                zonaResidencial = zonaResidencial.toLowerCase(); // Para que no sean mayúsculas

                System.out.print("""
                        Diplomático o Ciudadano
                        Ingrese el Tipo de Cliente:\t""");
                String tipoCliente = leer.next();
                tipoCliente = tipoCliente.toLowerCase(); // Para que no sean mayúsculas

                System.out.print("Ingrese los Kilovatios consumidos: ");
                int kiloVatios = leer.nextInt();
                // Operadores Ternarios
                zonaResidencial = (zonaResidencial.equals("a")) ? "Zona A" : (zonaResidencial.equals("b")) ? "Zona B" : "Zona C";
                tipoCliente = (tipoCliente.equals("diplomatico")) ? "Diplomático" : "Ciudadano";

                float subtotal = 0, descuento = 0, ajusteCombustible = 0, total = 0; // Inicializar variables
                // Zona A Diplomático
                if (Objects.equals(zonaResidencial, "Zona A") || tipoCliente.equals("Diplomático") || kiloVatios <= 100) {
                    subtotal = kiloVatios * 50;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (Objects.equals(zonaResidencial, "Zona A") || tipoCliente.equals("Diplomático") || kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 100;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (Objects.equals(zonaResidencial, "Zona A") && tipoCliente.equals("Diplomático") || kiloVatios > 1000) {
                    subtotal = kiloVatios * 30;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Zona B Diplomático
                if (Objects.equals(zonaResidencial, "Zona B") || tipoCliente.equals("Diplomático") || kiloVatios >= 100) {
                    subtotal = kiloVatios * 30;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (Objects.equals(zonaResidencial, "Zona B") || tipoCliente.equals("Diplomático") ||kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 60;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 1000) {
                    subtotal = kiloVatios * 120;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Zona C Diplomático
                if (Objects.equals(zonaResidencial, "Zona C") || tipoCliente.equals("Diplomático") || kiloVatios >= 100) {
                    subtotal = kiloVatios * 20;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 40;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 1000) {
                    subtotal = kiloVatios * 80;
                    descuento = subtotal * 0.5f;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Zona A Ciudadano
                if (Objects.equals(zonaResidencial, "Zona A") || tipoCliente.equals("Ciudadano") || kiloVatios <= 100) {
                    subtotal = kiloVatios * 50;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 100;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 1000) {
                    subtotal = kiloVatios * 200;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Zona B Ciudadano
                if (Objects.equals(zonaResidencial, "Zona B") || tipoCliente.equals("Ciudadano") || kiloVatios >= 100) {
                    subtotal = kiloVatios * 30;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 60;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 1000) {
                    subtotal = kiloVatios * 120;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Zona C Ciudadano
                if (Objects.equals(zonaResidencial, "Zona C") || tipoCliente.equals("Ciudadano") || kiloVatios >= 100) {
                    subtotal = kiloVatios * 20;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 100 || kiloVatios <= 1000) {
                    subtotal = kiloVatios * 40;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                } else if (kiloVatios > 1000) {
                    subtotal = kiloVatios * 80;
                    ajusteCombustible = subtotal * 0.3f;
                    total = subtotal - descuento + ajusteCombustible;

                }
                // Imprime los resultados
                System.out.printf(""" 
                        Nombre del Cliente: %s
                        Subtotal: %.2f Lps.
                        Descuento: %.2f Lps.
                        Ajuste de Combustible: %.2f Lps.
                        Total: %.2f Lps.""", nombreCliente, subtotal, descuento, ajusteCombustible, total);

            } else if (opcion == 2) { // Ejercicio 2
                System.out.println("----- Ejercicio Cuadrado Perfecto -----");
                System.out.print("Ingrese un número entero: ");
                int numero = leer.nextInt();

                double suma = Math.sqrt(numero) // Raíz cuadrada del número ingresado
                        , raizCuadrada; // Variable para almacenar la raíz cuadrada

                raizCuadrada = suma;

                if (raizCuadrada == (int) raizCuadrada) { // Si la raíz cuadrada es un entero
                    String resultado = (suma * suma == numero) ? " Es un Cuadrado Perfecto" : "No es un Cuadrado Perfecto";
                    System.out.println("El Numero " + numero + resultado);

                } else { // Si la raíz cuadrada no es un entero
                    System.out.println("No es un Cuadrado Perfecto");

                }

            } else if (opcion == 3) { // Ejercicio 3
                System.out.println("----- Ejercicio Número Primo -----");
                System.out.print("Ingrese un número entero: ");
                int numero = leer.nextInt();

                int contador = 0;

                for (int i = 1; i <= numero; i++) { // Se recorre el rango de 1 a número
                    if (numero % i == 0) { // Si el residuo de la división es 0, se incrementa el contador
                        contador++;

                    }
                }

                if (contador == 2) { // Si el contador es igual a 2, es un número primo
                    System.out.println("El número " + numero + " es primo");
                } else {
                    System.out.println("El número " + numero + " no es primo");

                }

            } else if (opcion == 4) { // Ejercicio 4
                System.out.println("----- Ejercicio Vocal-Lista -----");
                System.out.println("Ingrese una palabra: ");
                String palabra = leer.next();
                palabra = palabra.toLowerCase(); // Se convierte la palabra a minúsculas

                int contador = 0;
                int contadorVocales;

                for (contadorVocales = 0; contadorVocales < palabra.length(); contadorVocales++) { // Se recorre la palabra ingresada
                    if (palabra.charAt(contadorVocales) == 'a' || palabra.charAt(contadorVocales) == 'e' || palabra.charAt(contadorVocales) == 'i' ||
                            palabra.charAt(contadorVocales) == 'o' || palabra.charAt(contadorVocales) == 'u') { // Si el carácter es una vocal
                        contador++; // Se incrementa el contador

                    }
                }

                switch (contador) { // Se imprime el resultado
                    case 0, 1, 2, 3 -> System.out.println("NO ES VOCAL-LISTA!"); // Si el contador es 0, 1, 2 o 3, no es vocal-lista
                    default -> System.out.println("ES VOCAL-LISTA!"); // Si el contador es mayor a 3, es vocal-lista

                }

            } else if (opcion == 5) { // Opción de Salir del menu
                break;

            }
        }
    }
}
