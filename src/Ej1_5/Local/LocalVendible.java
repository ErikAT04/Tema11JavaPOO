package Ej1_5.Local;

import Ej1_5.General.Vendible;

public class LocalVendible extends Local implements Vendible {
    private double precioVenta;

    public LocalVendible(String direccion, double metrosCuadrados, int numHabitaciones, String tipoNegocio, double precioVenta) {
        super(direccion, metrosCuadrados, numHabitaciones, tipoNegocio);
        this.precioVenta = precioVenta;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println(precioVenta);
    }
}
