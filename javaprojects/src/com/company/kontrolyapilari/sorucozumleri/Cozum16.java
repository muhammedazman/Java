package com.company.kontrolyapilari.sorucozumleri;

public class Cozum16 {

    //1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 =?
    public static void main(String[] args) {

        int artis = 0;
        boolean artiyorMu = true;

        int toplam = 0;

        for (int i = 1; i <= 35; i=i+artis) {
            System.out.print(i + " ");

            toplam += i;

            if (artis <= 4 && artiyorMu == true) {
                artis++;

                if (artis == 5) {
                    artiyorMu = false;
                    continue;//döngü calismaya devam etsin, ama burdan cik demek oluyor
                }
            }
            else {
                artis--;

                if(artis == 1) {
                    artiyorMu = true;
                    continue;
                }
            }
        }

        System.out.println("\nToplam = " + toplam);
    }
}
