package Ej2_2_Futbolistas;

import java.util.Comparator;

public class ComparadorFutbolistasNombres implements Comparator<Futbolista> {

    @Override
    public int compare(Futbolista fut1, Futbolista fut2) {
        int res = fut1.nombre.compareTo(fut2.nombre);
        if(res != 0){
            return res;
        } else {
            return fut1.edad - fut2.edad;
        }
    }
}
