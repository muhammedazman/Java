package com.company.metot_dizi_string;

public class DizilerinKopyalanmasi {

    public static void main(String[] args) {
        int[] anaDizi = {1,7,9,10};
        int[] kopyaDizi = new int[anaDizi.length];

        for (int index = 0; index < anaDizi.length; index++) {
            kopyaDizi[index] = anaDizi[index];
        }

        System.out.println("Kopya Dizi 1 :");
        diziYazdir(kopyaDizi);

        //arraycopy
        int[] kopyaDizi2 = new int[anaDizi.length];
        System.arraycopy(anaDizi,0,kopyaDizi2,0,anaDizi.length);

        System.out.println("Kopya Dizi 2: ");
        diziYazdir(kopyaDizi2);

        int[] denemeDizisi = new int[anaDizi.length];
        denemeDizisi = anaDizi;
        anaDizi[0]=100;//anaDizi yi degistirmeme ragmen degisiklik denemeDiyisinden de olmakta.
        System.out.println("Deneme Dizisi");
        diziYazdir(denemeDizisi);

        System.out.println("**********************");
        System.out.println("Tersi Olusturulan Dizi:");
        diziYazdir(tersiniOlustur(anaDizi));
    }

    private static int[] tersiniOlustur(int[] dizi) {
        int[] tersineDizi = new int[dizi.length];

        for (int i = 0, j=dizi.length-1; i < dizi.length; i++, j--) {
            tersineDizi[i] = dizi[j];
        }

        return tersineDizi;
    }

    public static void diziYazdir(int[] yazdirilacakDizi){
        for (int sayi:yazdirilacakDizi) {
            System.out.println("eleman: "+sayi);
        }
    }
}
