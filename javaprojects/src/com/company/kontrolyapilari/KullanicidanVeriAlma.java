package com.company.kontrolyapilari;

import java.util.Scanner;

public class KullanicidanVeriAlma {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);//sistemden veri almak icin IN kullaniriz
        /*int kullanicininGirdigiDeger = tara.nextInt();
        System.out.println("merhaba="+kullanicininGirdigiDeger);

        double kullaniciDouble = tara.nextDouble();
        System.out.println("Kullanicinin girdigi Double degeri="+kullaniciDouble);*/

        String isim = tara.next();//bosluk ile ayrilan yere kadarini alip ekrana yazdiri
        System.out.println("Girilen isim="+isim);

        tara.nextLine();//next() yuzunden bir satiri atlacagi icin bunu ekledik.

        String isimTamami = tara.nextLine();
        System.out.println("Girilen isim ve soyisim="+isimTamami);

        char harf = tara.next().charAt(0);
        System.out.println("Girilen harf="+harf);
    }
}
