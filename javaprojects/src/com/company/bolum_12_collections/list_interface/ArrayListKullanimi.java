package com.company.bolum_12_collections.list_interface;

import java.util.ArrayList;

public class ArrayListKullanimi {

    public static void main(String[] args) {
        //Bellekte 10 tane eleman tutna bir arraylist olustur
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        //verdiginiz deger kadar eleman tutacak bir arraylist ousturur
        ArrayList<String> isimler = new ArrayList<>(20);
        isimler.add("muhammed");
        isimler.add("hasan");
        isimler.add("ali");

        //arraylistin verilen sayi kadar eleman tutucak sekilde arttirir
        isimler.ensureCapacity(100);

        //icindeki eleman kadarini kullandirip geri kalan kismi trim eder
        isimler.trimToSize();

        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);
        System.out.println(isimlerYedek);

        //eleman sayisini gösterir
        System.out.println(isimlerYedek.size());

        //liste bos ise true doner
        System.out.println(isimlerYedek.isEmpty());

        //listeyi temizler
        isimlerYedek.clear();
        System.out.println(isimlerYedek.isEmpty());

        //aratilan datanin olup olamdigini kontrol ediyor
        System.out.println(isimler.contains("hasan"));
        System.out.println(isimler.contains("fatma"));

        //bu arraylisti bir array a donusturebilirim
        //toArray Object turunden data dondurdugu icin type-casting yapmamiz gerekir
        //Bu kod hatali sonuc donduruyor
        //String[] isimlerArray = (String[]) isimler.toArray();

        String[] isimlerArray = isimler.toArray(new String[0]);
        System.out.println(isimlerArray);

    }
}
