package Semana5;

import java.util.Scanner;

public class Lara_David_ExamenLab1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        // Declaración de variables de la opción 1 (Lavandería)
        int tPrenda; // Tipo de prenda
        int aFormal = 0, aCasual = 0, aColcha = 0; // contadores de prendas Formales, Casuales y Colchas(Lavado DryClean)
        int pFormal = 0, pCasual = 0, pColcha = 0; //Prendas Formales, Casuales y Colchas (Lavado Normal)
        String suavizante; // suavizante
        int cSuavizante; // Variable para asignar el precio del suavizante
        int tLavado = 0; // Tipo de lavado
        String menuS; // Menu Secundario

        // Subtotal de prendas Formales, Casuales y Colchas
        float subTotalFormalNorm = 0, subTotalFormalDry = 0, subTotalCasualNorm = 0, subTotalCasualDry = 0, subTotalColchaNorm = 0, subTotalColchaDry = 0;
        float subtotal, impuesto, total; // Variables para el subtotal, impuesto y total

        // Variables de la opción 3 (Carácter Popular)
        char caracter = ' '; // Variable para saber el carácter popular
        int contador = 0; // Variable para saber cuántas veces se repite el carácter

        // Acumulador de entradas a cada opción
        int a1 = 0, a2 = 0, a3 = 0;

        while (true) {
            System.out.print("""
                    Menu Principal
                    1- Lavandería
                    2- Alreves
                    3- Carácter Popular
                    4- Salir
                    Ingrese la opción que desea:""");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    a1++;
                    System.out.println("------Lavandería------");
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = sc.next();

                    do {
                        System.out.print("""
                                Tipos de prendas:
                                1- Formal
                                2- Casual
                                3- Colcha
                                Ingrese el tipo de prenda:\t""");
                        tPrenda = sc.nextInt();

                        if (tPrenda > 0 && tPrenda < 4) {
                            while (true) {
                                System.out.println("""
                                        Tipos de lavados:
                                        1- Normal
                                        2- DryClean
                                        Ingrese el tipo de lavado que desea:\t""");
                                tLavado = sc.nextInt();

                                if (tLavado > 0 && tLavado < 3) {
                                    break;

                                } else {
                                    System.out.println("Ingrese un tipo de lavado válido");
                                }
                            }
                        } else {
                            System.out.println("Ingrese un tipo de prenda válido");
                        }

                        if (tPrenda == 1) { // Formal
                            if (tLavado == 1) { // Normal
                                pFormal++; // Se incrementa el contador de prendas Formales (Lavado Normal)
                                subTotalFormalNorm = pFormal * 50;
                            } else { // DryClean
                                aFormal++; // Contador de prendas Formales (Lavado DryClean)
                                subTotalFormalDry = aFormal * 100;
                            }
                        } else if (tPrenda == 2) { // Casual
                                if (tLavado == 1) { // Normal
                                    pCasual++; // Incrementa el contador de prendas casuales (Lavado Normal)
                                    subTotalCasualNorm = pCasual * 20;
                                } else { // DryClean
                                    aCasual++; // Incrementa el contador de prendas casuales (Lavado DryClean)
                                    subTotalCasualDry = aCasual * 70;
                                }
                        } else if (tPrenda == 3) { // Colcha
                            if (tLavado == 1) { // Normal
                                pColcha++; // Incrementa el contador de prendas colchas (Lavado Normal)
                                subTotalColchaNorm = pColcha * 100;
                            } else { // DryClean
                                aColcha++; // Incrementa el contador de prendas colchas (Lavado DryClean)
                                subTotalColchaDry = aColcha * 150;
                            }
                        }
                        System.out.println("""
                                ¿Desea ingresar otra prenda?
                                S/N""");
                        menuS = sc.next();
                        menuS = menuS.toUpperCase();

                    } while (menuS.equals("S")); // Mientras el usuario quiera ingresar otra prenda

                    System.out.println("""
                            ¿Desea Usar suavizante?
                            S/N""");
                    suavizante = sc.next();
                    suavizante = suavizante.toUpperCase();

                    if (suavizante.equals("S")) { // Si el usuario quiere usar suavizante
                        suavizante = "Si";
                        cSuavizante = 200;
                    } else { // Si no quiere usar suavizante
                        suavizante = "No";
                        cSuavizante = 0;
                    }

                    // Cálculo del total
                    subtotal = subTotalFormalNorm + subTotalCasualNorm + subTotalColchaNorm + subTotalFormalDry + subTotalCasualDry + subTotalColchaDry + cSuavizante;
                    impuesto = subtotal * 0.15f;
                    total = subtotal + impuesto;
                    System.out.printf("""
                                                        
                            Cliente: %s
                            * * * * * * * * * * * *  F A C T U R A  * * * * * * * * * * * * * *
                            Tipos de Prendas        Cantidad        Normal        DryClean
                                  Formal           %d(N) %d(D)       50 Lps.       100 Lps.
                                  Casual           %d(N) %d(D)       20 Lps.        70 Lps.
                                  Colcha           %d(N) %d(D)      100 Lps.       150 Lps.
                            -------------------------------------------------------------------
                            (N) Normal (D) DryClean
                            Suavizante Costo 200 Lps.: %s
                            Subtotal: %.2f Lps.
                            Impuesto 15%%: %.2f Lps.
                            Total: %.2f Lps.
                                                        
                            """, cliente, pFormal, aFormal, pCasual, aCasual, pColcha, aColcha, suavizante, subtotal, impuesto, total);
                    break;

                case 2:
                    a2++;
                    System.out.println("\n------ Palabras Alreves ------");
                    System.out.print("Ingrese cuantas palabras desea introducir: ");
                    int cantPalabras = sc.nextInt();

                    for (int i = 0; i < cantPalabras; i++) { // Ciclo para ingresar las palabras
                        System.out.print("Ingrese la palabra: ");
                        String palabra = sc.next();
                        StringBuilder palabraAlreves = new StringBuilder(palabra); // Se crea una variable StringBuilder para almacenar la palabra alreves
                        palabraAlreves.reverse(); // Se invierte la palabra
                        System.out.println(palabraAlreves); // Imprime la palabra alreves
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    a3++;
                    System.out.println("------ Carácter Popular ------");
                    System.out.println("Ingrese una palabra: ");
                    String palabra = sc.next();

                    for (int i = 0; i < palabra.length(); i++) { // Recorre la palabra
                        caracter = palabra.charAt(i); // Obtiene el caracter
                        contador = 0; // Reinicia el contador
                        for (int j = 0; j < palabra.length(); j++) { // Recorre la palabra
                            if (caracter == palabra.charAt(j)) { // Si el caracter es igual al caracter de la palabra
                                contador++; // Aumenta el contador
                            }
                        }
                    }
                    if (contador > 1) {
                        System.out.println("El carácter Popular es: " + caracter + " aparece: " + contador + " veces");
                    } else {
                        System.out.println("La palabra no tiene carácter Popular");
                    }
                    break;

                case 4:
                    System.out.printf("""
                            Se ingreso %d a la opción Lavandería
                            Se ingreso %d a la opción de Alreves
                            Se ingreso %d a la opción de Carácter Popular
                            """, a1, a2, a3);
                    System.exit(0);
            }
        }
    }
}
