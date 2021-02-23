package com.company.bolum_11_generics.veteriner_birligi;

abstract public class Kisi {

    private String isim;
    private String tckimlik;

    public Kisi(String isim, String tckimlik) {
        this.isim = isim;
        this.tckimlik = tckimlik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    abstract void kendiniTanit();

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tckimlik='" + tckimlik + '\'' +
                '}';
    }
}
