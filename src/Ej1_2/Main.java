package Ej1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
        Lista lista1 = new Lista();
        Scanner sc = new Scanner(System.in);
        while (num>=0){
            System.out.println("Escribe el siguiente número para el array");
            num=sc.nextInt();
            lista1.encolar(num);
            if(num<0){
                lista1.desencolar();
            }
        }
        System.out.println(Arrays.toString(lista1.lista));
    }
}
