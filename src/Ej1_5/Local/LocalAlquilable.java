package Ej1_5.Local;

import Ej1_5.General.Alquilable;

public class LocalAlquilable extends Local implements Alquilable {
    public LocalAlquilable(String direccion, double metrosCuadrados, int numHabitaciones, String tipoNegocio) {
        super(direccion, metrosCuadrados, numHabitaciones, tipoNegocio);
    }

    @Override
    public double calcularPrecioAlquiler(int meses) {
        return (80*metrosCuadrados*meses);
    }
}
