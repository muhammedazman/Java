package com.company.bolum_12_collections.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        //belirli indeksteki elemani gunceller
        isimler.set(0, "guncel azman");
        System.out.println(isimler);

        //index degerine datayi basar
        isimler.add(2,"hayriye");
        System.out.println(isimler);

        //aranilan kaydi siler
        //iki farkli kullanimi vardir.
        isimler.remove("hayriye");
        isimler.remove(2);


        isimler.add("kemal");
        isimler.add("mustafa");
        isimler.add("can");
        System.out.println(isimler);
        //belirli listedeki elemanalari yeni bir listeye atar
        //isimler.subList(1,3) geriye List degerini dondurur.
        List<String> yeniIsimlerListesi = isimler.subList(1,3);
        System.out.println(yeniIsimlerListesi);

        //iki listeyi birlestirmek
        ArrayList<String> erkekIsimleri = new ArrayList<>();
        erkekIsimleri.add("muhammed");
        erkekIsimleri.add("ali");

        ArrayList<String> kadinIsimleri = new ArrayList<>();
        kadinIsimleri.add("yeliz");
        kadinIsimleri.add("ceren");

        erkekIsimleri.addAll(kadinIsimleri);
        System.out.println(erkekIsimleri);
        //veya
        erkekIsimleri.addAll(0,kadinIsimleri);
        System.out.println(erkekIsimleri);

        //array i listeye donusturme
        String[] sehirler = {"ankara", "bursa", "izmir"};
        List<String> sehirlerListe;

        sehirlerListe = Arrays.asList(sehirler);
        System.out.println(sehirlerListe);

        ArrayList<String> sehirler2 = new ArrayList<>(Arrays.asList(sehirler));
        System.out.println(sehirler2);

        List<String> sehirler3 = new ArrayList<>();
        Collections.addAll(sehirler3, sehirler);
        System.out.println(sehirler3);


    }
}
