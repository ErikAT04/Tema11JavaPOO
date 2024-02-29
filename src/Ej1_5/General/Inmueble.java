package Ej1_5.General;

public abstract class Inmueble {
    protected String direccion;
    protected double metrosCuadrados;
    protected int numHabitaciones;

    public Inmueble(String direccion, double metrosCuadrados, int numHabitaciones) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public String toString() {
        return "Inmueble:\n" +
                "Direccion='" + direccion +
                "\n Metros Cuadrados=" + metrosCuadrados +
                "\n Numero de Habitaciones=" + numHabitaciones;
    }
}
