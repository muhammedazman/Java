package com.company.oop_giris;

public class OOPGirisKavramlar {

    public static void main(String[] args) {
        /*Dikdortgen d1 = new Dikdortgen();
        d1.en = 5;
        d1.boy = 10;

        Dikdortgen d2 = new Dikdortgen();
        d1.en = 3;
        d1.boy = 8;*/

        int[] sayilar = new int[50];
        sayilar[0] = 1;
        int[] sayilarinHepsi = {5, 6,9, 7};

        Ogrenci emre = new Ogrenci();
        emre.ogrenciNo = 296;
        emre.isim = "Emre";
        emre.aktif = true;
        emre.sinif = 9;
        emre.ogrenciBilgileriniYazdir();

        Ogrenci hasan = new Ogrenci();
        hasan.ogrenciNo = 76;
        hasan.isim = "Hasan";
        //hasan.aktif = true;
        hasan.sinif = 12;
        hasan.ogrenciBilgileriniYazdir();

        Ogrenci bos = new Ogrenci();
        bos.ogrenciBilgileriniYazdir();

        Ogrenci ayse = new Ogrenci(500, "Ayse Yilmaz", (byte) 5, true);
        ayse.ogrenciBilgileriniYazdir();
    }
}
