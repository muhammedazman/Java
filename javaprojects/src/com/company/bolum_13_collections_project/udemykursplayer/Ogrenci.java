package com.company.bolum_13_collections_project.udemykursplayer;

import java.util.ArrayList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;

    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }

    public void kursaKatil(Kurs javaKursu) {
        if (javaKursu.kursYayindaKontrol()) {
            javaKursu.setKursOgrencileri(this);
            katildigiKurslar.add(javaKursu);

            System.out.println(this.getIsim()+" isimli kullanici "+ javaKursu.getKursAdi()+" isimli kursa katildi");
        } else {
            System.out.println(javaKursu.getKursAdi()+" isimli kurs yayinda degil; Katilamazsiniz!");
        }
    }
}
