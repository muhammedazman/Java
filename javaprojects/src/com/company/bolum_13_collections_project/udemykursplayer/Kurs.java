package com.company.bolum_13_collections_project.udemykursplayer;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    // Ders sayisi en az 5 ve toplam icerik en az 60 dakika olmali
    private boolean yayinda;

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        kursEgitmenleri.add(basEgitmen);

        this.yayinda = false;
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen){
        kursEgitmenleri.add(yeniEgitmen);
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen){
        kursEgitmenleri.remove(silinecekEgitmen);
    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }

    public void kursaDersSil(Ders silinecekDers){
        kurstakiDersler.remove(silinecekDers);
    }

    public int kurstakiToplamDersSayisi(){
        return kurstakiDersler.size();
    }

    public int kurstakiToplamDerslerinDakikaSuresi(){
        double toplamSure = 0;
        for (Ders ders:kurstakiDersler) {
            toplamSure+=ders.getDakika();
        }
        return (int) toplamSure;
    }
}
