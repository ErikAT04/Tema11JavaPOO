package Ej1_5_Local.Local;

import Ej1_5_Local.General.Inmueble;

public abstract class Local extends Inmueble {
    String tipoNegocio;

    public Local(String direccion, double metrosCuadrados, int numHabitaciones, String tipoNegocio) {
        super(direccion, metrosCuadrados, numHabitaciones);
        this.tipoNegocio = tipoNegocio;
    }
}
