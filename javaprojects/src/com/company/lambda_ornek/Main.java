package com.company.lambda_ornek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Calisan c1 = new Calisan("muhammed", 30);
        Calisan c2 = new Calisan("hasan", 31);
        Calisan c3 = new Calisan("ayse", 29);
        Calisan c4 = new Calisan("bekir", 28);

        ArrayList<Calisan> calisanArrayList = new ArrayList<>();
        calisanArrayList.add(c1);
        calisanArrayList.add(c2);
        calisanArrayList.add(c3);
        calisanArrayList.add(c4);

        for (Calisan calisan:calisanArrayList) {
            bilgileriYazdir(new YazdiranInterface() {
                @Override
                public void yazdir() {
                    System.out.println(calisan.getIsim()+" "+calisan.getYas());
                }
            });
        }

        System.out.println("Lambda Metodu");
        for (Calisan calisan : calisanArrayList) {
            bilgileriYazdir(() -> System.out.println(calisan.getIsim()+" "+calisan.getYas()));
        }

        new Thread(new ThreadSinifi()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim run calisti");
            }
        }).start();

        new Thread(() -> System.out.println("Lambda anonim calisti")).start();
    }

    public static void bilgileriYazdir(YazdiranInterface yazdiranInterface){
        yazdiranInterface.yazdir();
    }
}

class Calisan{
    private String isim;
    private int yas;

    public Calisan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

class ThreadSinifi implements Runnable {

    @Override
    public void run() {
        System.out.println("ThreadSinifi calisti");
    }
}