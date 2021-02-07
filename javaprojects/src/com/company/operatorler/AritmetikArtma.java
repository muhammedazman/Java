package com.company.operatorler;

public class AritmetikArtma {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;

        sonuc += sayi1; //sonuc = sonuc + sayi1; sonuc = 10
        System.out.println("Sonuc: "+sonuc);

        sonuc -= sayi2; //sonuc = sonuc - sayi2; sonuc = -10
        System.out.println("Sonuc: "+sonuc);

        sonuc *= sayi1; //sonuc = sonuc * sayi1; sonuc = -100
        System.out.println("Sonuc: "+sonuc);

        sonuc /= sayi2; //sonuc = sonuc / sayi1; sonuc = -5
        System.out.println("Sonuc: "+sonuc);

        System.out.println("*********************************");
        //Ödev
        double ondalikliSayi = 6.50;
        double odevSonucu=0;

        odevSonucu++;
        ondalikliSayi *= odevSonucu;

        System.out.println("Sonuc: "+ ondalikliSayi);

        System.out.println("*********************************");
        //Ödev
        int s1 = 10;
        int s2 = 6;

        s1++;
        --s2;

        s1 *= --s2;

        System.out.println("s1 son degeri: "+s1);
        System.out.println("s2 son degeri: "+s2);
    }
}
