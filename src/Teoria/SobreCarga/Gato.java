package Teoria.SobreCarga;

public class Gato extends Animal{//"extends" sirve para asociar las clases. "Gato" hereda el contenido de "Animal"
    @Override //Señal de sobrecarga de elementos
    public void ruido(){
        System.out.println("Miau");
    }
}
