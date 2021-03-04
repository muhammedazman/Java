package com.company.bolum_13_collections_project.udemykursplayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;

    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
        izlenecekDersListesi = new LinkedList<>();
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

    public void izlenecekDersEkle(Ders izlenecekDers) {
        boolean dersBulundu = false;
        if (katildigiKurslar.size()>0) {
            for (Kurs kursTemp:katildigiKurslar) {
                if (kursTemp.getKurstakiDersler().contains(izlenecekDers)) {
                    izlenecekDersListesi.add(izlenecekDers);
                    System.out.println("Izlenecekler listesine "+kursTemp.getKursAdi()+" kursunda bulunan "+izlenecekDers.getDersBaslik()+" dersi eklenildi");
                    dersBulundu = true;
                    break;
                }
            }
        }

        if (!dersBulundu){
            System.out.println(izlenecekDers.getDersBaslik() + " isimli ders bu Kurs da bulunmamaktadir veya yetkisiz erisim!");
        }
    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }
}
