package com.company.operatorler;

public class IslemOnceligi {

    public static void main(String[] args) {
        /**
         * 1.() önce parantey hesaplanir
         * 2.++ ve -- (eger degiskenden önce ise)
         * 3.carpma ve bölme
         * 4.toplama ve cikarma
         * 5.= atama islemi
         * 6.++ ve -- (eger degiskenden sonra ise)
         */
        int sayi1 = 15;
        int sayi2 = 5;
        int sonuc = 0;

        sonuc = (sayi1 + sayi2*2 -sayi2) + sayi2 -sayi1 *4 + sayi1;
        System.out.println("Sonuc: "+ sonuc);

        sonuc = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1;
        System.out.println("Sonuc: "+ sonuc);
    }
}
