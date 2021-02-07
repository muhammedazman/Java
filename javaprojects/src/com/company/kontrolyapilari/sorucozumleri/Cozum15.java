package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum15 {

    //asal mi degil mi
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Üst siniri giriniz");
        int girilenUstSinir = tara.nextInt();
        boolean asalMi = true;

        for (int i = 2; i <= girilenUstSinir; i++) {

            asalMi = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi)
                System.out.print(i + ", ");
        }
    }
}
