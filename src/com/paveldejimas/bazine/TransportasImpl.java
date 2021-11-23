package com.paveldejimas.bazine;

public class TransportasImpl implements Transportas{
    //1. Klases (kintamieji, laukeliai, pozymiai, argumentai, arguments, fields)
    private String Tipas;
    private boolean Variklis;
    private int Pagaminimometai;

    // 2. Konstruktorius(Konstruktoriai)
    //Konstruktorius su visais parametrais
    public TransportasImpl(String Tipas, boolean Variklis, int Pagaminimometai ) {
        this.Tipas = Tipas;
        this.Variklis = Variklis;
        this.Pagaminimometai = Pagaminimometai;
    }

    @Override
    public String toString() {
        String Variklis2 =isVariklis()?"Elektra":"Neelektra";
        return "TransportasImpl{" +
                "Tipas='" + Tipas + '\'' +
                ", Variklis=" + Variklis2 +
                ", Pagaminimometai=" + Pagaminimometai +
                '}';
    }

    @Override
    public String isVaromaselektra(){
        return "none";
    }
    @Override
    public String getTipas() {
        return Tipas;
    }

    @Override
    public boolean isVariklis() {
        return true;
    }

    @Override
    public int getPagaminimometai() {
        return Pagaminimometai;
    }

    @Override
    public void setTipas(String Tipas) {
    this.Tipas = Tipas;
    }

    @Override
    public void setVariklis(boolean Variklis) {
    this.Variklis = Variklis;
    }

    @Override
    public void setPagaminimometai(int Pagaminimometai) {
    this.Pagaminimometai = Pagaminimometai;
    }
}
