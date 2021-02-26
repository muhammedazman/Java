package com.company.bolum_12_collections.list_interface;

import java.util.ArrayList;

public class ArraylistvsArray {

    public static void main(String[] args) {

        ArrayList<String> isimleriListesi = new ArrayList<>();
        String[] isimleriDizisi = new String[7000000];


        long baslamaZamani = System.currentTimeMillis();
        for (int i = 0; i < 7000000; i++) {
            isimleriDizisi[i] = "deneme " + i;

        }
        long bitmeZamani = System.currentTimeMillis();
        System.out.println("Dizi calisma zamani: " + (bitmeZamani-baslamaZamani));

        long baslamaZamani2 = System.currentTimeMillis();
        for (int i = 0; i < 7000000; i++) {
            isimleriListesi.add("deneme " + i);

        }
        long bitmeZamani2 = System.currentTimeMillis();
        System.out.println("Arraylist calisma zamani: " + (bitmeZamani2-baslamaZamani2));


        baslamaZamani=System.currentTimeMillis();
        isimleriDizisi[4000000]="yeni deger";
        bitmeZamani=System.currentTimeMillis();
        System.out.println("Dizi eleman degistirme suresi: "+ (bitmeZamani - baslamaZamani));

        baslamaZamani2=System.currentTimeMillis();
        isimleriListesi.add(4000000, "yeni deger");
        bitmeZamani2=System.currentTimeMillis();
        System.out.println("Listenin eleman degistirme suresi: "+ (bitmeZamani - baslamaZamani));

    }
}
