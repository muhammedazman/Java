package com.company.bolum_11_generics.veteriner_birligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerleri;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        this.sehirdekiVeterinerleri = new ArrayList<>();
        toplamVeterinerSayisi=0;
    }

    public void sehireVeterineEkle(Veteriner veteriner) {
        sehirdekiVeterinerleri.add(veteriner);
        toplamVeterinerSayisi++;
    }

    public void toplamVeterinerSayisiniBul(){
        System.out.println(sehir + " Toplam veteriner sayisi: "+toplamVeterinerSayisi);
    }
}
