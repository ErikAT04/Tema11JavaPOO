package Ej1_4;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("9788408061052", "El Ingenioso hidalgo Don Quixote de la Mancha", 2005);
        Revista rev1 = new Revista("9322221345521", "Actualidades y otras cosas", 2011, 4);

        libro1.presta();
        System.out.println(libro1.titulo + "está prestado?" + ((libro1.estaPrestado())? "Si" : "No"));

        libro1.devuelve();
        System.out.println(libro1.titulo + "está prestado?" + ((libro1.estaPrestado())? "Si" : "No"));

        System.out.println(libro1.toString());
        System.out.println(rev1.toString());
    }
}
