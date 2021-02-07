package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum2 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci kenari giriniz:");
        int birinciKenar = tara.nextInt();

        System.out.println("Ikinci kenari giriniz:");
        int ikinciKenar = tara.nextInt();

        System.out.println("Ücüncü kenari giriniz:");
        int ucuncuKenar = tara.nextInt();

        if (birinciKenar == ikinciKenar && birinciKenar == ucuncuKenar) {
            System.out.println("Es Kenar Ücgen");
        } else if (birinciKenar != ikinciKenar && birinciKenar != ucuncuKenar && ikinciKenar != ucuncuKenar) {
            System.out.println("Cesit Kenar Ucgen");
        } else {
            System.out.println("Ikiz Kenar Ücgen");
        }
    }
}
