package Teoria.Comparable;

import java.util.Comparator;
public class ComparadorPorNumero implements Comparator<Ejemplo> {
    @Override
    public int compare(Ejemplo o1, Ejemplo o2) {
        return o1.numero - o2.numero;
    }
}
