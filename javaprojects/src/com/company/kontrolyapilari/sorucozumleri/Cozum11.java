package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum11 {

    //Sicak soguk oyunu. Sistemdeki sayisi tahmin etme ve sicak-soguk ifadeleri ile yonlendirme oyunu
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        int uretilenSayi = (int) (Math.random() * 101); //0 ile 100 arasindaki deger olmasi icin 101 ile carpilir. 100 dahil
        int tahmin = -1;//kullanicinin girmemesi gereken bir deger
        int tahminEtmeSayisi = 0;

        while (tahmin != uretilenSayi) {
            System.out.println("Tahmininizi giriniz = ");
            tahmin = tara.nextInt();
            tahminEtmeSayisi++;

            if (tahmin == uretilenSayi) {
                System.out.println("Tebrikler ! "+ tahminEtmeSayisi + " seferde sayiyi buldunuz");
            } else if (tahmin > uretilenSayi) {
                System.out.println("Tahmin ettiniz sayi yüksek, Düsürün");
            } else {
                System.out.println("Tahmin ettigin sayi kücük, Yükseltin");
            }
        }
    }
}
