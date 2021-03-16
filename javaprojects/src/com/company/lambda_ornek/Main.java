package com.company.lambda_ornek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

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

        // kendi interface sinifimiz ile yapilan ornek
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

        // Thread kavarmi
        //new Thread(new ThreadSinifi()).start();
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim run calisti");
            }
        }).start();
*/
      //  new Thread(() -> System.out.println("Lambda anonim calisti")).start();

        // Comparator
        Collections.sort(calisanArrayList, new Comparator<Calisan>() {
            @Override
            public int compare(Calisan o1, Calisan o2) {
                return o1.getIsim().compareTo(o2.getIsim());
            }
        });

        System.out.println("Comparator ornegi:");
        for (Calisan calisan:calisanArrayList) {
            System.out.println(calisan.getIsim());
        }

        Collections.sort(calisanArrayList,(o1, o2) ->  o2.getIsim().compareTo(o1.getIsim()));

        System.out.println("Comparator Lambda Ornegi:");
        for (Calisan calisan:calisanArrayList) {
            System.out.println(calisan.getIsim());
        }

        // consumer interface
        calisanArrayList.forEach(new Consumer<Calisan>() {
            @Override
            public void accept(Calisan calisan) {
                System.out.println("Normal kullanim: "+ calisan.getIsim()+" "+calisan.getYas());
            }
        });

        // forEach Lambda
        calisanArrayList.forEach(calisan -> System.out.println("Lambda kullanim: "+ calisan.getIsim()+" "+calisan.getYas()));
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