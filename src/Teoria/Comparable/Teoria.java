package Teoria.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Teoria {
    public static void main(String[] args) {
        Ejemplo example1 = new Ejemplo(5, "AABE");
        Ejemplo example2 = new Ejemplo(7, "Si");
        Ejemplo example3 = new Ejemplo(7, "AAAA4");

        Ejemplo[] ejemplos = {example1, example2, example3};
        System.out.println(Arrays.toString(ejemplos));
        Arrays.sort(ejemplos);
        System.out.println(Arrays.toString(ejemplos));

        Comparator<Ejemplo> c = new ComparadorPorNumero();
        Arrays.sort(ejemplos, c);
        //c (el objeto) es el criterio sacado del comparador (compare)
        System.out.println(Arrays.toString(ejemplos));

        Comparator<Ejemplo> c2 = c.reversed();
        //Creo el comparador al revés con este comando
        Arrays.sort(ejemplos, c2);
        System.out.println(Arrays.toString(ejemplos));
    }
}
