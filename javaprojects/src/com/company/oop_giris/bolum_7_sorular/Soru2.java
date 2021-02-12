package com.company.oop_giris.bolum_7_sorular;

import java.util.Arrays;

public class Soru2 {

    public static void main(String[] args) {
        Ogrenci tumOgrenciler[] = new Ogrenci[100];

        for (int i = 0; i < 100; i++) {
            int rastgeleID = (int) (Math.random() * 5000);
            int rasteleNotDegeri = (int) (Math.random() * 100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rasteleNotDegeri);
            tumOgrenciler[i] = yeni;
        }
        ogrencileriNotlarinaGoreSirala(tumOgrenciler);

        for (int i = 0; i < 100; i++) {
            tumOgrenciler[i].ogrenciBilgileriniYazdir();
        }
    }

    private static void ogrencileriNotlarinaGoreSirala(Ogrenci[] tumOgrenciler) {
        for (int i = 0; i < tumOgrenciler.length; i++) {

            //en buyuk elemanin ve indexinin bulunmasi
            int oankienBuyukSayi = tumOgrenciler[i].getNotDegeri();
            int oankiEnBuyukElemanIndex = i;

            for (int j = i+1; j < tumOgrenciler.length; j++) {

                if(oankienBuyukSayi < tumOgrenciler[j].getNotDegeri()) {
                    oankienBuyukSayi = tumOgrenciler[j].getNotDegeri();
                    oankiEnBuyukElemanIndex = j;
                }
            }

            if(oankiEnBuyukElemanIndex != i) {
                tumOgrenciler[oankiEnBuyukElemanIndex] = tumOgrenciler[i];
                tumOgrenciler[i].setNotDegeri(oankienBuyukSayi);
            }
        }
    }
}

class Ogrenci{

    private int id;
    private int notDegeri;

    public Ogrenci(int id, int notDegeri){
        this.id=id;
        this.notDegeri=notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }

    public void ogrenciBilgileriniYazdir(){
        System.out.println("id "+id+" not"+notDegeri);
    }
}