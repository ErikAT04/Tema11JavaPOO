package Ej1_5;

import Ej1_5.Local.LocalAlquilable;
import Ej1_5.Local.LocalVendible;
import Ej1_5.Piso.PisoVendible;

public class Main {
    public static void main(String[] args) {
        LocalVendible locven1 = new LocalVendible("Calle Cerrada, 3", 20, 3, "A", 250);
        LocalAlquilable localq= new LocalAlquilable("Calle Abierta, 2", 20, 2, "Si");
        PisoVendible pisvend = new PisoVendible("Ass", 25, 2, 1, 1, false, 250);

    }
}
