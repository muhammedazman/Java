package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum1 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci Sayiyi Giriniz:");
        int birinciSayi = tara.nextInt();

        System.out.println("Ikinci Sayiyi Giriniz:");
        int ikinciSayi = tara.nextInt();

        System.out.println("Ucuncu Sayiyi Giriniz:");
        int ucuncuSayi = tara.nextInt();

        double ortalamaDegeri = (double) (birinciSayi + ikinciSayi + ucuncuSayi) / 3.0;
        System.out.println("Girilen sayilarin ortalamasi = "+ortalamaDegeri);

        System.out.printf("%.2f", ortalamaDegeri);//virgülden sonra 2 karakter olacak sekilde ekrana yazdir.
    }
}
