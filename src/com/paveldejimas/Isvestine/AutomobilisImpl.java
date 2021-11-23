package com.paveldejimas.Isvestine;

import com.paveldejimas.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis{
    //1. Klases (kintamieji, laukeliai, pozymiai, argumentai, arguments, fields)
    private String Marke;
    private int Duruskaicius;
    private boolean Varomaselektra;

    // 2. Konstruktorius(Konstruktoriai)
    //Konstruktorius su visais parametrais
    //Pirmiausiai perduodami tevo klases (TransportasImpl) pozymiai, kintamieji
    public AutomobilisImpl (String tipas, boolean variklis, int pagaminimometai,
                            //tada perduodami vaiko klases (AutomobilisImpl) pozymiai, kintamieji
                            String marke, int duruskaicius, boolean varomaselektra){
        super(marke, duruskaicius, varomaselektra);
        this.Marke = marke;
        this.Duruskaicius = duruskaicius;
        this.Varomaselektra = varomaselektra;
    }

    @Override
    public String toString() {
        String Varomaselektra2 =isVaromaselektra()?"Eletra":"Neelektra";
        return "AutomobilisImpl{" +
                "tipas=" + getTipas() +
                "isVariklis=" + isVariklis() +
                "pagaminimodata =" + getPagaminimometai() +
                "Marke='" + Marke + '\'' +
                ", Duruskaicius=" + Duruskaicius +
                ", Varomaselektra=" + Varomaselektra2 +
                '}';
    }

    @Override
    public String getMarke() {
        return Marke;
    }

    @Override
    public int getDuruskaicius() {
        return Duruskaicius;
    }

    @Override
    public boolean isVaromaselektra() {
        return true;
    }

    @Override
    public void setMarke(String Marke) {
      this.Marke = Marke;
    }

    @Override
    public void setDuruSkaicius(int Duruskaicius) {
    this.Duruskaicius = Duruskaicius;
    }

    @Override
    public void setVaromaselektra(boolean Varomaselektra) {
    this.Varomaselektra = Varomaselektra;
    }
}
