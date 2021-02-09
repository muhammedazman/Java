package com.company.metot_dizi_string.sorucozumleri;

public class Cozum1 {

    /**
     * 100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele olacak şekilde üretin.
     * Bu işlemden sonra dizideki elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç tane eleman
     * olduğunu yazdırın.
     */
    public static void main(String[] args) {

        int[] sayilar = new int[100];
        int tumSayilarinToplami=0;

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 100);
            tumSayilarinToplami+=sayilar[i];
        }

        diziYazdir(sayilar);
        System.out.print("\nToplam: "+ tumSayilarinToplami);

        double ortalama =  (double) tumSayilarinToplami/sayilar.length;


        int ortalamaAltindaKalanDegerlerinSayisi = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < ortalama) {
                ortalamaAltindaKalanDegerlerinSayisi++;
            }
        }

        System.out.print("\nOrtalama: "+ ortalama + " ve ortalamanin altindaki degerlerin sayisi: "+ ortalamaAltindaKalanDegerlerinSayisi);
    }

    private static void diziYazdir(int[] sayilar) {
        for(int sayi:sayilar){
            System.out.print(sayi+", ");
        }
    }
}
