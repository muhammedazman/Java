package com.company.bolum_11_generics;

public class GenericsMetotKavrami {

    public static void main(String[] args) {

        String[] isimler = {"emre", "ayse", "ali"};
        Integer[] sayilar = {1,5,7,9,10};
        Character[] karakterler = {'a', 'b', 'k'};

        stringDiziYazdir(isimler);
        integerDiziYazdir(sayilar);
        charDiziYazdir(karakterler);

        genericMetinYazdir(isimler);
        genericNumaraYazdir(sayilar);
        //genericMetinYazdir(karakterler);

    }

    public static <Genel extends CharSequence> void genericMetinYazdir(Genel[] dizi){
        for (Genel genel:dizi){
            System.out.println(genel.length());
        }
    }

    public static <Genel extends Number> void genericNumaraYazdir(Genel[] dizi){
        for (Genel genel:dizi){
            System.out.println(genel.intValue());
        }
    }

    public static void diziYazdir(Object[] dizi) {
        for (Object gecici:dizi) {
            System.out.printf((String) gecici);
        }
    }

    public static void stringDiziYazdir(String[] dizi) {
        for (String gecici:dizi) {
            System.out.printf(gecici);
        }
    }

    public static void integerDiziYazdir(Integer[] dizi) {
        for (int sayi:dizi) {
            System.out.println(sayi);
        }
    }

    public static void charDiziYazdir(Character[] dizi) {
        for (char gecici:dizi) {
            System.out.println(gecici);
        }
    }
}
