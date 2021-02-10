package com.company.oop_giris;

public class Ogrenci {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    public Ogrenci() {
        System.out.println("Ögrenci nesnesi cagriliyor");
        aktif = true;
        ogrenciNo = 999;
        isim = "Henüz isim verilmemis";
        sinif = 127;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.sinif = sinif;
        this.aktif = aktif;
    }

    public void dersAl() {
        System.out.println("Ögrenci ders aliyor");
    }

    public void ogrenciBilgileriniYazdir() {
       if (aktif)
           System.out.println("Adim: " + isim + " numaram: " + ogrenciNo + " sinifim: " + sinif);
       else
           System.out.println("Bu ögrenci aktif degil");
    }
}
