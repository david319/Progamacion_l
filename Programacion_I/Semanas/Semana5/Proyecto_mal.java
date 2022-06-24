package Semana5;

import java.util.Objects;
import java.util.Scanner;

public class Proyecto_mal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        float efectivoCaja = 0; // Abono en efectivo
        int pvendidos; // Variable para el número de productos vendidos
        int pComprados; // Variable para el número de productos comprados
        float cantidadProductos = 0; // Variable para la cantidad de libras vendidas o compradas
        String nombreProducto = ""; // Variable para el nombre del producto
        int vAzucar = 30, cAzucar = 25, vAvena = 25, cAvenaB = 20, cAvenaC = 25, vTrigo = 32, cTrigo = 30, vMaiz = 20,
                cMaiz = 18; // Precios de los productos "cProducto" se refiere al valor al comprar y "vProducto" se refiere al valor al vender
        int opcionP; // Variable para la opción del menu principal
        String opcionS = ""; // Variable para la opción del menu secundario
        String opcionT = "";// Variable para la opción del tercer menu
        String pAzucar, pAvena, pTrigo, pMaiz; // Variable para el nombre del producto
        int totalVentas = 0; // Variable para el total de ventas
        int totalCompras = 0; // Variable para el total de compras
        float ventaMayor = 0, compraMayor = 0;
        int azucar = 0, avena = 0, trigo = 0, maiz = 0; // Variables para las cantidades de productos vendidos y sacar el producto estrella
        float efectivoVentas = 0; // Variable para el efectivo de las ventas
        float efectivoCompras = 0; // Variable para el efectivo de las compras
        float deposito; // Variable para el depósito
        float debito; // Variable para el débito
        int contador = 0;
        float subTotal = 0;

        while (true) { // Ciclo para el menú principal
            System.out.println("Menu Principal");
            System.out.print("""
                    1- Abrir caja
                    2- Ventas
                    3- Compras
                    4- Reportes
                    5- Cierre de Caja
                    6- Salir del Sistema
                    Seleccione la operación que desea realizar:\t""");
            opcionP = leer.nextInt();

            float totalGanancias = (efectivoVentas - efectivoCompras); // variable para el total de ganancias

            if (opcionP == 1) { // Opción para abrir la caja
                if (contador >= 1) {
                    System.out.print("La caja ya fue abierta! \nEl efectivo en caja es de " + efectivoCaja + " Lps.\n");

                } else {
                    System.out.print("Ingrese la cantidad de efectivo que desea añadir: ");
                    efectivoCaja = leer.nextFloat();
                    efectivoCaja = efectivoCaja + efectivoCaja;
                    System.out.print("Añadido correctamente! \nEl efectivo en caja es de " + efectivoCaja + " Lps.\n");

                }

            } else if (opcionP == 2) { // Opción para realizar ventas
                System.out.print("""
                        Tipos de cliente:
                        A- Puede comprar cualquier producto.
                        B- puede comprar productos con código 1, 2 y 3.
                        C- Solo puede comprar productos con código 4.
                        Ingrese el Tipo de Cliente:\t""");
                String tipoCliente = leer.next();

                int precioUnitario = 0;
                do { // Ciclo para el menú secundario de ventas
                    if (Objects.equals(tipoCliente, "A") || Objects.equals(tipoCliente, "a")) { // Opción para el tipo de cliente A
                        System.out.print("Ingrese el código del producto a vender: ");
                        pvendidos = leer.nextInt(); // Variable para el código del producto a vender

                        if (pvendidos == 1) { // Condición para el producto 1
                            azucar++;
                            pAzucar = "Azúcar";
                            System.out.println("Azúcar Lps. 30");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vAzucar;
                            totalVentas++;

                        } else if (pvendidos == 2) { // Condición para el producto 2
                            avena++;
                            pAvena = "Avena";
                            System.out.println("Avena Lps. 25");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vAvena;
                            totalVentas++;

                        } else if (pvendidos == 3) { // Condición para el producto 3
                            trigo++;
                            pTrigo = "Trigo";
                            System.out.println("Trigo Lps. 32");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vTrigo;
                            totalVentas++;

                        } else if (pvendidos == 4) { // Condición para el producto 4
                            maiz++;
                            pMaiz = "Maíz";
                            System.out.println("Maíz Lps. 20");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vMaiz;
                            totalVentas++;

                        }
                        System.out.print("Desea comprar otro producto? \nIngrese S/N: ");
                        opcionS = leer.next(); // Variable para la opción de sí se desea comprar otro producto

                    } else if (Objects.equals(tipoCliente, "B") || Objects.equals(tipoCliente, "b")) { // Condición para el tipo de cliente B
                        System.out.print("Ingrese el código del producto a vender: ");
                        pvendidos = leer.nextInt(); // Variable para el código del producto a vender

                        if (pvendidos == 1) { // Condición para el producto 1
                            azucar++;
                            pAzucar = "Azúcar";
                            System.out.println("Azúcar Lps. 30");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vAzucar;
                            totalVentas++;


                        } else if (pvendidos == 2) { // Condición para el producto 2
                            avena++;
                            pAvena = "Avena";
                            System.out.println("Avena Lps. 25");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vAvena;
                            totalVentas++;

                        } else if (pvendidos == 3) { // Condición para el producto 3
                            trigo++;
                            pTrigo = "Trigo";
                            System.out.println("Trigo Lps. 32");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vTrigo;
                            totalVentas++;

                        } else {
                            System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO.");
                            totalVentas--;

                        }
                        System.out.print("Desea comprar otro producto? \nIngrese S/N: ");
                        opcionS = leer.next(); // Variable para la opción de sí se desea comprar otro producto

                        if (Objects.equals(opcionS, "S") || Objects.equals(opcionS, "s")) {
                            nombreProducto = nombreProducto + " " + nombreProducto;
                            cantidadProductos += cantidadProductos;
                            subTotal = precioUnitario * cantidadProductos;
                            subTotal += subTotal;
                            System.out.println("subTotal = " + subTotal);
                            System.out.println("nombreProducto = " + nombreProducto);

                        }

                    } else if (Objects.equals(tipoCliente, "C") || Objects.equals(tipoCliente, "c")) { // Condición para el tipo de cliente C
                        System.out.print("Ingrese el código del producto a vender: ");
                        pvendidos = leer.nextInt(); // Variable para el código del producto a vender

                        if (pvendidos == 4) { // Condición para el producto 4
                            maiz++;
                            pMaiz = "Maíz";
                            System.out.println("Maíz Lps. 20");
                            System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                            cantidadProductos = leer.nextFloat();
                            precioUnitario = vMaiz;
                            totalVentas++;

                        } else {
                            System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO.");
                            totalVentas--;

                        }
                        System.out.print("Desea comprar otro producto? \nIngrese S/N: ");
                        opcionS = leer.next(); // Variable para la opción de sí se desea comprar otro producto

                    }

                } while (Objects.equals(opcionS, "S") || Objects.equals(opcionS, "s")); // Condición para la opción de sí se desea comprar otro producto

                float descuento = 0;

                descuento = (subTotal < 1000) ? 0 : (subTotal > 1000) ? subTotal * 0.05f : (subTotal > 5000) ? subTotal * 0.10f : 0;

                /* Condición para el 1000  ? (subTotal * 0.10f) : 0;impuesto del producto || Variable para el total de la venta*/
                float impuesto = (float) (subTotal * 0.07), total = (subTotal + impuesto) - descuento;

                // Impresión de los datos de la factura
                System.out.printf("""
                                                
                        -----------FACTURACIÓN-----------
                        Cantidad de productos: %.2f kg(s)
                        Nombre del producto: %s
                        Precio unitario: %d
                        SubTotal: %.2f
                        impuesto 7%%: %.2f
                        Descuento: %.2f
                        Total: %.2f
                                                
                        """, cantidadProductos, nombreProducto, precioUnitario, subTotal, impuesto, descuento, total);
                efectivoCaja += total; // Suma el total de las ventas al efectivo total
                efectivoVentas += total; // Acumulador del total de las ventas

                // Sacar la mayor venta
                ventaMayor = (total > ventaMayor) ? ventaMayor = total : ventaMayor;

            } else if (opcionP == 3) { // Condición para comprar productos de los proveedores
                System.out.print("""
                        Tipos de Proveedor:
                        A- Provee los productos con código 1 y 4.
                        B- Provee los productos 2 y 3.
                        C- Provee solamente el producto 2.
                        Ingrese el Tipo de Cliente:\t""");
                String tipoProveedor = leer.next(); // Variable para el tipo de proveedor

                int precioUnitario = 0;

                if (Objects.equals(tipoProveedor, "A") || Objects.equals(tipoProveedor, "a")) { // Condición para el proveedor A
                    System.out.println("Ingrese el código del producto a comprar: ");
                    pComprados = leer.nextInt(); // Variable para el código del producto

                    if (pComprados == 1) { // Condición para el producto 1
                        nombreProducto = "Azúcar";
                        System.out.println("Azúcar Lps. 25");
                        System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                        cantidadProductos = leer.nextFloat();
                        precioUnitario = cAzucar;
                        totalCompras++; // Acumulador del total de las compras

                    } else if (pComprados == 4) { // Condición para el producto 4
                        pMaiz = "Maíz";
                        System.out.println("Maíz Lps. 18");
                        System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                        cantidadProductos = leer.nextFloat();
                        precioUnitario = cMaiz;
                        totalCompras++; // Acumulador del total de las compras

                    } else {
                        System.out.println("Proveedor no vende dicho Producto");
                        totalCompras--; // si no se cumple la condición se resta 1 al total de compras

                    }

                } else if (Objects.equals(tipoProveedor, "B") || Objects.equals(tipoProveedor, "b")) {

                    System.out.println("Ingrese el código del producto a comprar: ");
                    pComprados = leer.nextInt(); // Variable para el código del producto

                    if (pComprados == 2) { // Condición para el producto 2
                        pAvena = "Avena";
                        System.out.println("Avena Lps. 15");
                        System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                        cantidadProductos = leer.nextFloat();
                        precioUnitario = cAvenaB;
                        totalCompras++; // Acumulador del total de las compras

                    } else if (pComprados == 3) {
                        pTrigo = "Trigo";
                        System.out.println("Trigo Lps. 30");
                        System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                        cantidadProductos = leer.nextFloat();
                        precioUnitario = cTrigo;
                        totalCompras++;

                    } else { // Condición para el caso de que el proveedor no vende dicho producto
                        System.out.println("Proveedor no vende dicho Producto");
                        totalCompras--; // si no se cumple la condición se resta 1 al total de compras

                    }

                } else if (Objects.equals(tipoProveedor, "C") || Objects.equals(tipoProveedor, "c")) { // Condición para el proveedor C

                    System.out.println("Ingrese el código del producto a comprar: ");
                    pComprados = leer.nextInt(); // Variable para el código del producto

                    if (pComprados == 2) { // Condición para el producto 2
                        pAvena = "Avena";
                        System.out.println("Avena Lps. 22");
                        System.out.print("¿Cuantos kilogramos desea comprar? \nIngrese la cantidad: ");
                        cantidadProductos = leer.nextFloat();
                        precioUnitario = cAvenaC;
                        totalCompras++; // Acumulador del total de las compras

                    } else { // Condición para el caso de que el proveedor no vende dicho producto
                        System.out.println("Proveedor no vende dicho Producto");
                        totalCompras--; // si no se cumple la condición se resta 1 al total de compras

                    }
                }

                float total = (precioUnitario * cantidadProductos); // Se calcula el total de la compra

                if (efectivoCaja >= total) {
                    System.out.printf("""
                                                    
                            -----------FACTURACIÓN-----------
                            Cantidad de productos: %.2f kg(s)
                            Nombre del producto: %s
                            Precio del unitario: %d
                            Total: %.2f
                                                    
                            """, cantidadProductos, nombreProducto, precioUnitario, total);
                    efectivoCaja = efectivoCaja - total; // Se resta el total de la compra al efectivo en caja

                    // sacar mayor gasto de compras
                    compraMayor = (total > compraMayor) ? compraMayor = total : compraMayor;

                } else {
                    System.out.println("No se Puede Pagar Compra");

                }
                efectivoCompras += total; // Acumulador del total de las compras

            } else if (opcionP == 4) {
                System.out.println("----- R E P O R T E S -----");

                if (azucar > avena && azucar > maiz && azucar > trigo) {
                    nombreProducto = "Azúcar";

                } else if (avena > azucar && avena > maiz && avena > trigo) {
                    nombreProducto = "Avena";

                } else if (maiz > azucar && maiz > avena && maiz > trigo) {
                    nombreProducto = "Maíz";

                } else if (trigo > azucar && trigo > avena && trigo > maiz) {
                    nombreProducto = "Trigo";

                } else {
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
                                Promedio de Compras: %.2f
                                Promedio de Ventas: %.2f
                                Venta con Mayor Ganancia: %.2f Lps.
                                Compra con Mayor Gasto: %.2f Lps.
                                Producto Estrella: %s
                                """, efectivoCaja, totalCompras, totalVentas, efectivoCompras, efectivoVentas,
                        totalGanancias, promedioCompras, promedioVentas, ventaMayor, compraMayor, nombreProducto);


            } else if (opcionP == 5) {
                contador++;
                System.out.println("----- C I E R R E   D E   C A J A -----");
                System.out.println("Ganancias del dia: " + totalGanancias + "Lps.");
                System.out.println("""
                        Maximo el 60% de ganancias
                        Ingrese el porcentaje a depositar en el banco:""");
                deposito = leer.nextFloat();

                if (deposito > 0 || deposito <= 60) { // Se verifica que el depósito sea mayor a 0 y menor o igual a 60
                    deposito = deposito / 100;
                    debito = efectivoCaja * deposito;
                    efectivoCaja = efectivoCaja - debito;

                } else { // Si no se cumple la condición se muestra el mensaje
                    System.out.println("El deposito no puede ser mayor al 60%");

                }

                do { // No permite que el usuario ingrese a las demás opciones sin abrir la caja
                    System.out.println("""
                            La caja ha cerrado no puede acceder a las demás funciones al menos que abra caja
                            desea abrir caja? S/N:""");
                    opcionT = leer.next();
                    opcionT = opcionT.toUpperCase();

                    if (opcionT.equals("N")) {
                        System.out.println("Desea salir del sistema? S/N:");
                        opcionS = leer.next();
                        opcionS = opcionS.toUpperCase();
                    }

                    if (Objects.equals(opcionS, "S")) {
                        System.out.println("Gracias por utilizar nuestro sistema");
                        System.exit(0);
                    }

                } while (Objects.equals(opcionT, "N") || Objects.equals(opcionT, "n"));


            } else if (opcionP == 6) {
                break;

            } else {
                System.out.println("¡ERROR! Se introdujo una opción no valida, intente de nuevo!");

            }


        }

    }

}
