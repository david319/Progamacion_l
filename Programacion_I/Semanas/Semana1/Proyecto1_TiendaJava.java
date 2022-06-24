package Semana1;

import java.util.Objects;
import java.util.Scanner;

public class Proyecto1_TiendaJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        float efectivoCaja = 0; // Efectivo en caja
        String menuS = ""; // Menu de opciones
        String opcionT = ""; // Menu de opciones
        float pAzucar = 0, pAvena = 0, pTrigo = 0, pMaiz = 0; // Declarar las variables de los nombres de los productos
        int vAzucar = 30, cAzucar = 25, vAvena = 25, cAvenaB = 20, cAvenaC = 25, vTrigo = 32, cTrigo = 30, vMaiz = 20,
                cMaiz = 18; // Precios de los productos "cProducto" se refiere al valor al comprar y "vProducto" se refiere al valor al vender
        String nombreProducto = ""; // Nombre del producto
        int precioUnitario = 0; // Precio unitario del producto
        float cantidadProducto = 0; // Cantidad de producto
        float subTotalAz = 0, subTotalAv = 0, subTotalT = 0, subTotalM = 0; // Subtotal de los productos
        float compraMayor = 0, ventaMayor = 0; // Variables para saber el producto con mayor compra y venta
        float efectivoVentas = 0, efectivoCompras = 0; // Efectivo de las ventas y compras
        int aMaiz = 0, aTrigo = 0, aAzucar = 0, aAvena = 0; // Acumulador de productos vendidos
        int totalVentas = 0, totalCompras = 0; // Acumulador de ventas y compras
        boolean cajaAbierta = true, cajaCerrada = false; // Variables para saber si la caja está abierta, cerrada o si ya cerró anteriormente
        float deposito, debito; // Variables para el depósito y débito

        while (true) {
            System.out.println("------ Menu Principal ------");
            System.out.print("""
                    1- Abrir caja
                    2- Ventas
                    3- Compras
                    4- Reportes
                    5- Cierre de Caja
                    6- Salir del Sistema
                    Seleccione la operación que desea realizar:\t""");
            int menuP = sc.nextInt();

            float totalGanancias = (efectivoVentas - efectivoCompras); // variable para el total de ganancias

            switch (menuP) {
                case 1:
                    if (cajaAbierta && !cajaCerrada) {
                        System.out.println("Cuanto efectivo desea añadir?");
                        efectivoCaja = sc.nextInt();
                        System.out.println("¡Se ha añadido correctamente! el efectivo en caja es de: " + efectivoCaja + "Lps.");
                    } else if (!cajaAbierta || !cajaCerrada) {
                        cajaAbierta = true;
                        System.out.println("Se ha abierto la caja");
                        System.out.println("El efectivo en caja es de " + efectivoCaja + "Lps.");
                    }
                    break;

                case 2:
                    System.out.print("""
                            Tipos de cliente:
                            A- Puede comprar cualquier producto.
                            B- puede comprar productos con código 1, 2 y 3.
                            C- Solo puede comprar productos con código 4.
                            Ingrese el Tipo de Cliente:\t""");
                    String tipoCliente = sc.next();
                    tipoCliente = tipoCliente.toUpperCase();

                    do {
                        switch (tipoCliente) {

                            case "A": // Condición para el tipo de cliente A
                                System.out.print("Ingrese el código del producto a vender: ");
                                int cProducto = sc.nextInt();

                                if (cProducto == 1) { // Condición para el producto 1
                                    aAzucar++;
                                    System.out.println("""
                                            Azúcar
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pAzucar = sc.nextFloat();
                                    precioUnitario = vAzucar;
                                    subTotalAz = pAzucar * precioUnitario;
                                    totalVentas++;

                                } else if (cProducto == 2) { // Condición para el producto 2
                                    aAvena++;
                                    System.out.println("""
                                            Avena
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pAvena = sc.nextFloat();
                                    precioUnitario = vAvena;
                                    subTotalAv = pAvena * precioUnitario;
                                    totalVentas++;

                                } else if (cProducto == 3) { // Condición para el producto 3
                                    aTrigo++;
                                    System.out.println("""
                                            Trigo
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pTrigo = sc.nextFloat();
                                    precioUnitario = vTrigo;
                                    subTotalT = pTrigo * precioUnitario;
                                    totalVentas++;

                                } else if (cProducto == 4) { // Condición para el producto 4
                                    aMaiz++;
                                    System.out.println("""
                                            Maíz
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pMaiz = sc.nextFloat();
                                    precioUnitario = vMaiz;
                                    subTotalM = pMaiz * precioUnitario;
                                    totalVentas++;
                                }
                                break;

                            case "B": // Condición para el tipo de cliente B
                                System.out.print("Ingrese el código del producto a vender: ");
                                cProducto = sc.nextInt();

                                if (cProducto == 1) { // Condición para el producto 1
                                    aAzucar++;
                                    System.out.println("""
                                            Azúcar
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pAzucar = sc.nextFloat();
                                    precioUnitario = vAzucar;
                                    subTotalAz = pAzucar * precioUnitario;
                                    totalVentas++;

                                } else if (cProducto == 2) { // Condición para el producto 2
                                    aAvena++;
                                    System.out.println("""
                                            Avena
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pAvena = sc.nextFloat();
                                    precioUnitario = vAvena;
                                    subTotalAv = pAvena * precioUnitario;
                                    totalVentas++;

                                } else if (cProducto == 3) { // Condición para el producto 3
                                    aTrigo++;
                                    System.out.println("""
                                            Trigo
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pTrigo = sc.nextFloat();
                                    precioUnitario = vTrigo;
                                    subTotalT = pTrigo * precioUnitario;
                                    totalVentas++;
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO.");
                                    totalVentas--;
                                }
                                break;

                            case "C": // Condición para el tipo de cliente C
                                System.out.print("Ingrese el código del producto a vender: ");
                                cProducto = sc.nextInt();
                                if (cProducto == 4) { // Condición para el producto 4
                                    aMaiz++;
                                    System.out.println("""
                                            Maíz
                                            ¿Cuantos kilogramos desea comprar?""");
                                    pMaiz = sc.nextFloat();
                                    precioUnitario = vMaiz;
                                    subTotalM = pMaiz * precioUnitario;
                                    totalVentas++;

                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO.");
                                    totalVentas--;
                                }
                                break;

                        }

                        System.out.println("¿Desea Comprar otro producto? \nS/N");
                        menuS = sc.next();
                        menuS = menuS.toUpperCase();

                    } while (menuS.equals("S")); // Se repite hasta que el usuario decida no comprar más productos.

                    float subTotal = subTotalAv + subTotalAz + subTotalT + subTotalM; // SUBTOTAL
                    float descuento; // DESCUENTO
                    // Se calcula el descuento de acuerdo al subtotal de la venta
                    descuento = (subTotal < 1000) ? 0 : (subTotal > 1000) ? subTotal * 0.05f : (subTotal > 5000) ? subTotal * 0.10f : 0;

                    /* Condición para el impuesto del producto || Variable para el total de la venta*/
                    float impuesto = (float) (subTotal * 0.07), total = (subTotal + impuesto) - descuento;

                    // Impresión de los datos de la factura
                    System.out.printf("""
                                                    
                            ------------------FACTURACIÓN--------------------
                            Productos       Cantidad            Precio
                            Avena               %.2f Kg(s)        %d Lps.
                            Azúcar              %.2f Kg(s)        %d Lps.
                            Trigo               %.2f Kg(s)        %d Lps.
                            Maíz                %.2f Kg(s)        %d Lps.
                            ************************************************
                            SubTotal: %.2f Lps.
                            impuesto 7%%: %.2f Lps.
                            Descuento: %.2f Lps.
                            Total: %.2f Lps.
                                                    
                            """, pAvena, vAvena, pAzucar, vAzucar, pTrigo, vTrigo, pMaiz, vMaiz, subTotal, impuesto, descuento, total);
                    efectivoCaja += total; // Suma el total de las ventas al efectivo total
                    efectivoVentas += total; // Acumulador del total de las ventas

                    // Sacar la mayor venta
                    ventaMayor = Math.max(total, ventaMayor); // La función max() devuelve el mayor de las variables
                    break;

                case 3: // Opción para comprar productos a los distribuidores
                    System.out.print("""
                            Tipos de Proveedor:
                            A- Provee los productos con código 1 y 4.
                            B- Provee los productos 2 y 3.
                            C- Provee solamente el producto 2.
                            Ingrese el Tipo de proveedor:\t""");
                    String tipoProveedor = sc.next(); // Variable para el tipo de proveedor
                    tipoProveedor = tipoProveedor.toUpperCase();

                    switch (tipoProveedor) { // Condición para el tipo de proveedor
                        case "A":
                            System.out.print("Ingrese el código del producto a comprar: ");
                            int cProducto = sc.nextInt();

                            if (cProducto == 1) { // Condición para el producto 1
                                System.out.println("""
                                        Azúcar
                                        ¿Cuantos kilogramos desea comprar?""");
                                cantidadProducto = sc.nextFloat();
                                nombreProducto = "Azúcar";
                                precioUnitario = cAzucar;
                                totalCompras++;

                            } else if (cProducto == 4) { // Condición para el producto 4
                                System.out.println("""
                                        Maíz
                                        ¿Cuantos kilogramos desea comprar?""");
                                cantidadProducto = sc.nextFloat();
                                nombreProducto = "Maíz";
                                precioUnitario = cMaiz;
                                totalCompras++;

                            } else { // Condición si el producto no es 1 ni 4
                                System.out.println("Proveedor no vende dicho Producto");
                                totalCompras--;
                            }
                            break;

                        case "B": // Condición para el tipo de proveedor B
                            System.out.print("Ingrese el código del producto a comprar: ");
                            cProducto = sc.nextInt();

                            if (cProducto == 2) { // Condición para el producto 2
                                System.out.println("""
                                        Avena
                                        ¿Cuantos kilogramos desea comprar?""");
                                cantidadProducto = sc.nextFloat();
                                nombreProducto = "Avena";
                                precioUnitario = cAvenaB;
                                totalCompras++;

                            } else if (cProducto == 3) { // Condición para el producto 3
                                System.out.println("""
                                        Trigo
                                        ¿Cuantos kilogramos desea comprar?""");
                                cantidadProducto = sc.nextFloat();
                                nombreProducto = "Trigo";
                                precioUnitario = cTrigo;
                                totalCompras++;

                            } else { // Condición si el producto no es 2 ni 3
                                System.out.println("Proveedor no vende dicho Producto");
                                totalCompras--;
                            }
                            break;

                        case "C": // Condición para el tipo de proveedor C
                            System.out.print("Ingrese el código del producto a comprar: ");
                            cProducto = sc.nextInt();

                            if (cProducto == 2) { // Condición para el producto 2
                                System.out.println("""
                                        Avena
                                        ¿Cuantos kilogramos desea comprar?""");
                                cantidadProducto = sc.nextFloat();
                                nombreProducto = "Avena";
                                precioUnitario = cAvenaC;
                                totalCompras++;

                            } else { // Condición si el producto no es 2
                                System.out.println("Proveedor no vende dicho Producto");
                                totalCompras--;
                            }
                            break;
                    }
                    // Se calcula el precio total de la compra
                    total = cantidadProducto * precioUnitario;

                    if (efectivoCaja >= total) { // Condición para verificar si el efectivo en caja es mayor al precio total de la compra
                        System.out.printf("""
                                                        
                                -------------FACTURACIÓN-------------
                                Cantidad de productos: %.2f kg(s)
                                Nombre del producto: %s
                                Precio unitario: %d Lps.
                                Total: %.2f Lps.
                                                                
                                """, cantidadProducto, nombreProducto, precioUnitario, total); // Se imprime la factura

                        // Se resta el total de la compra al efectivo en caja
                        efectivoCaja = efectivoCaja - total;

                        // sacar mayor gasto de compras
                        compraMayor = Math.max(total, compraMayor);

                    } else if (efectivoCaja < total){ // Condición si el efectivo en caja es menor al precio total de la compra
                        System.out.println("No se Puede Pagar Compra");
                        totalCompras--;
                    } else {
                        System.out.println("No se efectuó la compra.");
                    }
                    efectivoCompras += total; // Acumulador del total de las compras
                    break;

                case 4: // Opción de reporte de compras, ventas, efectivo en caja, etc.
                    System.out.println("----- R E P O R T E S -----");

                    if (aAzucar > aAvena && aAzucar > aMaiz && aAzucar > aTrigo) { // Condición si el producto más vendido es Azúcar
                        nombreProducto = "Azúcar";

                    } else if (aAvena > aAzucar && aAvena > aMaiz && aAvena > aTrigo) { // Condición si el producto más vendido es Avena
                        nombreProducto = "Avena";

                    } else if (aMaiz > aAzucar && aMaiz > aAvena && aMaiz > aTrigo) { // Condición si el producto más vendido es Trigo
                        nombreProducto = "Maíz";

                    } else if (aTrigo > aAzucar && aTrigo > aAvena && aTrigo > aMaiz) { // Condición si el producto más vendido es Maíz
                        nombreProducto = "Trigo";

                    } else { // Condición si no hay productos con mayor venta que otros
                        nombreProducto = "No hay productos con mayor venta";
                        System.out.println("No hay productos estrella");

                    }

                    float promedioCompras = efectivoCompras / totalCompras; // Se calcula el promedio de las compras
                    float promedioVentas = efectivoVentas / totalVentas; // Se calcula el promedio de las ventas

                    // Se imprime el reporte
                    System.out.printf("""
                                    Cantidad actual de efectivo en caja: %.2f Lps.
                                    Cantidad de compras : %d
                                    Cantidad de ventas: %d
                                    Volumen Total de Compras: %.2f Lps.
                                    Volumen Total de Ventas: %.2f Lps.
                                    Ganancias Obtenidas: %.2f Lps.
                                    Promedio de Compras: %.2f Lps.
                                    Promedio de Ventas: %.2f Lps.
                                    Venta con Mayor Ganancia: %.2f Lps.
                                    Compra con Mayor Gasto: %.2f Lps.
                                    Producto Estrella: %s
                                    """, efectivoCaja, totalCompras, totalVentas, efectivoCompras, efectivoVentas,
                            totalGanancias, promedioCompras, promedioVentas, ventaMayor, compraMayor, nombreProducto);
                    break;

                case 5: // Opción de cierre de caja
                    cajaAbierta = false; // Se cierra la caja
                    cajaCerrada = true; // La caja está cerrada
                    System.out.println("----- C I E R R E   D E   C A J A -----");

                    while (true) { // Ciclo para que el usuario pueda cerrar la caja
                        System.out.println("Ganancias del dia: " + totalGanancias + "Lps.");
                        System.out.println("""
                                Maximo el 60% de ganancias
                                Ingrese el porcentaje a depositar en el banco:""");
                        deposito = sc.nextFloat();

                        if (deposito > 0 && deposito <= 60) { // Se verifica que el depósito sea mayor a 0 y menor o igual a 60
                            deposito = deposito / 100;
                            debito = efectivoCaja * deposito;
                            efectivoCaja = efectivoCaja - debito;
                            break;

                        } else { // Si no se cumple la condición se muestra el mensaje
                            System.out.println("El deposito no puede ser mayor al 60% y no puede ser menor de 0");
                        }
                    }

                    do { // No permite que el usuario ingrese a las demás opciones sin abrir la caja
                        System.out.println("""
                                La caja ha cerrado no puede acceder a las demás funciones al menos que abra caja
                                desea abrir caja? S/N:""");
                        opcionT = sc.next();
                        opcionT = opcionT.toUpperCase();

                        if (opcionT.equals("N")) { // Si el usuario no quiere abrir la caja procede a preguntar si quiere cerrar el programa
                            System.out.println("Desea salir del sistema? S/N:");
                            menuS = sc.next();
                            menuS = menuS.toUpperCase();
                        }

                        if (Objects.equals(menuS, "S")) { // Si el usuario quiere salir del programa se cierra el programa
                            System.out.println("Gracias por utilizar nuestro sistema");
                            System.exit(0);
                        }

                    } while (Objects.equals(opcionT, "N")); // Si el usuario no quiere salir del programa se repite el ciclo
                    break;

                case 6: // Opción de salir del programa
                    System.out.println("Gracias por utilizar nuestro sistema");
                    System.exit(0);

            }
        }
    }
}
