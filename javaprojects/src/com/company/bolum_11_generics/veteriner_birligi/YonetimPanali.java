package com.company.bolum_11_generics.veteriner_birligi;

public class YonetimPanali<T> {

    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }

    public <T extends Musteri> void sahipOlduguHayvanlariGoster(T musteri){
        ((Musteri) musteri).musteriHayvanliariniListele();
    }

    public <T extends Veteriner> void veterinerMusterileriniListele(T veteriner){
        ((Veteriner) veteriner).musterileriListele();
    }
}
