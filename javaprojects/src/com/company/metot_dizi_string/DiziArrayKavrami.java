package com.company.metot_dizi_string;

import java.util.Scanner;

public class DiziArrayKavrami {

    public static void main(String[] args) {

        //Dizi Kavramlari
        int sayilar1[] = new int[10];
        int[] sayilar2 = new int[10];
        int []sayilar3 = new int[10];

        int[] sayilar4 = {1,2,3,4,5}; //int[5] ve data birlikte initial olur

        sayilar1[0] = 1;
        sayilar1[1] = 2;
        sayilar1[2] = 3;
        sayilar1[3] = 4;
        sayilar1[4] = 5;
        //sayilar1[11] = 11; //index uzunlugunun disina bir veri eklemeye calisildiginda hata verecektir

        int yeniDizi[]; //initial olmadan veri basilamaz.
        yeniDizi = new int[5];//bu adimdan sonra bu elemente veri eklenebilir


        //Cözüm 1

        int sayilar[] = new int[10];
        for (int index = 0; index < sayilar.length; index++) {
            sayilar[index] = (int) Math.pow(index,2); //karesini alma
        }

        for (int sayi : sayilar) {
            System.out.println(sayi);
        }

        //Cözüm 2
        String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran",
                          "Temmuz", "Agustos", "Eylül", "Ekim", "Kasim", "Aralik"};

        Scanner tara = new Scanner(System.in);
        System.out.println("Ay degerini rakamla yaziniz!");
        int ay = tara.nextInt()-1;

        System.out.println("Sectiginiz ay="+aylar[ay]);

        //Cözüm 3
        System.out.println("Kac tane sayinin ortalamasini bulmak istiyorum!");
        int sayi = tara.nextInt();

        int kullaniciSayilari[] = new int[sayi];

        double ortalama = 0;
        for (int i = 0; i < sayi; i++) {
            System.out.println("Sayi giriniz :");
            kullaniciSayilari[i] = tara.nextInt();
            ortalama = ortalama + kullaniciSayilari[i];
        }

        ortalama = ortalama/kullaniciSayilari.length;
        System.out.println("Ortalama "+ortalama);
    }
}
