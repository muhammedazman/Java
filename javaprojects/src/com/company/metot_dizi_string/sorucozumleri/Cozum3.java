package com.company.metot_dizi_string.sorucozumleri;

public class Cozum3 {

    /**
     * Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki elemanları karıştırın ve de
     * ilk kullanıcıya hangi 4 kartın geldiğini ekrana yazdırın
     * */
    public static void main(String[] args) {

        String kartTurleri[] = {"Kupa", "Maca", "Karo", "Sinek"};
        String kartNumaralari[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int deste[] = new int[52];

        desteOlustur(deste);
        desteyiKaristir(deste);
        desteGoster(deste, kartTurleri, kartNumaralari);
    }

    private static void desteyiKaristir(int[] deste) {

        for (int i = 0; i < deste.length; i++) {

            int rastgeleIndex = (int) (Math.random() * deste.length);
            int gecici = deste[i];

            deste[i] = deste[rastgeleIndex];
            deste[rastgeleIndex] = gecici;

        }
    }

    private static void desteGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for (int i = 0; i < 4; i++) {

            String kartTuru = kartTurleri[deste[i] / 13];//1 den 4 e kadar sayi elde etmek iin 13 e boluyoruz
            String kartNumarasi = kartNumaralari[deste[i] % 13];

            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }

    private static void desteOlustur(int[] deste) {
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
    }
}
