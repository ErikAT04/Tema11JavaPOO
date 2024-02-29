package Teoria.SobreCarga;

public class Teoría {
    /*
    El 'Override' o Sobrecarga de elementos es una sobrescritura
    de elementos entre clases. Se usa en métodos abstractos o métodos
    que normalmente siguen siempre la misma estructura. Un ejemplo se
    puede ver en el main de esta clase, no sin antes pasar por el resto
    de clases.
     */
    public static void main(String[] args) {
        //Una vez se han hecho las clases, se hacen los objetos.
        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.ruido(); //Al haberse sobreescrito, el gato va a hacer miau
        perro.ruido(); //Al no haberse sobreescrito, el perro va a hacer grr

        gato.comer(); //Va a decir ñan
        perro.comer(); //Va a decir ñam

        Animal perro2 = new Perro(); //Esta es otra forma de crear objetos, funciona igual.
    }
}
