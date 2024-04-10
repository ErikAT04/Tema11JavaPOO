package Ej2_1_Socios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio implements Comparable<Socio> {
    int id;
    String nombre;
    LocalDate fechaNacimiento;
    public Socio(int id, String nombre, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    @Override
    public int compareTo(Socio otherSocio) {
        return this.id - otherSocio.id;
    }
}
