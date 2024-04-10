package Ej1_5_Local.Piso;

import Ej1_5_Local.General.Vendible;

public class PisoVendible extends Piso implements Vendible {
    private double precioVenta;
    public PisoVendible(String direccion, double metrosCuadrados, int numHabitaciones, int numPiso, int numBanios, boolean exteriorOInterior, double precioVenta) {
        super(direccion, metrosCuadrados, numHabitaciones, numPiso, numBanios, exteriorOInterior);
        this.precioVenta = precioVenta;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println(precioVenta);
    }
}
