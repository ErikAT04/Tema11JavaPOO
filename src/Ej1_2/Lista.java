package Ej1_2;

import java.util.Arrays;

public class Lista implements Cola {
    int[] lista;
    int[] lista2 = {1, 5, 2, 7};
    public Lista(){
        lista = new int[0];
    }

    public void verNumElementosLista(){
        int contador=0;
        for (int i = 0; i<lista.length; i++){
            contador++;
        }
        System.out.println("La lista tiene " + contador + " espacios");
    }
    public void aniadirAlPrincipio(int num){
        lista= Arrays.copyOf(lista, lista.length+1);
        for (int i=0; i<lista.length-1; i++){
            lista[i+1]=lista[i];
        }
        lista[0]=num;
    }
    public void aniadirAlFinal(int num){
        lista= Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=num;
    }
    public void aniadirEnMedio(int num, int pos){
        lista = Arrays.copyOf(lista, lista.length+1);
        System.arraycopy(lista, pos, lista, pos+1, lista.length-pos-1);
        lista[pos]=num;
    }
    public void aniadirDeOtraLista(int initPos){
        lista = Arrays.copyOf(lista, lista.length+lista2.length-initPos);
        System.arraycopy(lista2, initPos, lista, lista.length-lista2.length, lista2.length-initPos);
    }
    public void eliminarPorParametro(int pos){
        System.arraycopy(lista, pos+1, lista, pos, lista.length-pos-1);
        lista = Arrays.copyOf(lista, lista.length-1);
    }
    public void verElementoIndice(int pos){
        System.out.println("El numero en esa posición es " + lista[pos]);
    }
    public int buscarNumEnArray(int num){
        for(int i:lista){
            if(i==num){
                return i;
            }
        }
        return -1;
    }
    public void encolar(int dato){
        aniadirAlFinal(dato);
    }
    public void desencolar(){
        eliminarPorParametro(lista.length-1);
    }
}
