package com.company.oop_giris.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        //Örnek 1
        Ogrenci ogr1 = new Ogrenci(145,"Yeni Ögrenci");
        ogr1.ogrenciBilgileriniYazdir();

        ogr1.setOgrenciNo(10);
        ogr1.setAktif(true);
        ogr1.setIsim("Mehmet");
        ogr1.setSinif(5);

        System.out.println("Ogrenci No: " + ogr1.getOgrenciNo());
        System.out.println("Ismi : " + ogr1.getIsim());
        System.out.println("Sinif No: " + ogr1.getSinif());
        System.out.println("Aktif mi? : " + ogr1.isAktif());

        //Örnek 2
        Televizyon tv = new Televizyon();
        tv.ac();
        tv.setSesSeviyesi(25);
        tv.setKanal(20);
        tv.kapat();
        tv.goster();
    }
}
