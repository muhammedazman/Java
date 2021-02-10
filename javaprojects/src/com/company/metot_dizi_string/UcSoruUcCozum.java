package com.company.metot_dizi_string;

import java.util.Scanner;

public class UcSoruUcCozum {

    /**
     * //SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
     *     // Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.
     *
     *     //SORU 2: Decimal sayıları binary formatına çeviren java programını yazınız.
     *     //Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.
     *
     *     //SORU 3: küçük xlerle büyük X şekli çizen programı yazınız.
     *         //Mesela satır sayısı olarak 5 alan program şunu yazmalı
     *
     * X     X
     *  X   X
     *    X
     *  X   X
     * X     X
     * */

    public static void main(String[] args) {

        //Cozum 1
        int[][] matrix = new int[5][5];
        int genelToplam = 0;

        for (int i = 0; i < 5; i++) {//satir

            for (int j = 0; j < 5; j++) {//sutun
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            genelToplam += matrix[i][i];
            System.out.println();
        }

        System.out.println("Capraz elemanlarin genel toplami: " + genelToplam);


        //Cozum 2
        Scanner tara = new Scanner(System.in);

        System.out.println("Sayiyi giriniz!");
        int girilenSayi = tara.nextInt();
        String binarySayi = "";

        if (girilenSayi == 0) {
            binarySayi = "0";
        }

        while (girilenSayi > 0) {

            int mod = girilenSayi % 2;
            binarySayi = mod + binarySayi;
            girilenSayi = girilenSayi / 2;
        }

        System.out.println("Sayinin binary hali: "+binarySayi);

        //Cozüm 3
        Scanner tara2 = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz!");
        int satirSayisi = tara2.nextInt();
        int tersYon=satirSayisi;
        for (int i = 0; i < satirSayisi; i++) {
            tersYon--;
            for (int j = 0; j < satirSayisi; j++) {
                if (i==j || j == tersYon){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
