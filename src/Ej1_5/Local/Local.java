package Ej1_5.Local;

import Ej1_5.General.Inmueble;

public abstract class Local extends Inmueble {
    String tipoNegocio;

    public Local(String direccion, double metrosCuadrados, int numHabitaciones, String tipoNegocio) {
        super(direccion, metrosCuadrados, numHabitaciones);
        this.tipoNegocio = tipoNegocio;
    }
}
