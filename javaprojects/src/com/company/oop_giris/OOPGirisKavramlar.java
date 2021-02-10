package com.company.oop_giris;

public class OOPGirisKavramlar {

    public static void main(String[] args) {
        /*Dikdortgen d1 = new Dikdortgen();
        d1.en = 5;
        d1.boy = 10;

        Dikdortgen d2 = new Dikdortgen();
        d1.en = 3;
        d1.boy = 8;*/

        Ogrenci[] tumOgrenciler = new Ogrenci[500];

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

        emre = hasan;

        System.out.println("EMRENIN BILGILERI YADIRILACAK");
        emre.ogrenciBilgileriniYazdir();
        System.out.println("HASANIN  BILGILERI YADIRILACAK");
        hasan.ogrenciBilgileriniYazdir();

        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci(5);
        Ogrenci ogr3 = new Ogrenci(5, "ogr3");
        Ogrenci ogr4 = new Ogrenci(5, "ogr3", (byte) 5);
        Ogrenci ogr5 = new Ogrenci(5, "ogr3", (byte) 12, true);

        tumOgrenciler[0] = ogr1;
        tumOgrenciler[1] = ogr2;
        tumOgrenciler[2] = ogr3;
        tumOgrenciler[3] = ogr4;
        tumOgrenciler[4] = ogr5;
        tumOgrenciler[5] = new Ogrenci(10, "yeni", (byte) 12, true);

        tumOgrenciler[2].aktif = true;
        tumOgrenciler[2].sinif = 5;
        tumOgrenciler[2].ogrenciBilgileriniYazdir();

        tumOgrenciler[5].ogrenciBilgileriniYazdir();
    }
}
