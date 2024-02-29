package Ej1_5.Piso;

import Ej1_5.General.Inmueble;

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
