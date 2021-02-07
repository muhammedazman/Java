package com.company.kontrolyapilari;

import java.util.Scanner;

public class OdevCozumleri {

    public static void main(String[] args) {

        //Cözüm 1
        int boy = 0;
        double kilo = 0;
        Scanner tara = new Scanner(System.in);

        System.out.println("Vücut kitle index programina hosgeldiniz!");
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz!!!");
        boy = tara.nextInt();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz!!!");
        kilo = tara.nextDouble();

        //kile(kg) / ((boy(cm)/100) karesi)
        double endeks = 0;
        double cmToMetre = (double) boy / 100;
        double boyunKaresi = Math.pow(cmToMetre,2);

        endeks = kilo / boyunKaresi;

        System.out.println("Bulunan Endeks Degeri="+endeks);

        if (endeks < 15) { System.out.println("Cok ciddi derece düsük kilolu"); }
        else if (endeks >= 15 && endeks < 16) { System.out.println("ciddi derece düsük kilolu"); }
        else if (endeks >= 16 && endeks < 18.5) { System.out.println("düsük kilolu"); }
        else if (endeks >= 18.5 && endeks < 25) { System.out.println("Normal"); }
        else if (endeks >= 25 && endeks < 30) { System.out.println("Fazla Kilolu"); }
        else if (endeks >= 30 && endeks < 35) { System.out.println("1.derece obez"); }
        else if (endeks >= 35 && endeks < 40) { System.out.println("2.derece obez"); }
        else if (endeks >= 40) { System.out.println("3.derece obez"); }

        //CÖZÜM 2
        int sansliSayi = (int) (Math.random() * 99) + 1;
        //int sansliSayi = 87; //kontrol degeri

        System.out.println("Lütfen tahmininizi giriniz\n");
        int tahminEdilenSayi = tara.nextInt();

        //Sansli Sayi Birinci ve Ikinci Sayilari
        int sansliSayiBirinciBasamak = sansliSayi / 10;
        int sansliSayiIkinciBasamak = sansliSayi % 10;

        //Tahmin Edilen Sayi Birinci ve Ikinci Sayilari
        int tahminSayiBirinciBasamak = tahminEdilenSayi / 10;
        int tahminSayiIkinciBasamak = tahminEdilenSayi % 10;

        if (sansliSayi == tahminEdilenSayi) {
            System.out.println("Tebrikler 10000 TL kazandiniz Sansli Sayi="+sansliSayi+" Tahmin Edilen Sayi="+tahminEdilenSayi);
        } else if (sansliSayiBirinciBasamak == tahminSayiIkinciBasamak && sansliSayiIkinciBasamak == tahminSayiBirinciBasamak) {
            System.out.println("Tebrikler 5000 TL kazandiniz Sansli Sayi="+sansliSayi+" Tahmin Edilen Sayi="+tahminEdilenSayi);
        } else if (sansliSayiBirinciBasamak == tahminSayiBirinciBasamak || sansliSayiIkinciBasamak == tahminSayiIkinciBasamak
                    || sansliSayiBirinciBasamak == tahminSayiIkinciBasamak || sansliSayiIkinciBasamak == tahminSayiBirinciBasamak){
            System.out.println("Tebrikler 1000 TL kazandiniz Sansli Sayi="+sansliSayi+" Tahmin Edilen Sayi="+tahminEdilenSayi);
        } else {
            System.out.println("Maalesef öd+l kazanamadiniz. Sansli Sayi="+sansliSayi+" Tahmin Edilen Sayi="+tahminEdilenSayi );
        }


    }
}
