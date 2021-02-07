package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum9 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        int notDegeri, notSiniri = 0;

        System.out.println("Notunuzu giriniz");
        notDegeri = tara.nextInt();

        notSiniri = notDegeri / 10;

        if (notDegeri == 100) { notSiniri = 9; }

        switch (notSiniri) {
            case 9:
                System.out.println("notunuz AA");
                break;
            case 8:
                System.out.println("notunuz BA");
                break;
            case 7:
                System.out.println("notunuz BB");
                break;
            case 6:
                System.out.println("notunuz CB");
                break;
            case 5:
                System.out.println("notunuz CC");
                break;
            default:
                System.out.println("notunuz CC nin altinda");
        }
    }
}
