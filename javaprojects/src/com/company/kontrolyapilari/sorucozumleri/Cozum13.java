package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum13 {

    //Kullanicinin girdigi en buyuk ortak böleni bulan pragram
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz=");
        int sayi1 = tara.nextInt();

        System.out.println("Ikinci sayiyi girini=");
        int sayi2 = tara.nextInt();

        int ebob = 1, kontrol = 2;

        while (kontrol <= sayi1 && kontrol <= sayi2) {

            if (sayi1 % kontrol == 0 && sayi2 % kontrol == 0) {
                ebob = kontrol;
            }

            kontrol++;
        }

        if (ebob == 1) {
            System.out.println(sayi1 + " ve " + sayi2 + " aralarinda asaldir.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " sayilarin EBOB'u = "+ebob);
        }
    }
}
