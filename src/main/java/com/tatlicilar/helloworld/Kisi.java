package com.tatlicilar.helloworld;

/**
 * Created by neval on 10/06/17.
 */

public class Kisi {

    String isim;
    String parola;

    public Kisi(String isim, String parola) {
        this.isim = isim;
        this.parola = parola;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


}
