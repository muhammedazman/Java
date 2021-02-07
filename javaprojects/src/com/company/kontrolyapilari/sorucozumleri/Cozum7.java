package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum7 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.print("Faktöriyeli hesaplanancak sayiyi giriniz = ");
        int sayi = tara.nextInt();

        int sayac = 1;
        long faktoriyel = 1; //int in limiti asildigi taktirde ekrana 0 yazacaktir.
        while (sayac <= sayi) {
            faktoriyel = faktoriyel * sayac;
            sayac++;
        }

        System.out.println(sayi + " sayisinin Faktöriyel degeri = " + faktoriyel);
    }
}
