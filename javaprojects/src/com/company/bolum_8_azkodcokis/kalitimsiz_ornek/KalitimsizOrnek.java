package com.company.bolum_8_azkodcokis.kalitimsiz_ornek;

public class KalitimsizOrnek {

    public static void main(String[] args) {

        Personel mudur = new Personel("ahmet", 392181553, 8);
        System.out.println(mudur);

        Ogrenci ogrenci = new Ogrenci("emre", 7895462, 18, 8523);
        System.out.println(ogrenci);
    }
}

class Personel {

    private String isim;
    private long tckimlik;
    private int yas;

    public Personel() {
        isim = "Henüz atanmadi.";
        tckimlik = 0;
        yas = 18;
    }

    public Personel(String isim, long tckimlik, int yas) {
        this.isim = isim;
        this.tckimlik = tckimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(long tckimlik) {
        this.tckimlik = tckimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas >= 18) {
            this.yas = yas;
        } else {
            this.yas = 18;
        }
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " tckimlik: " + tckimlik + " yas: " + yas;
    }
}

class Ogrenci {
    private String isim;
    private int yas;
    private long tckimlik;
    private int ogrencino;

    public Ogrenci() {
        this.isim = "Henüz atanmadi";
        this.yas = 18;
        this.tckimlik = 0;
        this.ogrencino = 5000;
    }

    public Ogrenci(String isim, int yas, long tckimlik, int ogrencino) {
        this.isim = isim;
        this.yas = yas;
        this.tckimlik = tckimlik;
        this.ogrencino = ogrencino;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(long tckimlik) {
        this.tckimlik = tckimlik;
    }

    public int getOgrencino() {
        return ogrencino;
    }

    public void setOgrencino(int ogrencino) {
        this.ogrencino = ogrencino;
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " tckimlik: " + tckimlik + " yas: " + yas + " okulno: " + ogrencino;
    }
}
