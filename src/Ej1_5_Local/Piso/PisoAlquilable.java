package Ej1_5_Local.Piso;

import Ej1_5_Local.General.Alquilable;

public class PisoAlquilable extends Piso implements Alquilable {
    public PisoAlquilable(String direccion, double metrosCuadrados, int numHabitaciones, int numPiso, int numBanios, boolean exteriorOInterior) {
        super(direccion, metrosCuadrados, numHabitaciones, numPiso, numBanios, exteriorOInterior);
    }

    @Override
    public double calcularPrecioAlquiler(int meses) {
        return (80*metrosCuadrados*meses);
    }
}
