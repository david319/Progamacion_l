package Semana3;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("----- Visitas Medicas -----");

        System.out.print("Ingrese el Nombre del Paciente: ");
        String nombrePaciente = leer.nextLine();

        System.out.print("""
                Tipos de Visitas Medicas
                1- Consulta Medica
                2- Cirugía
                Ingrese a que tipo de visita viene:""");
        int tipoVisita = leer.nextInt();

        System.out.print("""
                Tipos de Doctores
                1- Internista
                2- Cardiólogo
                3- Pediatra
                4- Dermatólogo
                Seleccione el tipo de doctor necesario:""");
        int tipoDoctor = leer.nextInt();

        String motivo = null;
        String doctor = null;
        float subTotal = 0;
        float isv = (float) 0.15;
        float totalPagar;

        if (tipoVisita == 1 && tipoDoctor == 1) {
            subTotal = (float) 1200.66;
            motivo = "Consulta Medica";
            doctor = "Internista";

        } else if (tipoVisita == 1 && tipoDoctor == 2) {
            subTotal = (float) 1500;
            motivo = "Consulta Medica";
            doctor = "Cardiólogo";

        } else if (tipoVisita == 1 && tipoDoctor == 3) {
            subTotal = (float) 950;
            motivo = "Consulta Medica";
            doctor = "Pediatra";

        } else if (tipoVisita == 1 && tipoDoctor == 4) {
            subTotal = (float) 1000;
            motivo = "Consulta Medica";
            doctor = "Dermatólogo";

        }else if (tipoVisita == 2 && tipoDoctor == 1) {
            subTotal = (float) 18599.99;
            motivo = "Cirugía";
            doctor = "Internista";

        } else if (tipoVisita == 2 && tipoDoctor == 2) {
            subTotal = (float) 18345.99;
            motivo = "Cirugía";
            doctor = "Cardiólogo";

        } else if (tipoVisita == 2 && tipoDoctor == 3) {
            subTotal = (float) 25000;
            motivo = "Cirugía";
            doctor = "Pediatra";

        } else if (tipoVisita == 2 && tipoDoctor == 4) {
            subTotal = (float) 16799.99;
            motivo = "Cirugía";
            doctor = "Dermatólogo";

        }

        isv = (subTotal * isv);
        totalPagar = subTotal + isv;

        System.out.println("\n-----Factura-----");
        System.out.printf("""
                Nombre del Paciente: %s
                Visita: %s
                Doctor: %s
                SubTotal: lps %.2f
                ISV-15%%: lps %.2f
                Total a Pagar: lps %.2f""", nombrePaciente, motivo, doctor, subTotal, isv, totalPagar);

    }

}
