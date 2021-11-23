package com;

import com.paveldejimas.Isvestine.Automobilis;
import com.paveldejimas.Isvestine.AutomobilisImpl;
import com.paveldejimas.bazine.Transportas;
import com.paveldejimas.bazine.TransportasImpl;

public class Main {

    public static void main(String[] args) {
	//Sukuriami 5 vaiko klases objektai
        AutomobilisImpl automobilis = new AutomobilisImpl("Oro",true,2030, "Boyeng",5,false);
        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos",true,2000,"Suzuki",5, true);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("Vandens", true,2001, "Krekzdute", 2, true);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("Sausumos", true,1994,"Ferrari",5, true);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Vandens", false, 1999,"Kajak", 0, false);

        //Sukuriami 5 tevo klases objektai
        TransportasImpl transportas = new TransportasImpl("Oro", true, 2030);
        TransportasImpl transportas1 = new TransportasImpl("Oro", true, 2050);
        TransportasImpl transportas2 = new TransportasImpl("Vandens", false, 1999);
        TransportasImpl transportas3 = new TransportasImpl("Vandens", true, 2001);
        TransportasImpl transportas4 = new TransportasImpl("Sausumos", true, 2000);

        //Vaiko ir tevo objektu sudejimas i sarasa
        TransportasImpl[] transporteriai = new TransportasImpl[10];
        transporteriai [0] = automobilis;
        transporteriai [1] = automobilis1;
        transporteriai [2] = automobilis2;
        transporteriai [3] = automobilis3;
        transporteriai [4] = automobilis4;
        transporteriai [5] = transportas;
        transporteriai [6] = transportas1;
        transporteriai [7] = transportas2;
        transporteriai [8] = transportas3;
        transporteriai [9] = transportas4;

        IsveskElektra (transporteriai);
    }
    public static void IsveskElektra(TransportasImpl[] transporteriai){
        String elektrosTipas = "elektra";
        for (TransportasImpl transportasIter : transporteriai) {
            if (transportasIter.isVaromaselektra() == elektrosTipas){
                AutomobilisImpl automobilisTransportas = (AutomobilisImpl) transportasIter;
                System.out.println("Automobilis \"" + automobilisTransportas.getMarke() + "\" yra" + automobilisTransportas.isVaromaselektra());
            }
        }
    }
}
