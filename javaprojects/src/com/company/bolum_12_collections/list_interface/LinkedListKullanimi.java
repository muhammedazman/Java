package com.company.bolum_12_collections.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListKullanimi {

    public static void main(String[] args) {

        //LinkedList her alanina Node deniyor
        //Node: her bir node elemanin da adres bilgilerini tutan HEAD vardir.
        //Yeni bir eleman geldigi zaman yeni gelen Node onceki Node kuyruk gibi bagalaniyor
        //Head: adres Tail: baglanacagi Node un Head adresi

        //yeni eleman eklenirken index bazli olmadigi icin Arraylisten daha hizlidir.
        //Ekleme-Cikarmada cok hizlidir
        //Eleman Bulmada yavastir. Tum listenin gezilmesi gerekemektedir
        //Random Access elemanlara rastgele erisilemez
        //Kullanimi Arraylist, Strack, Quenue, Tek Bagli ve Cift Bagli kullanilabilir
        //Bellek head ve tail bilgileri de tutuldugu icin cok fazla yer kaplar
        //ekleme-cikarma cok fazla yapiliyorsa LinkedList kullanimi cok daha mantikli.
        LinkedList<Integer> sayilar = new LinkedList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(2, 3);
        sayilar.set(1, 10);
        System.out.println(sayilar);
        System.out.println(sayilar.get(1));

        ListIterator<Integer> iterator = sayilar.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<Integer> sayilar1 = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        linkedListeHazirla(sayilar1);
        System.out.println(sayilar1);

        arrayListeHazirla(sayilar2);
        System.out.println(sayilar2);


    }

    public static void arrayListeHazirla(ArrayList<Integer> arrayList){
        for (int i = 0; i < 9; i++) {
            int yeniEklenecekEleman = (int) (Math.random()*5);
            siraliEkle(arrayList, yeniEklenecekEleman);
        }
    }

    public static void linkedListeHazirla(LinkedList<Integer> linkedList){
        for (int i = 0; i < 9; i++) {
            int yeniEklenecekEleman = (int) (Math.random()*5);
            siraliEkle(linkedList, yeniEklenecekEleman);
        }
    }

    public static boolean siraliEkle(List<Integer> liste, int yeniEklenecekEleman){
        ListIterator<Integer> iterator = liste.listIterator();
        while (iterator.hasNext()){
            int karsilastirmaSonucu = iterator.next().compareTo(yeniEklenecekEleman);
            if (karsilastirmaSonucu == 0){
                iterator.add(yeniEklenecekEleman);
                return true;
            } else if (karsilastirmaSonucu > 0 ){
                //yeni eklenecek eleman hafizadaki datadan kucuk oldugu icin once yaz diyoruz
                iterator.previous();
                iterator.add(yeniEklenecekEleman);
                return true;
            } else {

            }
        }
        iterator.add(yeniEklenecekEleman);
        return true;
    }
}
