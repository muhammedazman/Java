package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum14 {

    //yazinin tersten yazimi ile ayni mi
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Bir kelime giriniz");
        String kelime = tara.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;//index degeri 0 ile basladigi icin -1 dedik
        boolean palidromeMu = true;

        while(altSinir < ustSinir) {

            if (kelime.charAt(altSinir) != kelime.charAt(ustSinir)) {
                palidromeMu = false;
                break;
            }

            altSinir++;
            ustSinir--;
        }

        if (palidromeMu)
            System.out.println(kelime + " kelimesi palindrimen'dur");
        else
            System.out.println(kelime + " kelimesi palindrom degildir");
    }
}
