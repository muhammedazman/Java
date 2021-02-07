package com.company.kontrolyapilari;

public class IfElseKullanimi {

    public static void main(String[] args) {
        int benimYasim = 30;
        int onunYasi = 25;

        if (benimYasim > onunYasi) {
            System.out.println("Ben senden büyügüm!");
        } else if (benimYasim < onunYasi) {
            System.out.println("Ben senden kücügüm!");
        } else {
            System.out.println("Yaslarimiz ayni!");
        }

        System.out.println("Program Sonlandi!***************");

        int sayi = 10;

        if (sayi>5) {
            System.out.println("Sayi 5 den büyük");
        }

        if (sayi<10)
            System.out.println("Sayi 10dan kücük");
            //System.out.println("program yeniden sonlandi");
    }
}
