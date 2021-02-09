package com.company.metot_dizi_string;

import java.util.Arrays;

public class ArraysSinifiKullanimi {

    public static void main(String[] args) {

        int sayilar[] = {1, 9, 5, 7, 19, 11, 120, 55};
        int sayilar2[] = {1, 9, 5, 7, 19, 11, 120, 55};
        System.out.println("Siralama öncesi dizi");
        diziYazdir(sayilar);

        //Arrays.sort(sayilar);
        //Arrays.sort(sayilar, 2,5);
        Arrays.parallelSort(sayilar);
        System.out.println("\nSiralama sonrasi dizi");
        diziYazdir(sayilar);

        int index = Arrays.binarySearch(sayilar, 11);
        System.out.println("\nAranan Degerin Indexi= "+index);

        //index ve degerleri ayni ise sonuc true; degilse false
        //burda degerlerimiz ayni ama sayilar dizisinde siralama yapildigi icin false degeri dondu
        System.out.println("sayilar1 ve sayilar2 ayni mi: "+ Arrays.equals(sayilar, sayilar2));

        int[] yeniDizi = new int[20];
        //Arrays.fill(yeniDizi, 50);
        Arrays.fill(yeniDizi, 0, 9, 50);
        System.out.println("\nYeni dizi: ");
        diziYazdir(yeniDizi);

    }

    private static void diziYazdir(int[] dizi) {
        for (int i:dizi) {
            System.out.print(i + ", ");
        }
    }
}
