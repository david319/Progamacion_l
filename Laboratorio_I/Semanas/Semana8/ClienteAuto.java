package Semana8;

import java.util.Calendar;

public class ClienteAuto {
    private String NombreCliente, ModeloAuto;
    private int PlacaAuto;
    private int ProximaRevision = 5000;
    private Calendar FechaCreacion = Calendar.getInstance();
    private double MontoTotal = 0;

    public ClienteAuto(int Placa, String Cliente, String Modelo) {
        this.PlacaAuto = Placa;
        this.NombreCliente = Cliente;
        this.ModeloAuto = Modelo;
    }

    public String getNombre() {
        return NombreCliente;
    }

    public int  getPlacaAuto() {
        return PlacaAuto;
    }

    public int getProximaRevision() {
        return ProximaRevision;
    }

    public void setProximaRevision(int ProximaRevision) {
        this.ProximaRevision = ProximaRevision;
    }

    public void incrementarMonto(double monto) {
        if (monto >= 0) {
            this.MontoTotal += monto;
        }
    }

    public String toString() {
        return "Placa: " + PlacaAuto + "\n" +
                "Nombre: " + NombreCliente + "\n" +
                "Modelo: " + ModeloAuto + "\n" +
                "Próxima Revision: " + ProximaRevision + "\n" +
                "Fecha de Creación: " + FechaCreacion.getTime() + "\n" +
                "Monto Total: " + MontoTotal + " Lps." + "\n";
    }
}
