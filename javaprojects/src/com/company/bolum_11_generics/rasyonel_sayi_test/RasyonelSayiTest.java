package com.company.bolum_11_generics.rasyonel_sayi_test;

import com.muhammedazman.RasyonelSayi;

public class RasyonelSayiTest {

    public static void main(String[] args) {
        RasyonelSayi rasyonelSayi = new RasyonelSayi(2, 3);
        RasyonelSayi rasyonelSayi2 = new RasyonelSayi(4, 5);

        RasyonelSayi toplam = rasyonelSayi.topla(rasyonelSayi2);
        System.out.println(toplam);

    }
}
