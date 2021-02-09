package com.company.metot_dizi_string;

public class DiziKarmaSiralamaArama {

    public static void main(String[] args) {
        int sayilar[] = {1, 9, 5, 7, 19, 60, 120, 55, -9};

        //diziYazdir(sayilar);
        diziYerDegistir(sayilar);
        diziYazdir(sayilar);
        System.out.println();
        selectionSortSiralama(sayilar);
        diziYazdir(sayilar);

        int sonucIndex = binarySearch(sayilar, 120);
        System.out.println("\nAranan Elemanin Index Deger: " + sonucIndex);
    }

    private static int binarySearch(int[] dizi, int aranacakEleman) {
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;

        while (enYuksekIndex >= enDusukIndex) {

            int ortaIndex = (enYuksekIndex + enDusukIndex) / 2;

            if(aranacakEleman < dizi[ortaIndex]) {
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }

        return -enDusukIndex - 1;
    }

    private static void selectionSortSiralama(int[] dizi) {

        for (int i = 0; i < dizi.length; i++) {

            //en kücük elemanin ve indexinin bulunmasi
            int oankienKucukSayi = dizi[i];
            int oankiEnKucukElemanIndex = i;

            for (int j = i+1; j < dizi.length; j++) {

                if(oankienKucukSayi > dizi[j]) {
                    oankienKucukSayi = dizi[j];
                    oankiEnKucukElemanIndex = j;
                }
            }

            if(oankiEnKucukElemanIndex != i) {
                dizi[oankiEnKucukElemanIndex] = dizi[i];
                dizi[i] = oankienKucukSayi;
            }
        }
    }

    private static void diziYerDegistir(int[] dizi) {
        for (int i = dizi.length - 1; i > 0 ; i--) {

            int rastgeleIndex = (int)(Math.random() * (i+1));
            int geciciEleman = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex]=geciciEleman;
        }
    }

    private static void diziYazdir(int[] dizi) {
        System.out.println("Original: 1, 9, 5, 7, 19, 60, 120, 55, -9");
        for (int i:dizi) {
            System.out.print(i + ", ");
        }
    }
}
