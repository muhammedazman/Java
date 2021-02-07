package com.company.kontrolyapilari.sorucozumleri;

public class Cozum4 {

    public static void main(String[] args) {

        //for döngüsü
        for (int i = 0; i < 5; i++) {
            System.out.println("For döngüsü " + (i+1) +". tur : Muhammed Azman");
        }

        //while döngüsü
        int sayac = 0;
        while (sayac < 5) {
            System.out.println("While döngüsü " + (sayac+1) +".tur");
            sayac++;
        }

        //do while döngüsü
        int sayac2 = 0;
        do {
            System.out.println(" Do While döngüsü " + (sayac2+1) + ".tur");
            sayac2++;
        } while (sayac2 < 5);
    }
}
