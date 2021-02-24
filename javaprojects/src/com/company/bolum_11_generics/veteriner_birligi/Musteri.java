package com.company.bolum_11_generics.veteriner_birligi;

import java.util.ArrayList;

public class Musteri extends Kisi{

    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;

    public Musteri(String isim, String tckimlik, String adres) {
        super(isim, tckimlik);
        this.adres = adres;
        musteriHayvanlari = new ArrayList<>();
    }

    public void musteriyeHayvanEkle(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+ " " + getIsim() + " müstersine eklenildi");
    }

    public void musteriHayvanliariniListele(){
        for (Hayvan h:musteriHayvanlari) {
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString() + " Ben bir müsteriyim");
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
