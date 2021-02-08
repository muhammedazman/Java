package com.company.metot_dizi_string;

public class MetotlaraDiziGondermekveAlmak {

    public static void main(String[] args) {

        int[] sayilar = {1,2,3};
        diziGoster(sayilar);

        System.out.println("metottan önce index 0 : " + sayilar[0]);

        degeriBirArtir(sayilar[0]);
        System.out.println("metottan sonra index 0 : " + sayilar[0]);

        System.out.println("Dizi degerlerini arttirmadan önce ");
        diziDegerleriniBirArtir(sayilar);

        System.out.println("Dizi degerlerini arttirmadan sonra ");
        diziGoster(sayilar);

        toplaminiBul(5,7);
        toplaminiBul(5,7, 8);

        toplaminiBul(1,2,3,4,78,12);

    }
    private static void toplaminiBul(int... ints) {
        int toplam = 0;
        for (int i:ints) {
            toplam += i;
        }
        System.out.println("Toplam= "+toplam);
    }

    private static void toplaminiBul(int i, int j) {
        int toplam;

        toplam = i + j;
        System.out.println("Gelen parametrelerin toplami: "+toplam);
    }

    private static void toplaminiBul(int i, int j, int a) {
        int toplam;

        toplam = i + j + a;
        System.out.println("Gelen parametrelerin toplami: "+toplam);
    }

    private static void diziDegerleriniBirArtir(int[] sayilar) {
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }

    private static void degeriBirArtir(int sayi) {
        //sayi++;
    }

    private static void diziGoster(int[] sayilar) {
        for (int sayi:sayilar) {
            System.out.println("eleman="+sayi);
        }
    }
}
