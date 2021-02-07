package com.company.kontrolyapilari;

public class MathSinifiKullanimi {

    public static void main(String[] args) {

        System.out.println("Pi Sayisi="+Math.PI);
        System.out.println("E Sayisi="+Math.E);

        System.out.println("-5 in Mutlak Degeri="+Math.abs(-5));
        System.out.println("4.6 in yukari yuvarlanmis Degeri="+Math.ceil(4.6));//5
        System.out.println("4.3 in yukari yuvarlanmis Degeri="+Math.ceil(4.3));//5

        System.out.println("2 nin küpü="+Math.pow(2,3));//2 üzeri 3 un degeri = 8
        System.out.println("16 nin karekökü="+Math.sqrt(16));

        System.out.println("hangi sayi daha büyük="+Math.max(2,3));//3
        System.out.println("hangi sayi daha kücük="+Math.min(2,3));//2

        int onaKadarRastgeleSayi = (int) ((Math.random() * 10) + 1);//0.0 baslar 0.999999 a kadar deger üretir
        System.out.println("Rastgele Üretilen Sayi="+onaKadarRastgeleSayi);

        int ikiyeKadarSayiUret = (int) ((Math.random() * 2) + 1);//2 ye kadar oldugu icin 2 ile carptim
        System.out.println("Ikiye kadar üretilen sayi="+ikiyeKadarSayiUret);

        int sifirdanOnakadarSayiUret = (int) (Math.random() * 11); //carpilacak sayi maximum degerden 1 fazla olmalidir.
        System.out.println("Sifirdan On'a kadar sayi="+sifirdanOnakadarSayiUret);
    }
}
