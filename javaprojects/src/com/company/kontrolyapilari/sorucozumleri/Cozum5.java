package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum5 {

    public static void main(String[] args) {

        //1'den 100'e kadar olan sayilarin toplami
        int toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam += i; //toplam = toplam + i
        }
        System.out.println("1'den 100'e kadar olan sayilarin toplami = "+toplam);

        //iki sayi arasindaki sayilarin toplamini veren program
        Scanner tara = new Scanner(System.in);

        System.out.println("Alt siniri giriniz");
        int altSinirSayi = tara.nextInt();

        System.out.println("Üst siniri giriniz");
        int ustSinirSayi = tara.nextInt();

        int toplam2 = 0;
        for (int i = altSinirSayi; i < ustSinirSayi ; i++) {
            toplam2 += i;
        }

        System.out.println("Iki sayi arasindaki sayilarin toplami = "+toplam2);
    }
}
