package Ej1_4_Biblioteca;

public abstract class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int anio;
    public Publicacion(String isbn, String titulo, int anio){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anio=anio;
    }

    @Override
    public String toString() {
        return ("ISBN: '" + isbn +"'\n"+
                "Titulo: '"+ titulo + "'\n" +
                "Año de salida: " + anio + ".");
    }
}
