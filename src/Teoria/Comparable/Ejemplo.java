package Teoria.Comparable;

public class Ejemplo implements Comparable<Ejemplo>{
    int numero;
    String nombre;

    public Ejemplo(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Ejemplo example2) {
        return nombre.compareTo(example2.nombre);
    }

    @Override
    public String toString() {
        return "Ejemplo{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
