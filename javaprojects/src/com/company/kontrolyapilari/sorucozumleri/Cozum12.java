package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum12 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Bir deger giriniz, cikmak icin 0(sifir) tusuna basiniz!");

        int kullaniciDegeri = tara.nextInt();
        int carpimSonucu = 1;
        boolean ilkDegerMi = true;

        while (kullaniciDegeri != 0) {
            carpimSonucu *= kullaniciDegeri;

            System.out.println("Bir deger giriniz, cikmak icin 0(sifir) tusuna basiniz!");
            kullaniciDegeri = tara.nextInt();

            if(kullaniciDegeri > 0 ){
                ilkDegerMi = false;
            }
        }

        if (ilkDegerMi == false)
            System.out.println("Girdiginiz sayilarin carpimi = " +carpimSonucu);
    }
}
