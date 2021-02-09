package com.company.metot_dizi_string.sorucozumleri;

import java.util.Scanner;

public class Cozum5 {

    /**
     * Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam soru sayısına bağlı olarak, öğrencilerin soruya
     * verdiği cevapları tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun. Değerler A,B,C,D,E olmalı.
     * Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da rastgele oluşturulmalı.
     * Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.
     * */
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Toplam ögrenci sayisini girniz!");
        int ogrenciSayisi = tara.nextInt();

        System.out.println("Toplam soru sayisini giriniz!");
        int soruSayisi = tara.nextInt();

        //5,10 ==> 5 x 10 matris
        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];//ogrenci sayisi kadar satir, soru sayisi kadar sutun
        char[] cevapAnahtari = new char[soruSayisi];

        cevaAnahtariOlustur(cevapAnahtari);

        ogrenciCevaplariniYerlestir(tumCevaplar);

        ogrenciCevaplariniGoruntuler(tumCevaplar);

        ogrenciDegerlendir(cevapAnahtari, tumCevaplar);

        cevapAnahtariniGoruntule(cevapAnahtari);

    }

    private static void cevapAnahtariniGoruntule(char[] cevapAnahtari) {
        for (char cevap:cevapAnahtari) {
            System.out.print(cevap + ", ");
        }
    }

    private static void ogrenciCevaplariniGoruntuler(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
                System.out.print(tumCevaplar[satir][sutun] + ", ");
            }
            System.out.println();
        }
    }

    private static void ogrenciDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {

            int dogruCevapSayisi = 0;
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {

                if (tumCevaplar[satir][sutun] == cevapAnahtari[sutun])
                    dogruCevapSayisi++;
            }

            System.out.println(satir + " indexsindeki ögrencinin dogru cevap sayisi: " + dogruCevapSayisi);
        }
    }

    private static void cevaAnahtariOlustur(char[] cevapAnahtari) {

        for (int i = 0; i < cevapAnahtari.length; i++) {
            cevapAnahtari[i] = cevapOlustur();
        }
    }

    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {

        for (int satir = 0; satir < tumCevaplar.length; satir++) {

            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {

                tumCevaplar[satir][sutun] = cevapOlustur();
            }
        }
    }

    public static char cevapOlustur() {
        //ASCII kodlari A:65. B:66, C:67, D:68, E:69
        //0,1,2,3,4
        int rastgeleSayi = 65 + (int) (Math.random() * 5);
        return (char) rastgeleSayi;
    }
}
