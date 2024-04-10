package Ej2_1_Socios;

import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        int res = socio1.nombre.compareTo(socio2.nombre);
        if (res != 0){
            return res;
        } else {
            return socio1.id - socio2.id;
        }
    }
}
