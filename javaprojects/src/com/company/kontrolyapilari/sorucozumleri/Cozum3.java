package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum3 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        double vize, finalNotu;
        double ortalama;

        System.out.println("Vize notunuzu giriniz:");
        vize = tara.nextDouble();

        System.out.println("Final notunuzu giriniz:");
        finalNotu = tara.nextDouble();

        ortalama = vize * 0.4/*yüzde 40*/ + finalNotu * 0.6 /*yüzde 60*/;

        if (ortalama > 50) {
            System.out.println("Dersi gectiniz ortalamaniz = "+ortalama);
        } else {
            System.out.println("Dersi gecemediniz ortalamaniz = "+ortalama);
        }

    }
}
