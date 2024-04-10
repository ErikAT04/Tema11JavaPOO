package Teoria.SobreCarga;

import java.util.ArrayList;

public abstract class Animal {
    ArrayList<Integer> arrayList = new ArrayList();
    public void ruido(){
        System.out.println("Grrr");
        //Lo más sencillo de entender, los animales normalmente gruñen y asi se ve en esta clase.

    }
    public void comer(){
        System.out.println("ñam");
    }
}
