package Ej2_2_Futbolistas;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{
    String dni;
    String nombre;
    int edad;
    int numGoles;
    public Futbolista(String dni, String nombre, int edad, int numGoles){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Numero de Goles=" + numGoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int compareTo(Futbolista fut2) {
        return this.edad - fut2.edad;
    }
}
