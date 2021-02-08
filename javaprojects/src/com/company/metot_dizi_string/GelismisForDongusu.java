package com.company.metot_dizi_string;

public class GelismisForDongusu {

    public static void main(String[] args) {

        int[] sayilar = {1, 5, 7 -9, 62};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("eleman: "+sayilar[i]);
        }

        for (int sayi: sayilar) {
            System.out.println("eleman: "+sayi);
        }

        String isimler[] = {"Emre", "Hasan", "Ali"};

        diziYazdir(isimler);
    }

    private static void diziYazdir(String[] isimler) {
        for (String isim : isimler) {
            System.out.println("Isim: "+isim);
        }
    }
}
