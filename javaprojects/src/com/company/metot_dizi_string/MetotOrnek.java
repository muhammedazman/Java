package com.company.metot_dizi_string;

import java.util.Scanner;

public class MetotOrnek {

    public static void main(String[] args) {
        int kullaniciSecimi = -1;

        /*
        while (kullaniciSecimi != 0) {
            kullaniciSecimi = menuGoster();
        }
        */

        for(;;) {
            kullaniciSecimi = menuGoster();

            if(kullaniciSecimi == 0) {
                break;
            }

            Scanner tara = new Scanner(System.in);
            System.out.println("Birinci sayiyi giriniz");
            int birinciSayi = tara.nextInt();

            System.out.println("Ikinci sayiyi giriniz");
            int ikinciSayi = tara.nextInt();

            switch (kullaniciSecimi) {

                case 1 :
                    ikiSayiyiCarp(birinciSayi, ikinciSayi);
                    break;

                case 2 :
                    int toplam = ikiSayininToplami(birinciSayi, ikinciSayi);
                    System.out.println("Iki sayinin toplami=" + toplam);
                    break;

                case 3 :
                    ikiSayininKuvvetiniBul(birinciSayi, ikinciSayi);
                    break;

                case 4 :
                    double toplamDouble = ikiSayininToplami((double) birinciSayi, (double) ikinciSayi);
                    System.out.println("Double degerlerin toplami=" + toplamDouble);
                    break;
            }
        }
    }

    //metot overriding
    private static double ikiSayininToplami(double birinciSayi, double ikinciSayi) {
        double toplam = birinciSayi + ikinciSayi;
        return toplam;
    }

    private static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi) {
        double sonuc = Math.pow(birinciSayi, ikinciSayi);
        System.out.println("Sayilarin kuvveti="+sonuc);
    }

    private static int ikiSayininToplami(int birinciSayi, int ikinciSayi) {
        int toplam = birinciSayi + ikinciSayi;
        return toplam;
    }

    private static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
        System.out.println("Sayilarin carpimi=" + (birinciSayi*ikinciSayi));
    }

    public static int menuGoster() {
        System.out.println("*********** MENU *************");
        System.out.println("1 - Iki sayinin carpimini bul ");
        System.out.println("2 - Iki sayinin toplamini bul ");
        System.out.println("3 - Iki sayinin kuvvetini bul ");
        System.out.println("4 - Iki double sayi toplamini bul ");

        System.out.println("Cikmak icin 0 tuslayiniz");

        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();

        return secim;
    }
}
