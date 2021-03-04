package com.company.bolum_13_collections_project.udemykursplayer;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    private ArrayList<Ogrenci> kursOgrencileri;
    // Ders sayisi en az 5 ve toplam icerik en az 60 dakika olmali
    private boolean yayinda;

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursOgrencileri= new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.yayinda = false;

        kursEgitmenleri.add(0, basEgitmen);
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public void setKursOgrencileri(Ogrenci eklenecekOgrenci) {
        this.kursOgrencileri.add(eklenecekOgrenci);
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen){
        if (!kursEgitmenleri.contains(yeniEgitmen)) {
            kursEgitmenleri.add(yeniEgitmen);
        } else System.out.println(yeniEgitmen.getIsim() + " zaten kursta tanimlidir!");
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen){
        if (silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())) {
            System.out.println(silinecekEgitmen.getIsim()+" kursun bas egitmenidir. Silinemez!");
        } else {
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim()+" kurs egitmenliginden cikarildi!");
        }

    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }

    public void kursaDersSil(Ders silinecekDers){
        kurstakiDersler.remove(silinecekDers);
    }

    private int kurstakiToplamDersSayisi(){
        return kurstakiDersler.size();
    }

    private int kurstakiToplamDerslerinDakikaSuresi(){
        double toplamSure = 0;
        for (Ders ders:kurstakiDersler) {
            toplamSure+=ders.getDakika();
        }
        return (int) toplamSure;
    }

    public boolean kursYayindaKontrol(){
        if (kurstakiToplamDersSayisi() >= 5 && kurstakiToplamDerslerinDakikaSuresi() >= 60) {
            yayinda = true;
            return true;
        } else return false;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }
}
