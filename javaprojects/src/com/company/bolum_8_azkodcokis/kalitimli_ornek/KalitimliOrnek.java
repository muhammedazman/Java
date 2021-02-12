package com.company.bolum_8_azkodcokis.kalitimli_ornek;

public class KalitimliOrnek {

    public static void main(String[] args) {

        Personel personel = new Personel("ahmet", 123456, 40, "müdür");
        System.out.println(personel);

        Ogrenci ogrenci = new Ogrenci("Muhammed", 392185, 30, 357);
        System.out.println(ogrenci);
    }
}

class Kisi {

    private String isim;
    private long tckimlik;
    private int yas;

    public Kisi() {
        isim = "Henüz atanmadi.";
        tckimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tckimlik, int yas) {
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

class Personel extends Kisi {

    private String pozisyon;

    public Personel(String isim, long tckimlik, int yas, String pozisyon) {
        super(isim, tckimlik, yas);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel{" +
                " adi='" + getIsim() + '\'' +
                " tckimlik=" + getTckimlik() +
                " yas=" + getYas() +
                " pozisyon='" + pozisyon + '\'' +
                '}'+"\n";
    }
}

class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String isim, long tckimlik, int yas, int ogrenciNo) {
        super(isim, tckimlik, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                " adi='" + getIsim() + '\''+
                " tckimlik=" + getTckimlik() +
                " yas=" + getYas() +
                " ogrenciNo=" + ogrenciNo + "" +
                '}';
    }
}