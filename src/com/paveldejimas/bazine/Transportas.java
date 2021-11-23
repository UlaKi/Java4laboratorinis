package com.paveldejimas.bazine;

public interface Transportas {
    String getTipas ();
    boolean isVariklis ();
    int getPagaminimometai ();
    void setTipas (String Tipas);
    void setVariklis (boolean Variklis);
    void setPagaminimometai (int Pagaminimometai);
}
