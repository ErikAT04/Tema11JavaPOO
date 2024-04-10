package Ej1_5_Local.Piso;

import Ej1_5_Local.General.Inmueble;

public abstract class Piso extends Inmueble {
    private int numPiso;
    private int numBanios;
    private boolean exteriorOInterior;

    public Piso(String direccion, double metrosCuadrados, int numHabitaciones, int numPiso, int numBanios, boolean exteriorOInterior) {
        super(direccion, metrosCuadrados, numHabitaciones);
        this.numPiso = numPiso;
        this.numBanios = numBanios;
        this.exteriorOInterior = exteriorOInterior;
    }
}
